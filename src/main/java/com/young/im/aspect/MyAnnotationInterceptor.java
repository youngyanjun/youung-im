package com.young.im.aspect;


import com.young.im.config.RedisTemplateConfig;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * MyAnnotation注解对应的拦截器
 * AspectJ 支持 5 种类型的通知注解:
 *
 * @Before: 前置通知, 在方法执行之前执行
 * @After: 后置通知, 在方法执行之后执行
 * @AfterRunning: 返回通知, 在方法返回结果之后执行
 * @AfterThrowing: 异常通知, 在方法抛出异常之后
 * @Around: 环绕通知, 围绕着方法执行
 **/
@Component
@Aspect
public class MyAnnotationInterceptor {
    public static final Logger logger = LoggerFactory.getLogger(MyAnnotationInterceptor.class);

    @Resource
    private RedisTemplateConfig redisTemplateConfig;


    @Pointcut("@annotation(com.young.im.annotation.MyAnnotation)")
    public void functionAspect() {

    }

    @Around(value = "functionAspect()")
    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--------------");
        logger.info("around执行方法之前");
        Object object = pjp.proceed();
        logger.info("around执行方法之后--返回值：" + object);
    }

    @Before("functionAspect()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("--------------");



        logger.info("doBefore");
    }


    @AfterThrowing(value = "functionAspect()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Exception e) {
        System.out.println("--------------");
        logger.info("AfterThrowing");
    }
}
