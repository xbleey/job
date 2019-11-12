/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UserController
 * Author:   11580
 * Date:     2019/11/9 0009 14:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.controller;

import com.xbleey.job.entity.User;
import com.xbleey.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/9 0009
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{userId}")
    public User getOneById(@PathVariable(value = "userId") Integer userId) {
        return userService.getOneById(userId);
    }

    @PostMapping(value = "/")
    public User SaveUser(User user) {
        return userService.saveUser(user);
    }

    @PutMapping(value = "/")
    public User updateUser(User user) {
        if (user.getId() == null) {
            System.out.println("没有ID不能修改");
            return null;
        }
        return userService.saveUser(user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable(value = "userId") Integer userId) {
        userService.deleteUser(userId);
        return "删除成功";
    }
}
 

