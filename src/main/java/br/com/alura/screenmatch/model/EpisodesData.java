package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record EpisodesData(@JsonAlias("Title")String title,
                           @JsonAlias("Episode") Integer episode,
                           @JsonAlias("imdbRating") String imdbRating,
                           @JsonAlias("Released") String released) {
}
