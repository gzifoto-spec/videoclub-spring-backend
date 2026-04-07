package com.theomen.the_omen.repository;

import com.theomen.the_omen.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {}