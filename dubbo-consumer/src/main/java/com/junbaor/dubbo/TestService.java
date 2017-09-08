package com.junbaor.dubbo;

import com.junbaor.dubbo.api.UserService;
import com.junbaor.dubbo.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by junbaor on 2017/7/3.
 */
public class TestService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext*.xml");
        context.start();

        UserService userService = (UserService) context.getBean("userService");
        List<User> userAll = userService.getUserAll();
        System.out.println(userAll);
    }
}
