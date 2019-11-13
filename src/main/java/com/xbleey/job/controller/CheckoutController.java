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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping(value = "/checkout/{id}")
    public String goCheckout(@PathVariable(value = "id") Integer stuId) {
        System.out.println(stuId);
        return "redirect:/checkout.html";
    }

    @ResponseBody
    @PostMapping(value = "/checkout")
    public Student submitCheckout(Student student) {
        return student;
    }
}
 

