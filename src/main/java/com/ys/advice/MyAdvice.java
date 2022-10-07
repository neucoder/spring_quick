package com.ys.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.ys.dao.BookDao.update())")
    private void pt(){}


    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

    public void before() {
        System.out.println("before advice ...");
    }

    public void after() {
        System.out.println("after advice ...");
    }

    public void around(){
        System.out.println("around before advice ...");
        System.out.println("around after advice ...");
    }

    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}