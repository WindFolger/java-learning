import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBUtil {
    public static int update(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // 1. 获取连接
            conn = JDBCUtils.getConnection();
            // 2. 获取预编译对象
            pstmt = conn.prepareStatement(sql);
            // 3. 遍历 params 数组，给 ? 赋值（用 setObject 自动适配类型）
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]); // ★ 注意：JDBC 索引从 1 开始
            }
            // 4. 执行并返回结果
            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e); // 实际开发中可能抛自定义异常
        } finally {
            // 5. 释放资源
            JDBCUtils.close(conn, pstmt);
        }
    }
}