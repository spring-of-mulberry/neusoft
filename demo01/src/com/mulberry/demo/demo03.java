package com.mulberry.demo;

import java.io.*;

public class demo03 {
    public static void main(String[] args) {
        File file = new File("F:\\demo\\test.txt");
        File file1 = new File("F:\\demo\\ccc.txt");

        try {
            if (!file.exists()){
                file.createNewFile();
            }
            //实现
//            writefile(file);
            alterfile(file,file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //修改字符串后存入到另一个文件中
    public static void alterfile(File file,File file1) throws IOException {
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(file1);
        //将char类型数组转化为String类型，再将string转化为char做判断后存入文件中
        char[] ch = new char[1024];
        int str = 0;
        String s="";
        while((str=fr.read(ch))!=-1){
             s = new String(ch,0,str);
        }
        char[] c =  s.toCharArray();
        for (int i=0;i<c.length;i++){
            if (c[i]=='l'){
                c[i]='L';
            }
        }
        fw.write(c);
        System.out.println("已将test文件中的字符修改后传入ccc文件中");
        fr.close();
        fw.close();

    }
    //将字符串存入到文件中
    public  static void writefile(File file) throws IOException {
        FileWriter fw = new FileWriter(file);
        String str = "hello,world";
        fw.write(str);
        System.out.println("字符串已写入到test.txt文件中");
        fw.close();

    }


}
