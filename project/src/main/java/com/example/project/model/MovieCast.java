package com.example.project.model;

import jakarta.persistence.*;
@Entity
public class MovieCast {

    @EmbeddedId
    private MovieCastId id;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @MapsId("castId")
    @JoinColumn(name = "cast_id")
    private Cast cast;

    // Constructors
    public MovieCast() {
    }

    public MovieCast(Movie movie, Cast cast) {
        this.movie = movie;
        this.cast = cast;
        this.id = new MovieCastId(movie.getId(), cast.getId());
    }
}
