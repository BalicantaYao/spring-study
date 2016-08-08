/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week2.beans;

/**
 * The <code> AnimalFacotry </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/8/7.
 */
public class AnimalFactory {

    public Dog createDog(){
        return new Dog();
    }

    public Cat createCat(){
        return new Cat();
    }
}
