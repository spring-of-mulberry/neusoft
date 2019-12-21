package com.mulberry.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class suan {
    public static void main(String[] args) {
//        arr();
        // he();
//        bianli();
//        maopao();
//        shulie();
//        zhishu();
        date();
    }

    public static void date(){
        LocalDate l = LocalDate.of(2019,11,8);
        System.out.println(l);
        LocalDate ll  = LocalDate.parse("2019-3-3");
        System.out.println(ll);

    }
    public  static  void month(){
        int month = new Random().nextInt(12)+1;
        System.out.println(month);
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");break;
            case 4: case 6: case 9: case 11:
                System.out.println("30");break;
            case 2:
                System.out.println("28");break;
            default:
                System.out.println("shuruyouwu");
        }
    }
    public static void he(){
        int tmp=0;
        for(int i=1;i<=10;i++){
            if (i%2==1){
                tmp +=i;
            }
        }
        System.out.println("hewei:"+tmp);
    }
    //两数组合成一个数组
    public static void arr(){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{6,7,8};
        int[] arr = new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr[arr1.length+i] = arr2[i];
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    //遍历数组，找到最大值和最大值下标
    public  static  void bianli(){
        int[] arr = new int[]{18,25,7,36,13,2,89,63};
        int flag = 0,maxarr = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (maxarr <=arr[i]) {
                maxarr = arr[i];
                flag = i;
            }
        }
        System.out.println("最大数为"+maxarr+",最大数下标为"+flag);
    }
    //冒泡排序
    public static void maopao(){
        int[] arr ={1,6,2,3,9,4,5,7,8};
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i ; j++) {
                if (arr[j] >arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  = tmp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]);
        }
    }
    //数列相乘
    public static void shulie(){
        int[][] arr1 ={{2,3,4},{4,6,8}};
        int[][] arr2 = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
        int[][] arr3 = new int[2][4];
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <4 ; j++) {
                for (int k = 0; k <3 ; k++) {

                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    //质数的判断
    public static void zhishu(){
        for (int i = 201; i >200 ; i++) {
            boolean flag  = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("最小质数为"+i);
                break;
            }
        }
    }

}
