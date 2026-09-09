import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args)throws IOException {
        try(ServerSocket ss=new ServerSocket(8888)){
            System.out.println("服务端已经启动等待连接...");
            try (Socket s=ss.accept()){
                System.out.println("客户端已连接"+s.getInetAddress());
                OutputStream os=s.getOutputStream();
                String msg="欢迎";
                os.write(msg.getBytes(StandardCharsets.UTF_8));
                System.out.println("已发送消息："+msg);
            }
        }
    }
}
