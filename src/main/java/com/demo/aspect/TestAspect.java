package com.demo.aspect;

import org.apache.tomcat.jni.Proc;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by cgl on 2018/3/22
 */
@Aspect
@Component
public class TestAspect {
    
    @Pointcut("execution(* com.demo.service..*(..))")
    public void testAspect1(){
    
    }
    
    @Pointcut("within(com.demo.service.*)")
    public void testAspect2(){
    
    }
    
    @Around("testAspect1()")
    public Object check(ProceedingJoinPoint pjp) throws Throwable{
        Object result = null;
        result = pjp.proceed(pjp.getArgs());
        return result;
    }
}
