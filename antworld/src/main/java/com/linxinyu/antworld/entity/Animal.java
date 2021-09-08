package com.linxinyu.antworld.entity;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.linxinyu.antworld.common.CommonUtils;
import lombok.Data;

/**
 * 游戏中所有生物的父类
 */
@Data
public class Animal {

    public Animal() {
        this.name = CommonUtils.getNewName();
        this.age = 0;
        this.status = "0";
        this.gender = String.valueOf(CommonUtils.randomNum(0, 1));
        this.id = IdWorker.getId();
    }

    private Long id;

    /***
     * 父亲
     */
    private Long dadId;

    /**
     * 母亲
     */
    private Long mumId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 饥饿值
     */
    private Integer hungerValue;

    /**
     * 战斗力
     */
    private Integer combatEffectiveness;

    /**
     * 精力
     */
    private Integer energy;

    /**
     * 状态（0-睡觉、1-活动、2-死亡）
     */
    private String status;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别（0-雌性，1-雄性）
     */
    private String gender;

    /**
     * 种族
     */
    private String race;

}

