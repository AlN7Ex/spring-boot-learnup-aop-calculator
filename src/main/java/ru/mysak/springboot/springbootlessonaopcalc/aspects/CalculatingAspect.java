package ru.mysak.springboot.springbootlessonaopcalc.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import ru.mysak.springboot.springbootlessonaopcalc.Calculator;

@Aspect
@Component
public class CalculatingAspect {
    Logger log = LoggerFactory.getLogger(Calculator.class);

    long start,end;

    @Around("@annotation(ru.mysak.springboot.springbootlessonaopcalc.annotations.WorkTime)")
    public Object around(ProceedingJoinPoint joinPoint) {
        start = System.currentTimeMillis();
        log.info("Start: {}", start);
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        end = System.currentTimeMillis();
        log.info("End: {}", end);
        log.info("Working time: {}", end - start);

        return result;
    }

    @Before("@annotation(ru.mysak.springboot.springbootlessonaopcalc.annotations.LogMethod)")
    public void beforeCalculatorLogic(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("Method: {}", joinPoint.getSignature().getName());
        for (Object arg : args) {
            log.info("Argument: {}", arg);
        }
    }

    @AfterReturning(
            value = "@annotation(ru.mysak.springboot.springbootlessonaopcalc.annotations.LogMethod)",
            returning = "returnValue")
    public void returnCalculatedValue(int returnValue) {
        log.info("Return value: {}", returnValue);
    }
}
