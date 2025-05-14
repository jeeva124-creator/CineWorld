package com.example.project.model;



import java.io.Serializable;
import jakarta.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class MovieCastId implements Serializable {

    private Long movieId;
    private long castId;

    public MovieCastId() {}

    public MovieCastId(Long movieId, long castId) {
        this.movieId = movieId;
        this.castId = castId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieCastId that)) return false;
        return Objects.equals(movieId, that.movieId) &&
                Objects.equals(castId, that.castId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, castId);
    }
}
