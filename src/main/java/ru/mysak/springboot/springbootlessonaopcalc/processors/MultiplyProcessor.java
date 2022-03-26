package ru.mysak.springboot.springbootlessonaopcalc.processors;

import org.springframework.stereotype.Component;

@Component
public class MultiplyProcessor implements Processor {

    @Override
    public int process(int a, int b) {
        return a * b;
    }
}
