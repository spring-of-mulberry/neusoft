package com.mulberry.demo;

import java.io.*;

public class demo02 {
    public static void main(String[] args) {
        File f = new File("F:\\demo\\aaa.txt");
        File fs = new File("F:\\demo\\bbb.txt");
        if (f.exists()){
            try {
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream(fs);
                byte[] bt= new byte[1024];

                int i = 0;
                while ((i=fis.read(bt))!=-1){
                    fos.write(bt,0,i);
                }
                fis.close();
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件传输成功");
        }else{
            System.out.println("文件不存在");
        }
    }

}
