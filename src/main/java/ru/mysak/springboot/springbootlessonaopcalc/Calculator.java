package ru.mysak.springboot.springbootlessonaopcalc;

import org.springframework.stereotype.Component;
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

    public int sum(int a, int b) {
        return sumProc.process(a,b);
    }
    public int subtract(int a, int b) {
        return subtractProc.process(a,b);
    }
    public int divide(int a, int b) {
        return divideProc.process(a, b);
    }
    public int multiply(int a, int b) {
        return multiplyProc.process(a, b);
    }
}
