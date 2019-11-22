/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: TipService
 * Author:   11580
 * Date:     2019/11/17 0017 16:11
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
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/17 0017
 * @since 1.0.0
 */
@Service
public class TipService {

    @Autowired
    StudentDao studentDao;

    private List<Student> students;
    private Integer graduateNum = 0;
    private Integer avgMoney = 0;
    private Integer jobProportion = 0;
    private Integer jobRoad = 0;
    private float avgYear = 0;

    private Integer jobNum = 0;

    private void getAllTips() {
        students = studentDao.findAll();

        jobNum = 0;
        /*毕业人数*/
        graduateNum = students.size();

        /*平均薪酬*/
        int totalMoney = 0;
        for (Student s : students) {
            if (s.getMoney() != null && s.getMoney() != 0) {
                totalMoney += s.getMoney();
                jobNum++;
            }
        }
        avgMoney = totalMoney / jobNum;

        /*就业比例*/
        jobProportion = jobNum * 100 / students.size();

        /*就业方向*/
        HashSet<Integer> road = new HashSet<>();
        for (Student s : students) {
            if (s.getJobRoad() != null) {
                road.add(s.getJobRoad());
            }
        }
        jobRoad = road.size();

        /*工作年限*/
        int totalYear = 0;
        for (Student s : students) {
            if (s.getJobYear() != null) {
                totalYear += s.getJobYear();
            }
        }
        avgYear = (float) (totalYear * 1.0 / jobNum);
    }

    public void loadTipValues(Model model) {
        getAllTips();
        model.addAttribute("graduateNum", graduateNum);
        model.addAttribute("avgMoney", avgMoney);
        model.addAttribute("jobProportion", jobProportion);
        model.addAttribute("jobRoad", jobRoad);
        model.addAttribute("avgYear", avgYear);
    }

    public int[] getCircleData() {
        int job = 0, gov = 0, study = 0;
        int[] res = new int[3];
        for (Student s : students) {
            switch (s.getJobWay()) {
                case 1: {
                    job++;
                    break;
                }
                case 2: {
                    gov++;
                    break;
                }
                case 3: {
                    study++;
                    break;
                }
            }
        }
        res[0] = job * 100 / students.size();
        res[2] = gov * 100 / students.size();
        res[1] = 100 - res[0] - res[2];
        return res;
    }

    public int[] getMoneyTotal() {
        int[] level = new int[5];
        for (Student s : students) {
            if (s.getMoney() != null) {
                int money = s.getMoney();
                if (money <= 2000) {
                    level[0]++;
                    continue;
                }if (money <= 5000) {
                    level[1]++;
                    continue;
                }if (money <= 10000) {
                    level[2]++;
                    continue;
                }if (money <= 15000) {
                    level[3]++;
                    continue;
                }if (money <= 20000) {
                    level[4]++;
                    continue;
                }
            }
        }
        for(int i =0;i<level.length;i++){
            level[i]=level[i]*100/jobNum;
        }
        return level;
    }

}