/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: WordsMap
 * Author:   11580
 * Date:     2019/11/13 0013 22:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.job.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/13 0013
 * @since 1.0.0
 */
@Component
public class WordsMap {

    private static HashMap<Integer, String> majorKindMap = new HashMap<>();
    private static HashMap<Integer, String> educationMap = new HashMap<>();
    private static HashMap<Integer, String> jobWayMap = new HashMap<>();
    private static HashMap<Integer, String> jobRoadMap = new HashMap<>();

    Logger logger = LoggerFactory.getLogger(WordsMap.class);


    public WordsMap() {
        logger.info("WordsMap loading!!!!");
        loadMajorKindMap();
        loadEducationMap();
        loadJobWayMap();
        loadJobRoadMap();
        logger.info("WordsMap Finished!!!!");
    }

    private static void loadMajorKindMap() {
        majorKindMap.put(1, "哲学");
        majorKindMap.put(2, "经济学");
        majorKindMap.put(3, "法学");
        majorKindMap.put(4, "教育学");
        majorKindMap.put(5, "教育学");
        majorKindMap.put(6, "历史学");
        majorKindMap.put(7, "理学");
        majorKindMap.put(8, "工学");
        majorKindMap.put(9, "农学");
        majorKindMap.put(10, "医学");
        majorKindMap.put(11, "军事学");
        majorKindMap.put(12, "管理学");
    }

    private static void loadEducationMap() {
        educationMap.put(1, "高中");
        educationMap.put(2, "专科");
        educationMap.put(3, "本科");
        educationMap.put(4, "硕士研究生");
        educationMap.put(5, "博士研究生");
    }

    private static void loadJobWayMap() {
        jobWayMap.put(1, "就业创业");
        jobWayMap.put(2, "国家机关/事业单位");
        jobWayMap.put(3, "升学考研");
    }

    private static void loadJobRoadMap() {
        jobRoadMap.put(1, "信息传输、软件和信息技术服务业");
        jobRoadMap.put(2, "教育");
        jobRoadMap.put(3, "制造业");
        jobRoadMap.put(4, "公共管理、社会保障和社会组织");
        jobRoadMap.put(5, "金融业");
        jobRoadMap.put(6, "文化、体育和娱乐业");
        jobRoadMap.put(7, "科学研究和技术服务业");
        jobRoadMap.put(8, "卫生和社会工作");
        jobRoadMap.put(9, "租赁和商务服务业");
        jobRoadMap.put(10, "建筑业");
        jobRoadMap.put(11, "批发和零售业");
        jobRoadMap.put(12, "居民服务、修理和其他服务业");
        jobRoadMap.put(13, "电力、热力、燃气及水生产和供应业");
        jobRoadMap.put(14, "交通运输、仓储和邮政业");
        jobRoadMap.put(15, "房地产业");
        jobRoadMap.put(16, "农林牧渔业");
        jobRoadMap.put(17, "住宿和餐饮业");
        jobRoadMap.put(18, "水利、环境和公共设施管理业");
        jobRoadMap.put(19, "军队");
        jobRoadMap.put(20, "采矿业");
        jobRoadMap.put(21, "国际组织");
        jobRoadMap.put(22, "其他");
    }

    public static HashMap<Integer, String> getMajorKindMap() {
        return majorKindMap;
    }

    public static HashMap<Integer, String> getEducationMap() {
        return educationMap;
    }

    public static HashMap<Integer, String> getJobWayMap() {
        return jobWayMap;
    }

    public static HashMap<Integer, String> getJobRoadMap() {
        return jobRoadMap;
    }

}


