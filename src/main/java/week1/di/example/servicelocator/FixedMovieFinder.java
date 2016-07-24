/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.di.example.servicelocator;

import week1.di.example.MovieFinder;

import java.util.ArrayList;
import java.util.List;

/**
 * The <code> FixedMovieFinder </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
public class FixedMovieFinder implements MovieFinder {

    private static List<String> movieRepository = new ArrayList<>();

    public FixedMovieFinder() {
        movieRepository.add("Star Trek Beyond");
        movieRepository.add("Don't Think Twice");
    }

    @Override
    public List<String> findAll() {
        return movieRepository;
    }
}
