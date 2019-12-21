package com.mulberry.market.Main.purchases;

import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.purchases.purchaseController;
import com.mulberry.market.Controller.supplier.supplierController;
import com.mulberry.market.Entity.purchase;
import com.mulberry.market.Entity.supplier;
import com.mulberry.market.Main.manager.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class purchases {
    Scanner in = new Scanner(System.in);
    public void purchase_all(){
        System.out.println("**********进货信息报表************");
        System.out.println("1.查询进货总记录");
        System.out.println("2.查询单个进货信息");
        System.out.println("3.进货");
        System.out.println("4.返回到管理员系统");
        System.out.println("*******************************");
        purchase_select();
    }
    //选择
    public void purchase_select(){
        System.out.println("选择操作序号：");
        String str = in.next();
        if (str.equals("1")){
            System.out.println("查看进货总记录！");
            select_purchaseall();
        }else if (str.equals("2")){
            System.out.println("查看单个进货信息！");
            select_purchaseBycode();
        }else  if (str.equals("3")){
            System.out.println("进货！");
            insert_purchase();
        }else  if (str.equals("4")){
            System.out.println("返回到管理员系统！");
            manager manager = new manager();
            manager.manager_UI();
        }else{
            System.out.println("输入的序号有误！请重新输入！！");
            purchase_select();
        }
    }


    //查询进货总记录
    purchaseController p1 = new purchaseController();//用来查询总数据
    List<purchase> purchse1 = new ArrayList<purchase>();//用来存放总查询得到的数据
    public void select_purchaseall(){
        System.out.println("(进货流水号\t商品条码\t商品名称\t进货时间\t进货总数\t进货价格\t供应商号)");
        purchse1 = p1.select_purchaseall();
        for (purchase p :purchse1
             ) {
            System.out.println(p.getPurchaseid()+"\t"+p.getGoodscode()+"\t"+p.getGoodsname()+"\t"+p.getPurchasetime()+"\t"+p.getPurchaseocunt()+"\t"+p.getPurchaseprice()+"\t"+p.getSupplierno());
        }
        System.out.println("以上是所有的进货数据！自动跳转到进货信息表系统");
        purchase_all();
    }


    //根据商品条码查询一条记录
    purchaseController p2 = new purchaseController();//用来查询总数据
    List<purchase> purchase2 = new ArrayList<purchase>();//用来存放总查询得到的数据
    public void select_purchaseBycode(){
        selectByno();
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            purchase_all();
        }else{
            purchase_all();
        }
    }
    public void selectByno(){
        while (true) {
            System.out.println("请输入要查询的商品条码（例:s001）");
            String str1 = new Scanner(System.in).next();
            purchase2 = p2.select_purchaseBycode(str1);
            if (purchase2.size()>0) {
                purchase pur = purchase2.get(0);
                System.out.println("(进货流水号\t商品条码\t商品名称\t进货时间\t进货总数\t进货价格\t供应商号)");
                System.out.println(pur.getPurchaseid() + "\t" + pur.getGoodscode() + "\t" + pur.getGoodsname() + "\t" + pur.getPurchasetime() + "\t" + pur.getPurchaseocunt() + "\t" + pur.getPurchaseprice() + "\t" + pur.getSupplierno());
                break;
            } else {
                System.out.println("输入的商品条码错误或不存在进货表中！请重新输入！");
                selectByno();
                break;
            }
        }
    }


    //进货
    purchase pp1= new purchase();//存储进货信息
    purchaseController purchaseController1 = new purchaseController();//进货
    purchaseController purchaseController2 = new purchaseController();//根据商品编号查询数据
    List<purchase> pp2 = new ArrayList<purchase>();//根据商品编号查询数据
    public void insert_purchase() {
        //商品条码
        while (true) {
            System.out.println("请输入添加的商品条码(例：s001)：");
            String str1 = in.next();
            pp2 = purchaseController2.select_purchaseBycode(str1);
            if (pp2.size() > 0) {
                System.out.println("该商品条码已存在！请重新输入！");
            }else{
                pp1.setGoodscode(str1);
                break;
            }
        }
        //商品名称
        System.out.println("请输入添加的商品名称：");
        String str2 = in.next();
        pp1.setGoodsname(str2);
        //进货时间
        while (true) {
            System.out.println("请输入添加的商品的进货时间（yyyy-MM-dd）：");
            String str3 = in.next();
            boolean flag = isValidDate(str3);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if (flag) {
                try {
                    Date da = simpleDateFormat.parse(str3);
                    java.sql.Date d = new java.sql.Date(da.getTime());
                    pp1.setPurchasetime(d);
                } catch (ParseException e) {
                }
                break;
            } else {
                System.out.println("进货时间输入的格式不对！请重新输入！");
            }
        }
        //进货数量
        while (true) {
            System.out.println("请输入进货数量：");
            String str4 = in.next();
            boolean b = RegExpUtil.checkDigit(str4);
            if(!b){
                System.out.println("输入的进货数量有错误！请重新输入！");
            }else{
                int int4 = Integer.parseInt(str4);
                pp1.setPurchaseocunt(int4);
                break;
            }
        }
        //进货价格
        while (true){
            System.out.println("请输入添加的进货价格：");
            String str5 = in.next();
            boolean b1 = RegExpUtil.checkDecimals(str5);
            if (!b1){
                System.out.println("输入的进货价格不对！请重新输入！");
            }else{
                double double5 = Double.parseDouble(str5);
                pp1.setPurchaseprice(double5);
                break;
            }
        }
        //供应商号
        addsupplier();
        purchaseController1.insert_purchase(pp1);
        System.out.println("进货数据插入成功！！！！");
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            purchase_all();
        }else{
            purchase_all();
        }
    }
    //插入供应商
    supplierController sc = new supplierController();//查询所有的供应商
    List<supplier> list1 = new ArrayList<supplier>();//查询所有的供应商
    supplier sup1 = new supplier();//查询所有的供应商
    public void addsupplier(){
        //判断有没有该供应商
        while (true){
            System.out.println("输入要插入的供应商号（例:4001）");
            String str6 = in.next();
            boolean b2 = RegExpUtil.checkDigit(str6);
            if (!b2){
                System.out.println("输入的供应商号格式不对!!请重新输入!");
                addsupplier();
                break;
            }else{
                int int6 = Integer.parseInt(str6);
                sup1.setSupplierno(int6);
                list1 = sc.selectsupplierByno(sup1);//查询结果
                if (list1.size()>0){
                    pp1.setSupplierno(int6);
                    break;
                }else{
                    System.out.println("供应商表中没有该供应商！请重新输入一个供应商号！");
                    addsupplier();
                    break;
                }
            }






        }
    }
    //判断时间格式
    public boolean isValidDate(String str){
        boolean conver = true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.setLenient(false);
            sdf.parse(str);
        } catch (ParseException e) {
            conver = false;
        }
        return conver;
    }
}
