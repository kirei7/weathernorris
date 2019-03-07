package com.vlad.learn.weathernorris.moviegrabber.rest;

import com.vlad.learn.weathernorris.moviegrabber.handler.MovieJobHandler;
import com.vlad.learn.weathernorris.moviegrabber.model.MovieJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieJobs")
public class MovieJobResource {

    @Autowired
    private MovieJobHandler handler;

    @PostMapping
    public MovieJob movieJob(@RequestBody String movieName) {
        return handler.handle(movieName);
    }
}
