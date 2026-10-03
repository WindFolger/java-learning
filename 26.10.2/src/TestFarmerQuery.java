import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TestFarmerQuery {
    public static void main(String[] args) {
        ArrayList<farmer> farmers = findFarmerByName("小");
        for (farmer f : farmers) {
            System.out.println(f);
        }
    }
    public static ArrayList<farmer> findFarmerByName(String name) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<farmer> list = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            String sql = "SELECT id, name, phone, 存款 AS balance FROM farmer WHERE name LIKE ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                farmer farmer = new farmer();
                farmer.setId(rs.getInt("id"));
                farmer.setName(rs.getString("name"));
                farmer.setPhone(rs.getString("phone"));
                farmer.setBalance(rs.getDouble("balance"));
                list.add(farmer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, pstmt, rs);
        }
        return list; // 返回集合
    }
}