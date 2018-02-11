package ru.sbt.dev.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TransferService bean = context.getBean("transferService", TransferService.class);
        System.out.println(bean.getI());
    }

    @Bean
    public TransferService transferService() {
        return new TransferService().setI(1);
    }

}
