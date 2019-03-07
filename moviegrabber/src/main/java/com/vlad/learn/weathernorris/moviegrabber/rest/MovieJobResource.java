package com.vlad.learn.weathernorris.moviegrabber.rest;

import com.vlad.learn.weathernorris.moviegrabber.model.MovieJob;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieJobs")
public class MovieJobResource {

    @PostMapping
    public MovieJob movieJob(@RequestBody String movieName) {
        return new MovieJob(1, movieName);
    }
}
