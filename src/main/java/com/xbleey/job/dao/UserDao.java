/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UserDao
 * Author:   11580
 * Date:     2019/11/9 0009 13:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.dao;

import com.xbleey.job.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/9 0009
 * @since 1.0.0
 */
public interface UserDao extends JpaRepository<User, Integer> {
    public User getFirstByid(int id);

    public User getFirstByUsername(String username);

    public boolean existsByUsername(String username);

}