package com.fvotlan.garden.configuration;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import feign.Request;
import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Date;

/**
 * CTSDB Encoder
 *
 * @author zhiwen.zuo
 * @date 2019-05-27
 **/
public class CTSDBEncoder implements Encoder {
    @Override
    public void encode(Object o, Type type, RequestTemplate requestTemplate) throws EncodeException {
        String jsonString = JSON.toJSONString(o);
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        jsonObject.put("timestamp", new Date());
        requestTemplate.body(Request.Body.encoded(jsonObject.toJSONString().getBytes(), Charset.defaultCharset()));
        requestTemplate.body(Request.Body.encoded("{\"size\":1,\"docvalue_fields\":[\"id\",\"pid\",\"carrierId\",\"deviceId\",\"timestamp\",\"avgVelocity\",\"distance\",\"absDistance\",\"movingTime\",\"batteryVolt\",\"batteryCurrent\",\"batteryState\",\"brakeTime\",\"seatTime\",\"forkTime\",\"overlapTime\",\"forkCounter\",\"moveCounter\",\"forwardCounter\",\"reverseCounter\",\"directionChangeCounter\",\"forwardTime\",\"reverseTime\",\"forwardDistance\",\"reverseDistance\",\"hourOfCreatedAt\"]}".getBytes(), Charset.defaultCharset()));
    }
}
