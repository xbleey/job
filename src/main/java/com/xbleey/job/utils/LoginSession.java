/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: LoginSession
 * Author:   11580
 * Date:     2019/11/14 0014 14:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.utils;

import com.xbleey.job.entity.User;
import com.xbleey.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/14 0014
 * @since 1.0.0
 */
@Component
public class LoginSession {

    @Autowired
    UserService userService;

    public void isLogin(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("loginUser") != null) {
            User user = userService.getOneByName((String) session.getAttribute("loginUser"));
            model.addAttribute("isLogin", user);
        }
    }
}
 

