/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UserService
 * Author:   11580
 * Date:     2019/11/9 0009 13:51
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

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/9 0009
 * @since 1.0.0
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User getOneByName(String username) {
        return userDao.getFirstByUsername(username);
    }

    public User getOneById(Integer id) {
        return userDao.getFirstByid(id);
    }


    public User saveUser(User user) {
        return userDao.save(user);
    }


    public User updateUser(User user) {
        return userDao.save(user);
    }


    public void deleteUser(Integer userId) {
        userDao.deleteById(userId);
    }
}
 

