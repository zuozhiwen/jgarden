package com.fvotlan.garden.configuration;

import feign.Request;
import feign.RequestInterceptor;
import feign.codec.Encoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import java.nio.charset.Charset;

/**
 * @author zhiwen.zuo
 * @date 2019-05-27
 **/
@Slf4j
public class FeginClientConfig {
    /*
    @Bean
    public RequestInterceptor testEncodeIntercept(){
        return requestTemplate -> {
            requestTemplate.header("at-point", "hello-demo");
            Request.Body body = requestTemplate.requestBody();
            log.info("trigger testEncodeIntercept and the body:{}", body.asString());

            requestTemplate.body(Request.Body.encoded("{\"mark\":2020}".getBytes(), Charset.defaultCharset()));
        };
    }
    */

    @Bean
    public Encoder consumerFeignEncoder(){
        return new CTSDBEncoder();
    }
}
