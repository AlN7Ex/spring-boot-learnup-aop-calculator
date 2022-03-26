package ru.mysak.springboot.springbootlessonaopcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootLessonAopCalcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootLessonAopCalcApplication.class, args);

        Calculator calculator = context.getBean("calculator", Calculator.class);

        System.out.println("Sum:      \t" + calculator.sum(5,5));
        System.out.println("Subtract: \t" + calculator.subtract(5,5));
        System.out.println("Divide:   \t" + calculator.divide(5,5));
        System.out.println("Multiply: \t" + calculator.multiply(5,5));
    }

}
