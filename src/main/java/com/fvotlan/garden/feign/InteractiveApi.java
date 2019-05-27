package com.fvotlan.garden.feign;

import com.fvotlan.garden.configuration.FeginClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author zhiwen.zuo
 * @date 2019-05-27
 **/
@FeignClient(name = "interactiveApi", url = "http://localhost:5000", configuration = FeginClientConfig.class)
public interface InteractiveApi {

    /**
     * interactive
     * @param params
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public Object interactive(@RequestBody HashMap<String, Object> params);
}
