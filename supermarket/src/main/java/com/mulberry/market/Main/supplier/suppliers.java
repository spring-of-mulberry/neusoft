package com.mulberry.market.Main.supplier;

import com.mulberry.market.Comment.RegExpUtil;
import com.mulberry.market.Controller.supplier.supplierController;
import com.mulberry.market.Entity.supplier;
import com.mulberry.market.Main.manager.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class suppliers {
    Scanner in = new Scanner(System.in);
    public void supplier_all(){
        System.out.println("********供应商管理系统***********");
        System.out.println("1.查看供应商");
        System.out.println("2.增加供应商");
        System.out.println("3.修改供应商");
        System.out.println("4.删除供应商");
        System.out.println("5.退出供应商管理系统");
        System.out.println("*********************************");
        supplier_select();
    }
    //选择
    public void supplier_select(){
        System.out.println("选择操作序号：");
        String str = in.next();
        if (str.equals("1")){
            System.out.println("查看供应商！");
            select_supplier();
        }else if (str.equals("2")){
            System.out.println("增加供应商");
            insert_supplier();
        }else  if (str.equals("3")){
            System.out.println("修改供应商");
            update_supplier();
        }else  if (str.equals("4")){
            System.out.println("删除供应商");
            delete_supplier();
        }else  if (str.equals("5")){
            System.out.println("退出供应商管理系统");
            manager m1 = new manager();
            m1.manager_UI();
        }else{
            System.out.println("输入的序号有误！请重新输入！！");
            supplier_select();
        }
    }
    /**
     *
     *查看供应商,查询所用供应商
     */
    supplierController s1 = new supplierController();//获取集合，显示所有供应商
    List<supplier> list1 = new ArrayList<supplier>();//获取集合
    supplier supplier1 = new supplier();//空供应商信息
    public void select_supplier(){
        System.out.println("(供应商号，供应商名称，法人代表，联系人，联系人电话，地址)");
        list1 = s1.selectsupplier(supplier1);
        for (supplier s:list1
             ) {
            System.out.println(s.getSupplierno()+"\t"+s.getSuppliername()+"\t"+s.getSuppliermanager()+"\t"+s.getSuppliercontact()+"\t"+s.getSuppliercontactphone()+"\t"+s.getSupplieraddress());
        }
        System.out.println("自动返回到供应商管理系统！！");
        supplier_all();
    }


    /**
     * 增加供应商，增加所有项
     */
    supplierController s5 = new supplierController();//增加供应商操作
    supplier supplier2 = new supplier();//存放供应商属性
    public void insert_supplier(){
        //添加供应商号
        addsupplierno();
        //添加供应商名称
        System.out.println("请输入供应商名称：");
        String str2 = in.next();
        supplier2.setSuppliername(str2);
        //添加法人代表
        System.out.println("请输入法人代表：");
        String str3 = in.next();
        supplier2.setSuppliermanager(str3);
        //添加联系人姓名
        System.out.println("请输入联系人姓名：");
        String str4 = in.next();
        supplier2.setSuppliercontact(str4);
        //添加联系人电话
       addsuppliercontactphone();
        //添加地址
        System.out.println("请输入地址：");
        String str6 = in.next();
        supplier2.setSupplieraddress(str6);
        //增加
        s5.insertsupplier(supplier2);
        System.out.println("增加供应商成功！！！");
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            supplier_all();
        }else{
            supplier_all();
        }
    }
//    增加供应商
    boolean ff;
    supplierController s2 = new supplierController();//在集合中找到有关供应商号，用作判断
    List<supplier> list2 = new ArrayList<supplier>();//在集合中找到有关供应商号，用作判断
    supplier supplier22 = new supplier();
    public void addsupplierno(){
        while (true){
            System.out.println("请输入供应商号（例：4001）：");
            String str1 = in.next();
            boolean flag = RegExpUtil.checkDigit(str1);
            if (flag){
                int int1 = Integer.parseInt(str1);
                list2 = s2.selectsupplier(supplier22);
                for (int i = 0; i <list2.size() ; i++) {
                    if (list2.get(i).getSupplierno()==int1){
                        ff=false;
                        break;
                    }else{
                        ff=true;
                    }
                }
                if (ff){
                    supplier2.setSupplierno(int1);
                    break;
                }else{
                    System.out.println("该供应商存在！请重新输入！");
                    addsupplierno();
                    break;
                }

//                list2 = s2.selectsupplierByno(supplier22);
//                if (list2.get(0).getSupplierno()!=int1){//bu存在供应商编号
//                    supplier2.setSupplierno(int1);
//                    break;
//                }else{
//                    System.out.println("该供应商编号存在!!请重新输入！");
//                    addsupplierno();
//                    break;
//                }

            }else{
                System.out.println("供应商编号输入有误！！请重新输入！！");
                addsupplierno();
                break;
            }
        }
    }
//    增加联系人电话号码
    public void addsuppliercontactphone(){
        while (true) {
            System.out.println("请输入联系人电话：");
            String str5 = in.next();
            long int5 = Long.parseLong(str5);
            boolean f = RegExpUtil.checkMobile(str5);
            if (f) {
                supplier2.setSuppliercontactphone(int5);
                break;
            } else {
                System.out.println("联系人电话输入有误！请重新输入（手机号码）！");
                addsuppliercontactphone();
                break;
            }
        }
    }


    /**
     * 修改供应商，通过供应商号supplierno修改数据
     */
    supplierController s4 = new supplierController();//修改操作
    supplier supplier4 = new supplier();//修改操作
    public void update_supplier(){
        //判断供应商号是否存在表中
        updateByno();
        //修改法人代表
        System.out.println("请输入修改的法人代表：");
        String u1 = in.next();
        supplier4.setSuppliermanager(u1);
        //修改联系人姓名
        System.out.println("请输入修改的联系人姓名：");
        String u2 = in.next();
        supplier4.setSuppliercontact(u2);
        //修改联系人电话
        updateBuphone();
        s4.updatesupplier(supplier4);
        System.out.println("修改供应商信息成功！！");
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            supplier_all();
        }else{
            supplier_all();
        }
    }
    //通过供应商号查看是否有该用户，在进行修改
    supplierController s3 = new supplierController();//通过供应商号查找数据
    List<supplier> list3 = new ArrayList<supplier>();//通过供应商号查找的数据
    supplier supplier3 = new supplier();//根据no查看数据
    boolean aa;
    public void updateByno(){
        while (true){
            System.out.println("请输入要修改的供应商号（例：4001）：");
            String str8 = in.next();
            boolean flag = RegExpUtil.checkDigit(str8);
            if (flag){//判断是否为数字
                int int4 = Integer.parseInt(str8);
                list3 = s3.selectsupplier(supplier3);
                for (int i = 0; i <list3.size() ; i++) {
                    if (list3.get(i).getSupplierno()!=int4){
                        aa = false;
                    }else{
                        aa=true;
                        break;
                    }
                }

                if (aa){//没有该供应商
                    supplier4.setSupplierno(int4);
                    break;
                }else{
                    System.out.println("没有该供应商!!请重新输入供应商号！！");
                    updateByno();
                    break;
                }
            }else{
                System.out.println("供应商编号输入有误！！请重新输入！！");
                updateByno();
                break;
            }
        }
    }
    //判断联系人电话的正确性，在进行修改
    public void updateBuphone(){
        while (true) {
            System.out.println("请输入联系人电话：");
            String str55 = in.next();
            long int55 = Long.parseLong(str55);
            boolean f = RegExpUtil.checkMobile(str55);
            if (f) {
                supplier4.setSuppliercontactphone(int55);
                break;
            } else {
                System.out.println("联系人电话输入有误！请重新输入（手机号码）！");
                updateBuphone();
                break;
            }
        }
    }


    /**
     * 删除供应商，通过供应商号supplierno删除数据
     */
    supplierController controller1 = new supplierController();
    supplier supplier7 = new supplier();//删除用到的对象
    public void delete_supplier(){
        deleteByno();

        System.out.println("删除供应商成功！！！");
        System.out.println("按任意键返回到主菜单：");
        String e = in.next();
        if (e!=null){
            supplier_all();
        }else{
            supplier_all();
        }

    }
    //判断是否存在供应商号，在进行删除
    supplierController s6 = new supplierController();//通过供应商号查找数据
    List<supplier> list6 = new ArrayList<supplier>();//通过供应商号查找的数据
    supplier supplier6 = new supplier();//查看数据
    boolean fff;
    public void deleteByno(){
        while (true){
            System.out.println("请输入要删除的供应商号（例：4001）：");
            String str9 = in.next();
            boolean fla = RegExpUtil.checkDigit(str9);
            if (fla){//判断是否为数字
                int int4 = Integer.parseInt(str9);
                list6 = s6.selectsupplier(supplier6);
                for (int i = 0; i <list6.size() ; i++) {
                    if (list6.get(i).getSupplierno()==int4){
                        fff=true;
                        break;
                    }else{
                        fff=false;
                    }
                }
                if (fff){
                    supplier7.setSupplierno(int4);
                    controller1.deletesupplier(supplier7);
                    break;
                }else{
                    System.out.println("没有该供应商!!请重新输入供应商号！！");
                    deleteByno();
                    break;
                }
            }else{
                System.out.println("供应商编号输入有误！！请重新输入！！");
                deleteByno();
                break;
            }
        }

    }
}
