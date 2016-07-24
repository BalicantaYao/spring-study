/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package week1.di.example.servicelocator;

import week1.di.example.MovieListerSet.MovieLister;
import week1.di.example.MovieListerSet.MovieListerType2;
import week1.di.example.MovieListerSet.MovieListerType3;

import java.util.List;

/**
 * The <code> Tester </code>
 *
 * @author Redick.Yao
 * @version 1.0, Created at 2016/7/24.
 */
public class Tester {

    public void testType2MoviceLister(){
        MovieListerType2 movieListerType2 = new MovieListerType2();
        movieListerType2.setMovieFinder(new FixedMovieFinder());
        movieListerType2.getMovieNameContainWord("S");
    }

    public void testType3MoviceLister(){
        MovieListerType3 movieListerType3 = new MovieListerType3(new FixedMovieFinder());
        movieListerType3.getMovieNameContainWord("S");
    }

    public void testServiceLocator() {

        ServiceLocator.load(new ServiceLocator(new FixedMovieFinder()));

        MovieLister lister = new MovieLister();
        List<String> movieNameContainWord = lister.getMovieNameContainWord("M");
        for (String movie : movieNameContainWord) {
            System.out.println(movie);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
    }
}
