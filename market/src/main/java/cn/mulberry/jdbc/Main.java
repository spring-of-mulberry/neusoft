package cn.mulberry.jdbc;

import cn.mulberry.jdbc.demoController.userController;

public class Main {
    public static void main(String[] args) {
        userController user = new userController();
//        user.adduser();
//        user.alteruser();
//        user.deleteuser();
        user.selectuser();
    }
}
