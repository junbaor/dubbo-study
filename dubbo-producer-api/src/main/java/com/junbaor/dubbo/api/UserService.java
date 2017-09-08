package com.junbaor.dubbo.api;

import com.junbaor.dubbo.model.User;

import java.util.List;

/**
 * Created by junbaor on 2017/7/3.
 */
public interface UserService {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> getUserAll();
}
