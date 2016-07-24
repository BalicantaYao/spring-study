/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import week1.spring.example.impl.RealComputer;

/**
 * The <code> Config </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
@Configuration
public class Config {

    @Bean(name="computer")
    public Computer getComputer() {
        return new RealComputer();
    }
}
