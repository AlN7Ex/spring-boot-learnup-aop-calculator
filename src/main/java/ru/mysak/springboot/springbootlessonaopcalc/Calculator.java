package ru.mysak.springboot.springbootlessonaopcalc;

import org.springframework.stereotype.Component;
import ru.mysak.springboot.springbootlessonaopcalc.annotations.LogMethod;
import ru.mysak.springboot.springbootlessonaopcalc.annotations.WorkTime;
import ru.mysak.springboot.springbootlessonaopcalc.processors.DivideProcessor;
import ru.mysak.springboot.springbootlessonaopcalc.processors.MultiplyProcessor;
import ru.mysak.springboot.springbootlessonaopcalc.processors.SubtractProcessor;
import ru.mysak.springboot.springbootlessonaopcalc.processors.SumProcessor;

@Component
public class Calculator {
    private final SumProcessor sumProc;
    private final SubtractProcessor subtractProc;
    private final DivideProcessor divideProc;
    private final MultiplyProcessor multiplyProc;

    public Calculator(SumProcessor sumProc,
                      SubtractProcessor subtractProc,
                      DivideProcessor divideProc,
                      MultiplyProcessor multiplyProc)
    {
        this.sumProc = sumProc;
        this.subtractProc = subtractProc;
        this.divideProc = divideProc;
        this.multiplyProc = multiplyProc;
    }

    @WorkTime
    @LogMethod
    public int sum(int a, int b) throws InterruptedException {
        Thread.sleep(10);
        return sumProc.process(a,b);
    }

    @WorkTime
    @LogMethod
    public int subtract(int a, int b) throws InterruptedException{
        Thread.sleep(10);
        return subtractProc.process(a,b);
    }

    @WorkTime
    @LogMethod
    public int divide(int a, int b) throws InterruptedException{
        Thread.sleep(10);
        return divideProc.process(a, b);
    }

    @WorkTime
    @LogMethod
    public int multiply(int a, int b) throws InterruptedException{
        Thread.sleep(10);
        return multiplyProc.process(a, b);
    }
}
