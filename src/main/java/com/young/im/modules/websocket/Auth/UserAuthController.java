package com.young.im.modules.websocket.Auth;


import com.sun.org.apache.regexp.internal.RE;
import com.young.im.annotation.MyAnnotation;
import com.young.im.config.RedisTemplateConfig;
import com.young.im.po.ResultBody;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController()
@Controller
@RequestMapping("/spring")
public class UserAuthController {
    @Resource
    private RedisTemplateConfig redisTemplateConfig;

    @GetMapping("/test")
    public ResultBody test() {
        System.out.println("0000000000000000");

        Long expire = redisTemplateConfig.userUserTemplate().getExpire("test:yyj:12345678");
        Long aLong = redisTemplateConfig.redisOrderTemplate().getExpire("fiveUnders::2020-09-08");

        System.out.println("exp"+expire);
        System.out.println("aLong = " + aLong);
        return ResultBody.success();
    }


}
