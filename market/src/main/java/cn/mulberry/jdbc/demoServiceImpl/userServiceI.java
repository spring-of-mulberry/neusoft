package cn.mulberry.jdbc.demoServiceImpl;

import cn.mulberry.jdbc.demoDao.userDao;
import cn.mulberry.jdbc.demoDaoImpl.userDaoI;
import cn.mulberry.jdbc.demoEntity.User;
import cn.mulberry.jdbc.demoService.userService;

import java.util.List;

public class userServiceI implements userService {
    private userDao dao = new userDaoI();

    public int insertUser(User user) {
        return dao.insertUser(user);
    }

    public int updateUser(User user) {
        return dao.updateUser(user);
    }

    public int deleteUser(User user) {
        return dao.deleteUser(user);
    }

    public List<User> selectUser() {
        return dao.selectUser();
    }
}
