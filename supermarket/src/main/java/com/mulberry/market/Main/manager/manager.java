package com.mulberry.market.Main.manager;

import com.mulberry.market.Main.login.login;
import com.mulberry.market.Main.product.in_out_operate.in_and_out;
import com.mulberry.market.Main.product.need_goods.needgoods;
import com.mulberry.market.Main.product.product_into.productall;
import com.mulberry.market.Main.product.product_look.operate_product;
import com.mulberry.market.Main.product.type_goods.typegoods;
import com.mulberry.market.Main.purchases.purchases;
import com.mulberry.market.Main.sale.salegoods;
import com.mulberry.market.Main.supplier.suppliers;

import java.util.Scanner;

public class manager {
    public void manager_UI(){
        System.out.println("*************管理员管理系统*****************");
        System.out.println("1.收银员账号管理");
        System.out.println("2.收银员考勤记录");
        System.out.println("3.商品上架和下架");
        System.out.println("4.供应商管理");
        System.out.println("5.商品分类管理");
        System.out.println("6.商品入库");
        System.out.println("7.进货信息报表");
        System.out.println("8.库存记录报表");
        System.out.println("9.缺货记录报表");
        System.out.println("10.超市营业额报表");
        System.out.println("11.退出到登录界面");
        System.out.println("********************************************");
        //选择操作选项
        select_manager();

    }
    //选择操作选项
    public void select_manager(){
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("选择你要操作的序号：");
            String str = in.next();
            if (str.equals("1")){
                person_userinfo person_userinfo = new person_userinfo();
                person_userinfo.person_all();
                break;
            }else if (str.equals("2")){
                person_select person_select = new person_select();
                person_select.person_all();
                break;
            }else if (str.equals("3")){
                in_and_out in_and_out = new in_and_out();
                in_and_out.inandout();
                break;
            }else if (str.equals("4")){
                suppliers suppliers = new suppliers();
                suppliers.supplier_all();
                break;
            }else if (str.equals("5")){
                typegoods typegoods = new typegoods();
                typegoods.type_goods();
                break;
            }else if (str.equals("6")){
                productall productall = new productall();
                productall.product_purchaseall();
                break;
            }else if (str.equals("7")){
                purchases pp = new purchases();
                pp.purchase_all();
                break;
            }else if (str.equals("8")){
                operate_product operate_product = new operate_product();
                operate_product.operateproduct();
                break;
            }else if (str.equals("9")){
                needgoods needgoods = new needgoods();
                needgoods.need_goods();
                break;
            }else if (str.equals("10")){
                salegoods salegoods = new salegoods();
                salegoods.manager_sale();
                break;
            }else if (str.equals("11")){
                System.out.println("您已经退出到登录操作！！！！！！！！");
                login login = new login();
                login.login_user();
                break;
            }else{
                System.out.println("序号输入有误！请重新输入！");
                select_manager();
            }
            break;
        }
    }

}
