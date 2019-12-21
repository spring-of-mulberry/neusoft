package com.mulberry.Socket.demo01;

import java.io.*;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args)  {
        System.out.println("欢迎来到服务端！");
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(8555);
            Socket socket = ss.accept();
            try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));) {

                String str = br.readLine();
                System.out.println("客户端传到服务端的乱字符串为"+str);
                String[] strs = str.split(" ");
                //判断数据格式是否正确
                boolean flag = false;
                try {
                    for (String s:strs
                            ) {
                        Integer.parseInt(s);
                    }
                }catch (Exception e){
                    flag = true;
                    e.printStackTrace();
                }
                //排序，将数组转化成排序好后的字符串
                String as ="";
                if (!flag){
                    //排序
                    Arrays.sort(strs);
                    //将数组转化成字符串
                    for (String s:strs
                            ) {
                        as +=s;
                    }
                    pw.println(as);
                }
                System.out.println("排序好的字符串为"+as);
                //将排序好的字符串传到客户端
//        pw.write(as);

                pw.close();
                br.close();
                socket.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
