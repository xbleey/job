package com.xbleey.job;

import com.xbleey.job.entity.User;
import com.xbleey.job.service.UserService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserTests {
    @Autowired
    UserService userService;
    private User user= new User("apple", "apple", "admin");;

    @Test
    void readUsers() {
        System.out.println(userService.getAllUsers().toString());
    }

    @Test
    void saveUsers() {
        System.out.println(userService.saveUser(user));
        System.out.println(userService.getAllUsers().toString());
    }

    @Test
    void updateUsers() {
        user.setUsername("boy");
        user.setId(3);
        System.out.println(userService.updateUser(user));
        System.out.println(userService.getAllUsers().toString());
    }

    @Test
    void deleteUsers() {
        userService.deleteUser(3);
        System.out.println(userService.getAllUsers().toString());
    }

}
