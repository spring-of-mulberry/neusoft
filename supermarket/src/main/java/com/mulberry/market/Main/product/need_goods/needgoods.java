package com.mulberry.market.Main.product.need_goods;

import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Entity.goodsinfo;
import com.mulberry.market.Main.manager.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//缺货记录报表
public class needgoods {
    productController productController1 = new productController();//查看库存总数
    List<goodsinfo> list1 = new ArrayList<goodsinfo>();//查看库存总数
    productController productController2 = new productController();//获取缺货集合
    List<goodsinfo> list2 = new ArrayList<goodsinfo>();//获取缺货集合
    public void need_goods(){
        System.out.println("************缺货记录报表**************");
        list1 = productController1.all_goods();
        System.out.println("(商品条码，商品类别，商品单位，商品名称，采购价格，库存量)");
        for (int i = 0; i <list1.size() ; i++) {
            String sss = list1.get(i).getGoodscode();//库存总数，记录每个商品条码
            list2 = productController2.need_goods(sss);//获取缺货记录
            if (list2.size()>0){
                goodsinfo g = list2.get(0);
                //缺货
                System.out.println(g.getGoodscode()+"\t"+g.getGoodstype()+"\t"+g.getGoodssunit()+"\t"+g.getGoodsname()+"\t"+g.getGoodsprice()+"\t"+g.getGoodstock());
            }else{
                continue;
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
