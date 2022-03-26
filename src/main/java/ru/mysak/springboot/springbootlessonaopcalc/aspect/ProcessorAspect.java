package ru.mysak.springboot.springbootlessonaopcalc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProcessorAspect {

    @Pointcut("execution(* ru.mysak.springboot.springbootlessonaopcalc.processors.*(..))")
    public void callInProcessors() {}
}
