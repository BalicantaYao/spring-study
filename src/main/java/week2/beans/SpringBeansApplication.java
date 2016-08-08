/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week2.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The <code> SpringBeansApplication </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/8/7.
 */
public class SpringBeansApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        // Basic Example
        Dog myDog = (Dog) context.getBean("mydog");
        myDog.wow();

        // Alias Example
        Dog dog = (Dog) context.getBean("yourdog");
        dog.wow();

        // Static Factory Example
        Dog factoryDog = (Dog) context.getBean("staticFactoryDog");
        factoryDog.wow();

        // Static Factory Example
        Dog beanFactoryDog = (Dog) context.getBean("beanFactoryDog");
        beanFactoryDog.wow();

        Cat beanFactoryCat = (Cat) context.getBean("beanFactoryCat");
        beanFactoryCat.mi();
    }
}
