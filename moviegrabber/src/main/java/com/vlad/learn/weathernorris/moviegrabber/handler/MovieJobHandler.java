package com.vlad.learn.weathernorris.moviegrabber.handler;

import com.vlad.learn.weathernorris.moviegrabber.model.MovieJob;

public interface MovieJobHandler {
    MovieJob handle(String movieName);
}
