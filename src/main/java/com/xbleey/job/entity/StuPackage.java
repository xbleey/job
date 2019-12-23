/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: StuPackage
 * Author:   11580
 * Date:     2019/12/23 0023 11:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.entity;

import javax.persistence.Entity;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/12/23 0023
 * @since 1.0.0
 */
public class StuPackage {

    private Student student;
    private String state;
    private Integer stateCode;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getStateCode() {
        return stateCode;
    }

    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return "StuPackage{" +
                "student=" + student +
                ", state='" + state + '\'' +
                ", stateCode=" + stateCode +
                '}';
    }
}
 

