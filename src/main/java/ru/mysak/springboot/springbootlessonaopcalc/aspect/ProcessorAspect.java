package ru.mysak.springboot.springbootlessonaopcalc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProcessorAspect {
    private static final Logger log = LoggerFactory.getLogger(ProcessorAspect.class);

    @Pointcut("execution(* ru.mysak.springboot.springbootlessonaopcalc.processors.*.*(..))")
    public void callInProcessors() {}

    @Before("callInProcessors()")
    public void beforeCall(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            log.info("arg: {}", arg);
        }
        Object target = joinPoint.getTarget();
        Object aThis = joinPoint.getThis();

        log.info("target {}", target);
        log.info("this {}", aThis);
    }


}
