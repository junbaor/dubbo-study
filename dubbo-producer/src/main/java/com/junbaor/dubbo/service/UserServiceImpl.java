package com.junbaor.dubbo.service;

import com.junbaor.dubbo.api.UserService;
import com.junbaor.dubbo.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by junbaor on 2017/7/3.
 */
public class UserServiceImpl implements UserService {

    public List<User> getUserAll() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "张三", "zhangsan", new Date()));
        users.add(new User(2, "李四", "lisi", new Date()));
        users.add(new User(3, "王五", "wangwu", new Date()));
        users.add(new User(4, "赵六", "zhaoliu", new Date()));
        return users;
    }
}
