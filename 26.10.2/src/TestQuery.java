import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestQuery {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn=JDBCUtils.getConnection();
            String sql="select id,name,price,origin,stock FROM product WHERE id=? ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,1);
            rs=pstmt.executeQuery();
            while(rs.next()){
                Product p=new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                p.setOrigin(rs.getString("origin"));
                p.setStock(rs.getInt("stock"));
                System.out.println(p);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,pstmt,rs);
        }
    }
}
