import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server{

    public static void charServer() {
        // 创建服务端套接字
        ServerSocket server = null;
        try {
            server = new ServerSocket(50000);
            //获取客户端的套接字实例
            Socket client=server.accept();
            System.out.println(client);

            try(
                    BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
                    PrintWriter pw=new PrintWriter(new OutputStreamWriter(client.getOutputStream()),true)
            )
            {
                String clientMessage=br.readLine();//接收客户端信息
                /**
                 * 首先得判定数据格式是否正确
                 *
                 * 此处需要把这个String类型转换成int数组类型
                 */
                System.out.println("client:"+clientMessage);
                String[] strArray = clientMessage.split(",");//将String类型的数字转换成数组
                boolean bl = false;
                try {
                    for(String i:strArray) {
                        Integer.parseInt(i);
                    }
                } catch (Exception e) {
                    bl = true;
                    e.printStackTrace();
                }
                if(!bl) {
                    //此处需要将数组转成字符串
                    Arrays.sort(strArray);
                    String sortArrayMs = "";
                    for(String i:strArray) {
                        System.out.println(i);
                        sortArrayMs += i;
                    }
                    pw.println(sortArrayMs);
                }
                /* pw.flush(); */
            }catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        charServer();
    }
}