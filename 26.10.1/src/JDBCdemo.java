import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCdemo {
    public static void main(String[] args) throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/farm";
        Properties p = new Properties();
        p.setProperty("user","root");
        p.setProperty("password","root");
        Connection conn = driver.connect(url,p);

        String sql = "select * from product";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double price = rs.getDouble("price");
            String origin = rs.getString("origin");
            int stock = rs.getInt("stock");

            System.out.println("ID: " + id + ", 名称: " + name + ", 价格: " + price+",产地："+origin+",库存："+stock);
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
