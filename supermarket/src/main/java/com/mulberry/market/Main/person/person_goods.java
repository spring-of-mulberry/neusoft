package com.mulberry.market.Main.person;

import com.mulberry.market.Controller.sale.saleController;
import com.mulberry.market.Entity.salesdetial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class person_goods {
    saleController saleController1 = new saleController();//显示所有数据
    List<salesdetial> list1 = new ArrayList<salesdetial>();//显示所有数据
    public void person_sale(){
        System.out.println("*********销售明细表总表**********");
        System.out.println("(销售序号，商品条码，数量，单价，总价，销售时间)");
        list1 = saleController1.sale_all();
        for (int i = 0; i <list1.size() ; i++) {
            salesdetial s1 = list1.get(i);
            System.out.println(s1.getDetialid()+"\t"+s1.getBarcode()+"\t"+s1.getCount()+"\t"+s1.getUnitprice()+"\t"+s1.getSumprice()+"\t"+s1.getSaledate());
        }
        System.out.println("按任意键返回到主菜单：");
        String e = new Scanner(System.in).next();
        if (e!=null){
            person_calcu person_calcu = new person_calcu();
            person_calcu.personcalcu();
        }else{
            person_calcu person_calcu = new person_calcu();
            person_calcu.personcalcu();
        }
    }
}
