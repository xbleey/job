/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: TableController
 * Author:   11580
 * Date:     2019/11/14 0014 11:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.controller;

import com.xbleey.job.entity.WordsMap;
import com.xbleey.job.service.StudentService;
import com.xbleey.job.utils.LoginSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/14 0014
 * @since 1.0.0
 */
@Controller
public class TableController {

    @Autowired
    StudentService studentService;

    @Autowired
    WordsMap wordsMap;

    @Autowired
    LoginSession loginSession;

    @GetMapping(value = "/tables")
    public String goTables(Model model, HttpServletRequest request) {
        loginSession.isLogin(model, request);
        model.addAttribute("students", studentService.findAllStudent());
        model.addAttribute("wordsMap", wordsMap);
        return "tables";
    }
}
 

