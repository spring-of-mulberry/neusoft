package cn.mulberry.jdbc.demoController;

import cn.mulberry.jdbc.demoEntity.User;
import cn.mulberry.jdbc.demoService.userService;
import cn.mulberry.jdbc.demoServiceImpl.userServiceI;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class userController {
    private userService service = new userServiceI();
    private SimpleDateFormat sdf = null;

    //增加数据
    public void adduser(){
        User user1 = new User();
        user1.setUname("zs");
        user1.setUpwd("999999");
        user1.setUemail("lisi@126.com");
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = new Date(sdf.parse("1988-10-23").getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user1.setUbirthday(d);
        service.insertUser(user1);
    }
    //修改数据:没有效果
    public void alteruser(){
        User user = new User();
//        Calendar c = Calendar.getInstance();
//        c.setTimeInMillis(System.currentTimeMillis());
//        java.util.Date d = c.getTime();
        Timestamp time = new Timestamp(System.currentTimeMillis());
        long d = time.getTime();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.sql.Date date = new java.sql.Date(sdf.parse(sdf.format(d)).getTime());
            user.setUbirthday( date);
            user.setUname("zs");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        service.updateUser(user);

    }
    //删除数据
    public void deleteuser(){
        User user = new User();
        user.setUname("张三");
        service.deleteUser(user);
    }
    //查询数据
    public void selectuser(){
        List<User> list = service.selectUser();
        for (User u :list
             ) {
            System.out.println(u.getUname()+"\t"+u.getUpwd()+"\t"+u.getUemail()+"\t"+u.getUbirthday());
        }
    }
}
