package com.mulberry.market.Main.product.in_out_operate;

import com.mulberry.market.Controller.operate.operateController;
import com.mulberry.market.Entity.goodsoperater;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class in_out_select {
    operateController operateController1 = new operateController();//查看上架商品集合
    List<goodsoperater> list1 = new ArrayList<goodsoperater>();
    public void inoutselect(){
        list1 = operateController1.see_all();
        System.out.println("**********上下架商品信息表*************");
        System.out.println("(商品条码，商品名称，上架时间，上架价格，商品状态)");
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i).getBarcode()+"\t"+list1.get(i).getGoodsname()+"\t"+list1.get(i).getOnsaledate()+"\t"+list1.get(i).getOnsaleprice()+"\t"+list1.get(i).getState());
        }
        System.out.println("按任意键返回到主菜单：");
        String e = new Scanner(System.in).next();
        if (e!=null){
            in_and_out in_and_out = new in_and_out();
            in_and_out.inandout();
        }else{
            in_and_out in_and_out = new in_and_out();
            in_and_out.inandout();
        }
    }
}
