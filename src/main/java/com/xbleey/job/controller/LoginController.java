/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: LoginController
 * Author:   11580
 * Date:     2019/11/12 0012 21:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.controller;

import com.xbleey.job.entity.User;
import com.xbleey.job.service.LoginService;
import com.xbleey.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/12 0012
 * @since 1.0.0
 */

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;
    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public String login(String userName, String passWord, HttpServletRequest request) {
        if (loginService.login(userName, passWord)) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", userName);
            return "redirect:/index";
        }
        return "redirect:/login.html";
    }

    @PostMapping(value = "/register")
    public String register(User user) {
        if (user.getUsername() != null && user.getPassword() != null) {
            user.setRole("student");
            userService.saveUser(user);
            return "redirect:/login.html";
        }
        return null;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("loginUser");
        System.out.println("logout");
        return "index";
    }
}
 

