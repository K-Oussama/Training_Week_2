package com.example.spring_exercice_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class TimeItAspect {

    @Around("@annotation(TimeIt)")
    public Object timeIt(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // execute the method

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;

        System.out.println("Time taken by " + joinPoint.getSignature().getName() + "() is " + timeTaken + " milliseconds");

        return result;
    }
}

