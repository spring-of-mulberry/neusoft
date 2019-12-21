package com.mulberry.demo;

import java.io.File;
import java.io.IOException;
/*
 * 输出一个文件夹中所有的文件
 */
public class demo01 {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File("F:\\demo");
        outp(file);

    }
    //输出所有的文件
    public static void outp(File f){

        File[] file = f.listFiles();
        for (File file1:file) {
            if (file1.isDirectory()){
                outp(file1);
            }else{
                System.out.println("文件名："+file1.getName());
                System.out.println("路径名："+file1.getPath());
                System.out.println("=========================");
            }
        }

    }
}
