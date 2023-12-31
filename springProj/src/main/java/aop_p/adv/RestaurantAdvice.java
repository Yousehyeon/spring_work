package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import aop_p.webToon.Restaurant;

@Service
@Aspect
public class RestaurantAdvice {

    @Before("execution(* aop_p.webToon.Restaurant.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature().toShortString());
    }

    @After("execution(* aop_p.webToon.Restaurant.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut = "execution(* aop_p.webToon.Restaurant.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After Returning: " + joinPoint.getSignature().toShortString() + " => " + result);
    }
}