package com.fvotlan.garden.configuration;

import feign.Request;
import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;

import java.lang.reflect.Type;
import java.nio.charset.Charset;

/**
 * CTSDB Encoder
 *
 * @author zhiwen.zuo
 * @date 2019-05-27
 **/
public class CTSDBEncoder implements Encoder {
    @Override
    public void encode(Object o, Type type, RequestTemplate requestTemplate) throws EncodeException {
        requestTemplate.body(Request.Body.encoded("{\"mark\":2020}".getBytes(), Charset.defaultCharset()));
    }
}
