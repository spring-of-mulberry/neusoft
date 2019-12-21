package cn.mulberry.jdbc.demoService;

import cn.mulberry.jdbc.demoEntity.User;

import java.util.List;

public interface userService {
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(User user);
    public List<User> selectUser();
}
