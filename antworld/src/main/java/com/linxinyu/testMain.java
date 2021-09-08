package com.linxinyu;

import cn.hutool.json.JSONUtil;
import com.linxinyu.antworld.entity.Animal;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class testMain {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            log.info(JSONUtil.toJsonStr(new Animal()));
        }
    }
}
