package com.vlad.learn.weathernorris.moviegrabber.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "jobId")
public class MovieJob {
    private long jobId;
    private String movieName;
}
