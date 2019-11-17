/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Student
 * Author:   11580
 * Date:     2019/11/12 0012 11:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.entity;

import javax.persistence.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/12 0012
 * @since 1.0.0
 */
@Entity
public class Student {

    private static final long serialVersionUID = 124L;

    @Id
    @Column(name = "stu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stuId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "stu_name")
    private String stuName;

    @Column(name = "stu_sex")
    private String stuSex;

    @Column(name = "major")
    private String major;

    @Column(name = "major_kind")
    private Integer majorKind;

    @Column(name = "education")
    private Integer education;

    @Column(name = "job_way")
    private Integer jobWay;

    @Column(name = "job_road")
    private Integer jobRoad;

    @Column(name = "money")
    private Integer money;

    @Column(name = "year")
    private Integer jobYear;


    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getMajorKind() {
        return majorKind;
    }

    public void setMajorKind(Integer majorKind) {
        this.majorKind = majorKind;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getJobWay() {
        return jobWay;
    }

    public void setJobWay(Integer jobWay) {
        this.jobWay = jobWay;
    }

    public Integer getJobRoad() {
        return jobRoad;
    }

    public void setJobRoad(Integer jobRoad) {
        this.jobRoad = jobRoad;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getJobYear() {
        return jobYear;
    }

    public void setJobYear(Integer jobYear) {
        this.jobYear = jobYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", userId=" + userId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", major='" + major + '\'' +
                ", majorKind=" + majorKind +
                ", education=" + education +
                ", jobWay=" + jobWay +
                ", jobRoad=" + jobRoad +
                ", money=" + money +
                ", jobYear=" + jobYear +
                '}';
    }
}
 

