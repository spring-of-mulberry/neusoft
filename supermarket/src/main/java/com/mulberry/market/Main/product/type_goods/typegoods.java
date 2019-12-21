package com.mulberry.market.Main.product.type_goods;


import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Entity.goodsinfo;
import com.mulberry.market.Main.manager.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//通过库存类别查询数据
public class typegoods {

    productController productController1 = new productController();
    List<goodsinfo> list1 = new ArrayList<goodsinfo>();
//    productController productController2 = new productController();
//    List<goodsinfo> list2 = new ArrayList<goodsinfo>();
    public void type_goods(){
        System.out.println("************商品分类管理**************");
        select_type();

    }
    public void select_type(){
        while (true) {
            System.out.println("请输入商品类别（1食物，2衣服，3住房，4骑行）：");
            String str = new Scanner(System.in).next();
            boolean flag = RegExpUtil.checkDigit(str);
            if (!flag) {//不是数字
                System.out.println("输入的商品类别有误！，请重新输入！");
                select_type();
                break;
            } else {
                int int1 = Integer.parseInt(str);
                list1 = productController1.type_goods(int1);
                if (list1.size()>0){//类别存在
                    System.out.println("(商品条码，商品类别，商品单位，商品名称，采购价格，库存量)");
                    for (int i = 0; i <list1.size() ; i++) {
                        goodsinfo g = list1.get(i);
                        System.out.println(g.getGoodscode()+"\t"+g.getGoodstype()+"\t"+g.getGoodssunit()+"\t"+g.getGoodsname()+"\t"+g.getGoodsprice()+"\t"+g.getGoodstock());
                    }
                    break;
                }else {
                    System.out.println("商品类别不存在！请重新输入！");
                    select_type();
                    break;
                }

            }
        }
        System.out.println("按任意键返回到主菜单：");
        String e = new Scanner(System.in).next();
        if (e!=null){
            manager manager = new manager();
            manager.manager_UI();
        }else{
            manager manager1 = new manager();
            manager1.manager_UI();
        }
    }
}
