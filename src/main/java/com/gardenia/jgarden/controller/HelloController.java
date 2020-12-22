package com.gardenia.jgarden.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zhiwen.zuo
 * @date 2019-05-27
 **/
@RestController
@RequestMapping("hello")
@AllArgsConstructor
public class HelloController {

    @GetMapping
    public Object world() {
        return new HashMap<String, Object>() {{
            put("code", 0);
            put("msg", "success");
            put("now", System.currentTimeMillis());
        }};
    }
}
