package com.example.project.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "movies")
public class Movie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
private List<MovieCast> movieCasts = new ArrayList<>();

@Column(name = "movie_name")
private String movieName;

@Column(name = "release_date")
private Date releaseDate;

@Column(name = "trailer_url")
private String trailerUrl;

@Column(name = "director")
private String director;

@Lob
@Column(columnDefinition = "TEXT")
private String description;

@Column(name = "img_url")
private String imgUrl;

@Column(name = "rating")
private Integer rating;

@Column(name = "genre")
private String genre;

@Column(name = "duration")
private String duration;

@Column(name = "run_time")
private String runTime;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
// Getters and setters

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public List<MovieCast> getMovieCasts() {
    return movieCasts;
}

public void setMovieCasts(List<MovieCast> movieCasts) {
    this.movieCasts = movieCasts;
}



}