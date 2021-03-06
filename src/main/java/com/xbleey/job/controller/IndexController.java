/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: IndexController
 * Author:   11580
 * Date:     2019/11/12 0012 19:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.controller;

import com.xbleey.job.service.TipService;
import com.xbleey.job.service.UserService;
import com.xbleey.job.utils.LoginSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/12 0012
 * @since 1.0.0
 */
@Controller
public class IndexController {

    @Autowired
    UserService userService;
    @Autowired
    LoginSession loginSession;
    @Autowired
    TipService tipService;

    @GetMapping(value = {"/index", "/"})
    public String index(Model model, HttpServletRequest request) {
        loginSession.isLogin(model, request);
        tipService.loadTipValues(model);
        model.addAttribute("moneyTotal", tipService.getMoneyTotal());
        return "index";
    }

    @ResponseBody
    @GetMapping(value = "/circleData")
    public int[] getCircleData() {
        return tipService.getCircleData();
    }
}
 

