package com.fvotlan.garden.controller;

import com.fvotlan.garden.feign.InteractiveApi;
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
    private InteractiveApi interactiveApi;

    @GetMapping("")
    public Object world(){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code",200);

        interactiveApi.interactive(res);

        return res;
    }
}
