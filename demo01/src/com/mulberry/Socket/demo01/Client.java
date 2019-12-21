package com.mulberry.Socket.demo01;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("欢迎来到客户端！");
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",8555);
            try (OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
                 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
                PrintWriter pw = new PrintWriter(osw);
                pw.println("12 34 54 32 67 45");
//        pw.write("12 34 54 32 67 45");
                //从服务端读到客户端的排序后的数组
                String str = br.readLine();
                System.out.println("排序后的数组为"+str);
                br.close();
                osw.close();
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

