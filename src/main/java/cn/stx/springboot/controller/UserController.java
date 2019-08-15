package cn.stx.springboot.controller;

import cn.stx.springboot.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/getUser")
    public User getUser()
    {

        User user=new User();
        user.setUsername("李红");
        user.setPassword("123");
        return user;
    }
}
