package com.theomen.the_omen.service;

import com.theomen.the_omen.model.Movie;
import com.theomen.the_omen.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieById(int id) {
        return movieRepository.findById(id);
    }

    public Movie updateMovie(int id, Movie updatedMovie) {
        return movieRepository.findById(id).map(existing -> {
            existing.setTitulo(updatedMovie.getTitulo());
            existing.setAnio(updatedMovie.getAnio());
            existing.setRating(updatedMovie.getRating());
            existing.setPoster(updatedMovie.getPoster());
            existing.setSinopsis(updatedMovie.getSinopsis());
            return movieRepository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Movie not found: " + id));
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }
}