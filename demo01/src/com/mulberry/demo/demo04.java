package com.mulberry.demo;

import com.mulberry.entity.Student;
import org.omg.CORBA.Object;

import java.io.*;
import java.util.*;

public class demo04 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(001,"zs","1999.3.3");
        Student student2 = new Student(002,"ls","1998.3.3");
        list.add(student1);
        list.add(student2);
        try {
//            addfile(list);
              outfile();
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //将实体对象存入到文件中
    public  static  void addfile(List<Student> list) throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("F:\\demo\\ddd.txt"));
        os.writeObject(list);
        os.close();
    }
    //将文件中的对象实例显示到控制台
    public static  void outfile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\demo\\ddd.txt"));
        List<Student> l = (List<Student>)ois.readObject();
        for (Student list:l
             ) {
            System.out.println(list);
        }
//        System.out.println(o);
        ois.close();
    }

}
