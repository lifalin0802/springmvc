import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

//阻塞I/O
public class PlainOioServer {
    public  static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9000);
        while(true){
            Socket clientsocket = socket.accept();
            System.out.println("has client connected");
            handler(clientsocket);
        }
    }

    private static void handler(Socket clientsocket) throws IOException {
        byte[] b = new byte[1024];
        System.out.println("ready for read..");
        int read = clientsocket.getInputStream().read(b);
        System.out.println("finish read");
        if(read != -1){
            System.out.println("recieved from client: "+ new String(b,0,read));
        }
    }
}