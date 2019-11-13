/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: StudentService
 * Author:   11580
 * Date:     2019/11/13 0013 22:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.service;

import com.xbleey.job.dao.StudentDao;
import com.xbleey.job.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/13 0013
 * @since 1.0.0
 */
@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student saveStudent(Student student) {
        Student savedStudent = studentDao.save(student);
        return savedStudent;
    }
}
 

