/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: CheckoutController
 * Author:   11580
 * Date:     2019/11/13 0013 14:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.controller;

import com.xbleey.job.entity.Student;
import com.xbleey.job.entity.WordsMap;
import com.xbleey.job.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/13 0013
 * @since 1.0.0
 */
@Controller
public class CheckoutController {

    Logger logger = LoggerFactory.getLogger(CheckoutController.class);

    @Autowired
    StudentService studentService;
    @Autowired
    WordsMap wordsMap;

    @GetMapping(value = "/checkout/{id}")
    public String goCheckout(Model model, @PathVariable(value = "id") Integer userId) {
        model.addAttribute("userId", userId);
        model.addAttribute("wordsMap", wordsMap);
        if (studentService.findOneByUserId(userId) != null) {
            model.addAttribute("student", studentService.findOneByUserId(userId));
        }
        return "checkout";
    }

    @PostMapping(value = "/checkout")
    public String submitCheckout(Student student) {
        logger.info("studentMessage", studentService.saveStudent(student).toString());
        return "redirect:/index";
    }


}
 

