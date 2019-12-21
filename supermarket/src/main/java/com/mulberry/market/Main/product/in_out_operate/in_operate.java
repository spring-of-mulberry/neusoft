package com.mulberry.market.Main.product.in_out_operate;

import com.mulberry.market.Controller.operate.operateController;
import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Entity.goodsinfo;
import com.mulberry.market.Entity.goodsoperater;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class in_operate {
    Scanner in = new Scanner(System.in);
    productController productController1 = new productController();//上架商品查看
    List<goodsinfo> list1 = new ArrayList<goodsinfo>();//上架商品查看
    productController productController2 = new productController();//通过条码查看库存数据
    List<goodsinfo> list2 = new ArrayList<goodsinfo>();//通过条码查看库存数据
    operateController operateController11 = new operateController();
    List<goodsoperater> goods1 = new ArrayList<goodsoperater>();
//    List<goodsoperater> list11 = new ArrayList<goodsoperater>();
    String[] list11 = new String[1024];
    public void inoperate(){
        System.out.println("可上架的商品条码：");
        list1 = productController1.in_goods();
        int j=0;
        for (int i = 0; i <list1.size() ; i++) {//在库存中查找可上架的数据
            String code = list1.get(i).getGoodscode();
            goods1 = operateController11.see_bycode(code);
            if (goods1.size()>0){
                list11[j]=code;
                j++;

            }else{
                System.out.println(code+"\t");
            }
        }
        //上架操作
        while (true) {
            System.out.println("是否上架商品？（是（Y/y），否（任意键））");
            String s = in.next();
            if (s.equals("Y")|s.equals("y")){

            }else {
                in_and_out in_and_out = new in_and_out();
                in_and_out.inandout();
                break;
            }
            System.out.println("输入上架商品条码：");
            String str1 = in.next();
            list2 = productController2.need1_goods(str1);
            if (list2.size() > 0) {//该商品可上架
                //做增加操作
                if (Arrays.asList(list11).contains(str1)){
//                    operateController2.down_operate(str1);
//                    System.out.println("下架成功！");
                    System.out.println("该商品已经上架！请重新输入商品条码！");
                    inoperate();
                    break;
                }else{
                    add_operate();
                    break;
                }
            } else {
                System.out.println("商品条码无效或不能上架！请重新输入！");
                inoperate();
                break;
            }
        }
    }
    //上架操作
    goodsinfo goodsinfo1 = new goodsinfo();
    operateController controller1 = new operateController();//shangjia
    goodsoperater goodsoperater1 = new goodsoperater();//shangjia
    public void add_operate(){
        goodsinfo1 = list2.get(0);
        //操作员号
        goodsoperater1.setUserno(goodsinfo1.getUserno());
        //商品条码
        goodsoperater1.setBarcode(goodsinfo1.getGoodscode());
        //商品名称
        goodsoperater1.setGoodsname(goodsinfo1.getGoodsname());
        //上架时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long l = timestamp.getTime();
        java.sql.Date sqldate;
        try {
            sqldate = new java.sql.Date(sdf.parse(sdf.format(l)).getTime());
            goodsoperater1.setOnsaledate(sqldate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //上加价格
        goodsoperater1.setOnsaleprice(goodsinfo1.getGoodsprice()+1);
        //商品状态
        goodsoperater1.setState(1);
        controller1.add_operate(goodsoperater1);
        System.out.println("上架成功！");
        System.out.println("是否继续上架商品(是（Y/y），否（任意键）)");
        String ss = in.next();
        if(ss.equals("Y")||ss.equals("y")){
            inoperate();
        }else{
            in_and_out in_and_out = new in_and_out();
            in_and_out.inandout();
        }
    }
}
