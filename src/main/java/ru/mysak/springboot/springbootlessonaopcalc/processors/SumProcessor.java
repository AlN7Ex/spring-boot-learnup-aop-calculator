package ru.mysak.springboot.springbootlessonaopcalc.processors;

import org.springframework.stereotype.Component;

@Component
public class SumProcessor implements Processor {

    @Override
    public int process(int a, int b) {
        return a + b;
    }
}
