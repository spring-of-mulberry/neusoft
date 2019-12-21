package com.mulberry.market.Main.product.in_out_operate;


import com.mulberry.market.Controller.operate.operateController;
import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Entity.goodsinfo;
import com.mulberry.market.Entity.goodsoperater;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class out_operate {
    Scanner in = new Scanner(System.in);
    operateController operateController1 = new operateController();//查看上架商品集合
    List<goodsoperater> list1 = new ArrayList<goodsoperater>();
    productController productController1 = new productController();//查看在上架商品里的缺货商品
    List<goodsinfo> goods1 = new ArrayList<goodsinfo>();
    String[] goods2 = new String[1024];
//    List<goodsinfo> goods2 = null;
    public void outoperate(){
        System.out.println("可下架的商品条码：");
        list1 = operateController1.out_operate();//上架商品的所有集合
        int j=0;
        for (int i = 0; i <list1.size() ; i++) {
            String code = list1.get(i).getBarcode();
            goods1 = productController1.need_goods(code);
            if (goods1.size()>0){
                goods2[j]=code; //可以显示下架商品
//                goods2.add(goods1.get(0));
                System.out.println(goods1.get(0).getGoodscode()+"\t");
                j++;
            }
        }
        isdown();
        System.out.println("是否继续下架商品(是（Y/y），否（任意键）)");
        String ss = in.next();
        if(ss.equals("Y")||ss.equals("y")){
            outoperate();
        }else{
            in_and_out in_and_out = new in_and_out();
            in_and_out.inandout();
        }

    }
    //判断
    operateController operateController2 = new operateController();
    productController pp = new productController();
    List<goodsinfo> l = new ArrayList<goodsinfo>();
    public void isdown(){
        //下架操作
        System.out.println("是否下架商品？（是（Y/y），否（任意键））");
        String s = in.next();
        if (s.equals("Y")|s.equals("y")){

        }else {
            in_and_out in_and_out = new in_and_out();
            in_and_out.inandout();
        }
        while (true) {
            System.out.println("输入下架商品条码：");
            String str1 = in.next();
//            if (Arrays.binarySearch(goods2,str1)==1){
            if (Arrays.asList(goods2).contains(str1)){
                operateController2.down_operate(str1);
                System.out.println("下架成功！");
                break;
            }else{
                System.out.println("这个商品不能下架或不存在该商品！请重新输入商品条码！");
                isdown();
                break;
            }


//            l = pp.in_goods(str1);
//            if (goods2.contains(l.get(0))){
//                operateController2.down_operate(str1);
//                System.out.println("下架成功！");
//                break;
//            }else{
//                System.out.println("这个商品不能下架或不存在该商品！请重新输入商品条码！");
//                isdown();
//                break;
//            }




//            for (int i = 0; i <goods2.size() ; i++) {
//                if (str1.equals(goods2.get(0).getGoodscode())){
//                    operateController2.down_operate(str1);
//                    System.out.println("下架成功！");
//                    break;
//                }else{
//                    System.out.println("这个商品不能下架或不存在该商品！请重新输入商品条码！");
//                    isdown();
//                    break;
//                }
//            }
//            break;
        }
    }
        //下架操作
    public void outs_operate(){



    }
}
