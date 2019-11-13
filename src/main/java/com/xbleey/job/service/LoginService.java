/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: LoginService
 * Author:   11580
 * Date:     2019/11/12 0012 21:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.service;

import com.xbleey.job.dao.UserDao;
import com.xbleey.job.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/12 0012
 * @since 1.0.0
 */
@Service
public class LoginService {

    @Autowired
    UserDao userDao;

    public Boolean login(String userName, String passWord) {
        if (userDao.existsByUsername(userName)) {
            User user = userDao.getFirstByUsername(userName);
            if (passWord != null && user.getPassword() != null && passWord.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
 

