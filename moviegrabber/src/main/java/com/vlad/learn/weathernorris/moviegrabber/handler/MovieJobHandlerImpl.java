package com.vlad.learn.weathernorris.moviegrabber.handler;

import com.vlad.learn.weathernorris.moviegrabber.model.MovieJob;
import com.vlad.learn.weathernorris.moviegrabber.service.MovieJobService;
import org.springframework.stereotype.Component;

@Component
public class MovieJobHandlerImpl implements MovieJobHandler {

    private MovieJobService movieJobService;

    public MovieJobHandlerImpl(MovieJobService movieJobService) {
        this.movieJobService = movieJobService;
    }

    @Override
    public MovieJob handle(String movieName) {
        MovieJob movieJob = movieJobService.createMovieJob(movieName);
//        Poster poster = posterService.fetchPoster(movieJob);
        return movieJob;
    }
}
