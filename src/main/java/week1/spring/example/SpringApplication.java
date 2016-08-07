/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * The <code> SpringApplication </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
public class SpringApplication {

    public static final String BEANS_XML = "Beans.xml";

    public static void main(String[] args) {

        printComputerNameFromAnnotationContext();

        printComputerNameFromClassPathXmlContext();

        printComputerNameFromBeanFactory();

    }

    private static void printComputerNameFromBeanFactory() {
        BeanFactory beanFactory = getBeanFactory();
        Computer bean = beanFactory.getBean(Computer.class);
        System.out.println("Computer name is " + bean.getName());
    }

    private static void printComputerNameFromAnnotationContext() {
        ApplicationContext context = getAnnotationContext();
        Computer computer = context.getBean(Computer.class);
        String name = computer.getName();
        System.out.println("Computer name is " + name);
    }

    private static void printComputerNameFromClassPathXmlContext() {
        ApplicationContext context = getClassPathXmlContext();
        Computer computer = context.getBean(Computer.class);
        String name = computer.getName();
        System.out.println("Computer name is " + name);
    }

    private static ApplicationContext getClassPathXmlContext(){
        return new ClassPathXmlApplicationContext(BEANS_XML);
    }

    private static ApplicationContext getAnnotationContext(){
        return new AnnotationConfigApplicationContext(Config.class);
    }

    private static BeanFactory getBeanFactory(){
        Resource resource = new ClassPathResource(BEANS_XML);
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        return beanFactory;
    }
}
