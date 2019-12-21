package com.mulberry.market.Main.sale;

import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.operate.operateController;
import com.mulberry.market.Controller.product.productController;
import com.mulberry.market.Controller.sale.saleController;
import com.mulberry.market.Entity.goodsinfo;
import com.mulberry.market.Entity.goodsoperater;
import com.mulberry.market.Entity.salesdetial;
import com.mulberry.market.Main.login.login;
import com.mulberry.market.Main.person.person;
import com.mulberry.market.Main.person.person_calcu;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addsale {
    Scanner in = new Scanner(System.in);
    saleController saleController1 = new saleController();//增加操作
    salesdetial sale1 = new salesdetial();//增加操作
    String str1,str2;
    operateController controller1 = new operateController();//判断商品是否可买
    List<goodsoperater> list1 = new ArrayList<goodsoperater>();// 判断商品是否可买
    public void add_sale(){
        System.out.println("*******收银操作*******");
        //操作员号
        login login = new login();
        sale1.setUserno(login.publicname);
        //商品条码
        add_code();
        //数量
        add_count();
        //单价
        sale1.setUnitprice(list1.get(0).getOnsaleprice());
        //总价
        int int2 = Integer.parseInt(str2);
        sale1.setSumprice(list1.get(0).getOnsaleprice()*int2);
        System.out.println("商品总价为："+list1.get(0).getOnsaleprice()*int2);
        //销售时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long l = timestamp.getTime();
        java.sql.Date sqldate;
        try {
            sqldate = new java.sql.Date(sdf.parse(sdf.format(l)).getTime());
            sale1.setSaledate(sqldate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //增加到明细表
        saleController1.add_sale(sale1);
        //判断是否继续增加
        System.out.println("是否继续结算商品！（是（y/Y），否（任意键））");
        String s = in.next();
        if (s.equals("y")||s.equals("Y")){
            add_sale();
        }else{
            person_calcu person_calcu = new person_calcu();
            person_calcu.personcalcu();
        }

    }
    //商品条码
    operateController o1 = new operateController();
    List<goodsoperater> ll2 = new ArrayList<goodsoperater>();
   productController controller44 = new productController();
   List<goodsinfo> gg44 = new ArrayList<goodsinfo>();
    public void add_code(){
        while (true) {
            System.out.println("输入商品条码（例:s001）：");
            str1 = in.next();
            boolean fff = false;
            ll2 = o1.see_all();
            for (goodsoperater g : ll2
                 ) {
                if (g.getBarcode().equals(str1)){
                    fff=true;
                    break;
                }else{
                    fff=false;
                }
            }
            if (fff) {
                list1 = controller1.see_bycode(str1);
                if (list1.get(0).getState() == 1) {//可以买
                    //啊判断
                    gg44 = controller44.in_goods(str1);
                    if (gg44.get(0).getGoodstock()<gg44.get(0).getGoodsalarm()){
                        System.out.println("该商品即将下架，不能购买！请重新输入！");
                        add_code();
                        break;
                    }else{
                        sale1.setBarcode(str1);
                        break;
                    }
                } else {
                    System.out.println("该商品已下架！请重新输入！");
                    add_code();
                    break;
                }
            } else {
                System.out.println("该商品还没有上架！请重新输入！");
                add_code();
                break;
            }
        }
    }

    //数量
    productController controller2 = new productController();//判断销售数量是否可行
    List<goodsinfo> list2 = new ArrayList<goodsinfo>();//判断销售数量是否可行
    productController controller3 = new productController();//修改数量
    public void add_count(){
        while (true) {
            System.out.println("输入销售数量：");
            str2 = in.next();
            boolean b = RegExpUtil.checkDigit(str2);
            if (!b) {//判断输入的数字是否有误
                System.out.println("输入的销售数量有误请重新输入！");
                add_count();
                break;
            }else{
                int int2 = Integer.parseInt(str2);
                list2 = controller2.need1_goods(str1);
                if (list2.get(0).getGoodstock()>int2){//销售数量可行
                    sale1.setCount(int2);
                    //修改库存表中的数量
                    int int3 = list2.get(0).getGoodstock()-int2;
                    controller3.update_count(str1,int3);
                    break;
                }else{
                    System.out.println("输入的销售数量过大！请重新输入！");
                    add_count();
                    break;
                }
            }
        }
    }
}
