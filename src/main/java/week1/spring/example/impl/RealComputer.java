/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.spring.example.impl;

import week1.spring.example.Computer;

/**
 * The <code> MockComputer </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
public class RealComputer implements Computer {

    @Override
    public String getName() {
        return "Real Computer";
    }
}
