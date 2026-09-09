import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        try(Socket s=new Socket("127.0.0.1",8888)){
            InputStream in=s.getInputStream();
            byte[] buf=new byte[1024];
            int len=in.read(buf);
            String res=new String(buf,0,len, StandardCharsets.UTF_8);
            System.out.println("客户端收到："+res);
        }
    }
}
