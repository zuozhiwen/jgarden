package com.fvotlan.garden.controller;

import com.fvotlan.garden.feign.CtsTestDbApi;
import com.fvotlan.garden.feign.InteractiveApi;
import lombok.AllArgsConstructor;
import lombok.var;
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
    private CtsTestDbApi ctsTestDbApi;

    @GetMapping("")
    public Object world(){
        HashMap<String, Object> req = new HashMap<>();
        req.put("code",200);

        var res = interactiveApi.interactive(req);

        var testRes = ctsTestDbApi.queryAll();

        return res;
    }
}
