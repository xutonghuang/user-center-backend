package com.xth.usercenter.service;
import java.util.Date;

import com.xth.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author Mo_Cang
 * @since 2023/5/8 14:25
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("xth");
        user.setUserAccount("123");
        user.setAvatarUrl("https://himg.bdimg.com/sys/portrait/item/public.1.508aaba0.X9ahKColPd_jHM-Yia6HVg.jpg");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertEquals(true, result);
    }
}
