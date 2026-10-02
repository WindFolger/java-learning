import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    static {
        try{
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties prop = new Properties();
            prop.load(is);
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            driver = prop.getProperty("driver");
            Class.forName(driver);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection()throws Exception{
        return DriverManager.getConnection(url,user,password);
    }
    public static void close(Connection conn, Statement stmt){
        close(conn,stmt,null);
    }
    public static void close(Connection conn,Statement stmt,ResultSet rs){
        if(rs != null){
            try{rs.close();}catch(Exception e){throw  new RuntimeException(e);}
        }
        if(stmt != null){
            try{stmt.close();}catch(Exception e){throw  new RuntimeException(e);}
        }
        if(conn != null){
            try{conn.close();}catch(Exception e){throw  new RuntimeException(e);}
        }
    }
}
