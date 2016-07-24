/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.ioc.example;

import java.util.Scanner;

/**
 * The <code> NonIocConcept </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/23.
 */
public class NonIocConceptExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("Hi, What is your name?");
        String name = scanner.next();
        System.out.println("Hello " + name);

        // Welcome Message
        System.out.println("Which language is your favorite?");
        System.out.println("1. Java");
        System.out.println("1. Python");
        System.out.println("3. Ruby");

        // Answer
        int choose = scanner.nextInt();
        if(choose == 1){
            System.out.println("Java is really Good!");
        } else if(choose == 2){
            System.out.println("Python is really Good!");
        } else if(choose == 3){
            System.out.println("Ruby is really Good!");
        }
    }

}
