package com.fvotlan.garden.feign;

import com.fvotlan.garden.configuration.FeginClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

/**
 * CTS DB 测试
 *
 * @author zhiwen.zuo
 * @date 2019-05-28
 **/
@FeignClient(name = "CtsTestDbApi", url = "http://115.159.90.254:9210", configuration = FeginClientConfig.class)
public interface CtsTestDbApi {
    @GetMapping(value = "/my_carrier_meter_work_time/_search")
    public HashMap<String, Object> queryAll();
}
