package ru.mysak.springboot.springbootlessonaopcalc.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DivideProcessor implements Processor {

    @Override
    public int process(int a, int b) {
        return a / b;
    }
}
