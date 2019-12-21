package com.mulberry.market.Main.product.product_look;

import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Entity.goodsinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class do_product {
    Scanner in = new Scanner(System.in);
    //根据商品条码修改数据
    productController controller1 = new productController();//查询数据是否存在
    List<goodsinfo> list1 = new ArrayList<goodsinfo>();//查询数据是否存在
    String str1;
    public void updateproductBycode(){
        while (true) {
            System.out.println("请输入要修改的商品条码（例:s001）：");
            str1 = in.next();
            list1 = controller1.in_goods(str1);
            if (list1.size()>0) {
                //进货表中存在该商品可以进行修改操作
                updateBycode();
                break;
            } else {
                System.out.println("输入的商品条码不存在库存表中!请重新输入！");
                updateproductBycode();
                break;
            }
        }
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            operate_product operate_product = new operate_product();
            operate_product.operateproduct();
        }else{
            operate_product operate_product = new operate_product();
            operate_product.operateproduct();
        }

    }
    //修改库存数据
    productController controller3 = new productController();
    public void updateBycode(){
        //商品类别
        while (true) {
            System.out.println("请输入要修改的商品类别（1食品，2衣服，3住房，4骑行）：");
            String s1 = in.next();
            boolean f = RegExpUtil.checkDigit(s1);
            if (!f) {
                System.out.println("商品类别输入有误！请重新输入（数字）！");
                updateBycode();
                break;
            }else{
                int int1 = Integer.parseInt(s1);
                //修改数据
                controller3.update_goods(int1,str1);
                System.out.println("修改数据成功！！");
                break;
            }
        }
    }


    //根据商品条码删除数据
    productController controller2 = new productController();//查询数据是否存在
    List<goodsinfo> list2 = new ArrayList<goodsinfo>();//查询数据是否存在
    productController controller4 = new productController();
    String str11;
    public void deleteproductBycode(){
        while (true) {
            System.out.println("请输入要删除的商品条码（例:s001）：");
            str11 = in.next();
            list2 = controller2.in_goods(str11);
            if (list2.size()>0) {
                //进货表中存在该商品可以进行删除操作
                controller4.delete_goods(str11);
                System.out.println("该商品成功被删除！");
                break;
            } else {
                System.out.println("输入的商品条码不存在库存表中!请重新输入！");
                deleteproductBycode();
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
