package com.mulberry.market.Main.product.product_into;

import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Controller.purchases.purchaseController;
import com.mulberry.market.Controller.supplier.supplierController;
import com.mulberry.market.Entity.goodsinfo;
import com.mulberry.market.Entity.purchase;
import com.mulberry.market.Entity.supplier;
import com.mulberry.market.Main.login.login;
import com.mulberry.market.Main.manager.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//商品入库操作
public class productall {
    Scanner in  = new Scanner(System.in);
    //显示可入库的商品
    purchaseController p1 = new purchaseController();//用来查询总数据
    List<purchase> purchse1 = new ArrayList<purchase>();//用来存放总查询得到的数据
    public void product_purchaseall(){
        System.out.println("可入库的商品列表：");
        System.out.println("(进货流水号\t商品条码\t商品名称\t进货时间\t进货总数\t进货价格\t供应商号)");
        purchse1 = p1.select_purchaseall();
        for (purchase p :purchse1
                ) {
            System.out.println(p.getPurchaseid()+"\t"+p.getGoodscode()+"\t"+p.getGoodsname()+"\t"+p.getPurchasetime()+"\t"+p.getPurchaseocunt()+"\t"+p.getPurchaseprice()+"\t"+p.getSupplierno());
        }
        System.out.println("是否添加商品到库存表(是（Y/y），否（任意键）)");
        String ss = in.next();
        if(ss.equals("Y")||ss.equals("y")){
            is_product();
        }else{
            manager manager = new manager();
            manager.manager_UI();
        }
    }
    //判断该商品是否能入库（是否有该商品条码，判断之前有没有入库）
    //根据商品条码查询一条记录
    purchaseController p2 = new purchaseController();//通过商品条码查询采购表数据
    List<purchase> purchase2 = new ArrayList<purchase>();//通过商品条码查询采购表数据
    productController goods1 = new productController();//通过商品条码查询数据
    List<goodsinfo> list1 = new ArrayList<goodsinfo>();//通过商品条码查询数据
    String str1;
    public void is_product(){
        while (true) {

            System.out.println("请输入要入库的商品条码（例:s001）：");
            str1 = in.next();
            purchase2 = p2.select_purchaseBycode(str1);
            if (purchase2.size()>0) {
                //进货表中存在该商品可以进行入库操作
                //通过条码判断库存表中是否存在有该商品
                list1 = goods1.in_goods(str1);
                if (list1.size()>0){
                    System.out.println("该商品已经存入库存表中！请重新输入一个商品条码！");
                    is_product();
                    break;
                }else{
                    into_product();
                }
            } else {
                System.out.println("输入的商品条码不存在进货表中，不能入库！请重新输入！");
                is_product();
                break;
            }
        }
    }
    //商品入库操作
    purchaseController p3 = new purchaseController();//通过商品条码查询采购表数据
    List<purchase> purchase3 = new ArrayList<purchase>();//通过商品条码查询采购表数据
    supplierController s6 = new supplierController();//通过供应商号查找数据
    List<supplier> list6 = new ArrayList<supplier>();//通过供应商号查找的数据
    supplier supplier6 = new supplier();
    productController goods2 = new productController();//添加商品
    goodsinfo g = new goodsinfo();
    public void  into_product(){
        purchase3 = p3.select_purchaseBycode(str1);
        //商品条码
        g.setGoodscode(purchase3.get(0).getGoodscode());
        //操作员号
        login login = new login();
        int uno = login.publicname;
        g.setUserno(uno);
        //商品类别
        while (true) {
            System.out.println("请输入商品类别（1食物，2衣服，3住房，4骑行）：");
            String str4 = in.next();
            boolean b = RegExpUtil.checkDigit(str4);
            if(!b){
                System.out.println("输入的进货数量有错误！请重新输入！");
            }else{
                int int4 = Integer.parseInt(str4);
                g.setGoodstype(int4);
                break;
            }
        }
        //商品单位
        supplier6.setSupplierno(purchase3.get(0).getSupplierno());
        list6 = s6.selectsupplierByno(supplier6);//查询商品单位（供应商单位）
        g.setGoodssunit(list6.get(0).getSuppliername());
        //商品名称
        g.setGoodsname(purchase3.get(0).getGoodsname());
        //报警数
        g.setGoodsalarm(10);
        //采购价格
        g.setGoodsprice(purchase3.get(0).getPurchaseprice());
        //库存量
        g.setGoodstock(purchase3.get(0).getPurchaseocunt());
        goods2.insert_goods(g);
        System.out.println("成功添加商品到库存表中！");
        System.out.println("是否继续添加商品到库存表(是（Y/y），否（任意键）)");
        String ss = in.next();
        if(ss.equals("Y")||ss.equals("y")){
            product_purchaseall();
        }else{
            manager manager = new manager();
            manager.manager_UI();
        }
    }





}
