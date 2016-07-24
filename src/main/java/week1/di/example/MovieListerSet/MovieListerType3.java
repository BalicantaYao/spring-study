/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.di.example.MovieListerSet;

import week1.di.example.MovieFinder;

import java.util.ArrayList;
import java.util.List;

/**
 * The <code> MovieListerSet </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
public class MovieListerType3 {

    private MovieFinder movieFinder;

    // Type 3 IoC (constructor injection)
    public MovieListerType3(MovieFinder finder) {
        this.movieFinder = finder;
    }

    public List<String> getMovieNameContainWord(String word){
        List<String> result = new ArrayList<>();
        List<String> all = movieFinder.findAll();
        for (String movieName : all) {
            if(movieName.contains(word)){
                result.add(movieName);
            }
        }
        return result;
    }
}
