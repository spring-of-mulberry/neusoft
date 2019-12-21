package com.mulberry.market.Main.product.product_look;

import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Entity.goodsinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class select_product {
    Scanner in = new Scanner(System.in);
    //查看所有的库存数据
    productController controller1 = new productController();//查询所有数据
    List<goodsinfo> list1 = new ArrayList<goodsinfo>();//查询所有数据
    public void selectproduct(){
        list1 = controller1.all_goods();
        System.out.println("(商品条码，商品类别，商品单位，商品名称，采购价格，库存量)");
        for (goodsinfo g :list1
             ) {
            System.out.println(g.getGoodscode()+"\t"+g.getGoodstype()+"\t"+g.getGoodssunit()+"\t"+g.getGoodsname()+"\t"+g.getGoodsprice()+"\t"+g.getGoodstock());
        }
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            operate_product operate_product1 = new operate_product();
            operate_product1.operateproduct();
        }else{
            operate_product operate_product1 = new operate_product();
            operate_product1.operateproduct();
        }
    }
    //根据商品条码查询一条记录
    productController controller2 = new productController();//通过商品条码查询库存表数据
    List<goodsinfo> list2 = new ArrayList<goodsinfo>();//通过商品条码查询库存表数据
    String str1;
    public void selectproductBycode(){
        while (true) {
            System.out.println("请输入商品条码（例:s001）：");
            str1 = in.next();
            list2 = controller2.in_goods(str1);
            if (list2.size()>0) {
                //进货表中存在该商品可以进行查询操作
                System.out.println("(商品条码，商品类别，商品单位，商品名称，采购价格，库存量)");
                for (goodsinfo g :list2
                        ) {
                    System.out.println(g.getGoodscode()+"\t"+g.getGoodstype()+"\t"+g.getGoodssunit()+"\t"+g.getGoodsname()+"\t"+g.getGoodsprice()+"\t"+g.getGoodstock());
                }
                break;
            } else {
                System.out.println("输入的商品条码不存在库存表中!请重新输入！");
                selectproductBycode();
                break;
            }
        }
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            operate_product operate_product1 = new operate_product();
            operate_product1.operateproduct();
        }else{
            operate_product operate_product1 = new operate_product();
            operate_product1.operateproduct();
        }
    }
}
