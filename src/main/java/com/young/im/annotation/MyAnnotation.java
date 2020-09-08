package com.young.im.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public  @interface MyAnnotation {
    String value() default "";
}
