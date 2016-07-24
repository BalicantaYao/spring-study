/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.di.example.servicelocator;

import week1.di.example.MovieFinder;

/**
 * The <code> ServiceLocator </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
public class ServiceLocator {

    private static ServiceLocator soleInstance;

    private MovieFinder movieFinder;

    public static void load(ServiceLocator arg) {
        soleInstance = arg;
    }

    public ServiceLocator(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public static MovieFinder movieFinder() {
        return soleInstance.movieFinder;
    }
}
