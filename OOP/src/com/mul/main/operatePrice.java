package com.mul.main;

import com.mul.entity.Price;
import com.mul.entity.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class operatePrice {
    public static void operate()  {
        //选择商品号判断是否促销
        List<Product> lists = getProduct.getProduct();
        Product product = new Product();
        int bh ;
        Product pro= null;
        System.out.println("请选择你要修改的商品编号：");
        System.out.println("编号：");
        bh = new Scanner(System.in).nextInt();
        while (true) {
            for (Product p : lists
                    ) {
                if (bh== p.getPid()) {

                    pro = p;
//                lists.remove(p);
//                System.out.println(pro.getPname());
                    break;
                }
            }
            if (pro == null) {
                System.out.println("编号输入有误！请重新输入！");
                System.out.println("编号：");
                bh = new Scanner(System.in).nextInt();
            } else {
                break;
            }
        }
        product.setPid(pro.getPid());
        product.setPname(pro.getPname());
        product.setPdate(pro.getPdate());
        product.setCx(pro.isCx());
        product.setPprice(pro.getPprice());
        //判断价格
        double iprice;
        while (true){
            System.out.println("输入商品促销价格：");
            iprice = new Scanner(System.in).nextDouble();
            if (iprice>pro.getPprice()){
                System.out.println("促销价格比原价高");
            }else {
                break;
            }
        }
        product.setSprice(iprice);
        System.out.println(product.getSprice());
        //修改促销时间
        System.out.println("输入促销开始时间:(yyyy-MM-dd)");
        String starttime = new Scanner(System.in).next();
        //判断促销结束时间
        String endtime;
        Date sdate,edate;
        while(true){
            System.out.println("输入促销结束时间:(yyyy-MM-dd)");
            endtime = new Scanner(System.in).next();
            try {
                sdate = new SimpleDateFormat("yyyy-MM-dd").parse(starttime);
                edate = new SimpleDateFormat("yyyy-MM-dd").parse(endtime);
                int i = sdate.compareTo(edate);
                if(i==1){
                    System.out.println("结束时间在开始时间之前，请重新输入！");
                }else{
                    break;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        product.setStarttime(starttime);
        product.setEndtime(endtime);
        System.out.println("修改结果：");
        System.out.println("商品编号\t商品名称\t商品保修时间(年)\t商品价格\t是否促销\t促销价格\t促销开始时间\t促销结束时间");
        System.out.println(product.getPid()+"\t\t"+product.getPname()+"\t\t"+product.getPdate()+"\t\t\t\t"+product.getPprice()+"\t\t"+product.isCx()+"\t\t"+product.getSprice()+"\t\t"+product.getStarttime()+"\t\t"+product.getEndtime());
        System.out.println("输入操作序号：（1返回到菜单，2查看商品信息，0退出系统）");
        System.out.println("操作序号：");
        String n = new Scanner(System.in).next();
        while (true) {
            if (n.equals("1")) {
                //返回到菜单
                Main.showMenu();
                break;
            } else if (n.equals("2")) {
                //查看商品
                showPro.showProducts();
                break;
            } else if (n.equals("0")) {
                System.out.println("您已经退出商品信息系统！");
                break;
            } else {
                System.out.println("您输入的操作号有误！请重新输入！");
                System.out.println("操作序号（数字）：");
                n = new Scanner(System.in).next();
            }
        }
//        lists.add(product);

//        return  product;
    }
}
