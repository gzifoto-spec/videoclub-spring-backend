package com.theomen.the_omen.service;

import com.theomen.the_omen.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Movie createMovie(Movie movie);
    List<Movie> findAllMovies();
    Optional<Movie> findMovieById(int id);
    Movie updateMovie(int id, Movie movie);
    void deleteMovie(int id);
}