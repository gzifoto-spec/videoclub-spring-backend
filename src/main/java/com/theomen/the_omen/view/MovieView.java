package com.theomen.the_omen.view;

import com.theomen.the_omen.model.Movie;

import java.util.List;

public class MovieView {

    public void printMovies(List<Movie> movies) {
        movies.forEach(movie ->
                System.out.println("ID: " + movie.getId() +
                        " | Titulo: " + movie.getTitulo() +
                        " | Año: " + movie.getAnio() +
                        " | Rating: " + movie.getRating() +
                        " | Poster: " + movie.getPoster() +
                        " | Sinopsis: " + movie.getSinopsis())
        );
    }

    public void printMovie(Movie movie) {
        System.out.println("ID: " + movie.getId() +
                " | Titulo: " + movie.getTitulo() +
                " | Año: " + movie.getAnio() +
                " | Rating: " + movie.getRating() +
                " | Poster: " + movie.getPoster() +
                " | Sinopsis: " + movie.getSinopsis());
    }
}