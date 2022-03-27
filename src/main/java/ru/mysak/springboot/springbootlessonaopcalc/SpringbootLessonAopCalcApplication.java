package ru.mysak.springboot.springbootlessonaopcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootLessonAopCalcApplication {

    public static void delimiter() {
        System.out.println("##############");
    }

    public static void main(String[] args) throws InterruptedException{
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootLessonAopCalcApplication.class, args);

        Calculator calculator = context.getBean("calculator", Calculator.class);

        calculator.sum(5,5);
        delimiter();
        calculator.subtract(5,5);
        delimiter();
        calculator.divide(5,5);
        delimiter();
        calculator.multiply(5,5);
    }

}
