/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The <code> SpringApplication </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
public class SpringApplication {

    private ApplicationContext context;

    public static void main(String[] args) {
        ApplicationContext context = getAnnotationContext();

        Computer computer = context.getBean(Computer.class);
        String name = computer.getName();
        System.out.println("Computer name is " + name);
    }

    private static ApplicationContext getClassPathXmlContext(){
        return new ClassPathXmlApplicationContext("Beans.xml");
    }

    private static ApplicationContext getAnnotationContext(){
        return new AnnotationConfigApplicationContext(Config.class);
//        return new AnnotationConfigApplicationContext("week1");
    }
}
