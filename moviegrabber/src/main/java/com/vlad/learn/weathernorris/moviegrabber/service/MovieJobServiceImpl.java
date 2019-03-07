package com.vlad.learn.weathernorris.moviegrabber.service;

import com.vlad.learn.weathernorris.moviegrabber.model.MovieJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.HtmlUtils;

import java.util.Arrays;
import java.util.Base64;

@Component
@Slf4j
public class MovieJobServiceImpl implements MovieJobService {

    final String API_URL;
    final String API_KEY;
    RestTemplate restTemplate;

    public MovieJobServiceImpl(
            @Value("${omdbapi.url}") String api_url,
            @Value("${omdbapi.key}") String api_key,
            @Autowired RestTemplate restTemplate
    ) {
        API_URL = api_url;
        API_KEY = api_key;
        this.restTemplate = restTemplate;
    }

    @Override
    public MovieJob createMovieJob(String movieName) {
        ResponseEntity<String> result = restTemplate.getForEntity(getUrl(movieName), String.class);
        return null;
    }
    private String getUrl(String movieName) {
        String formatted = String.format(
                "%s/?apikey=%s&t=%s",
                API_URL,
                API_KEY,
                HtmlUtils.htmlEscape(movieName)
        );
        log.debug("Calling remote url: " + formatted);
        return formatted;
    }
}
