package com.example.project.model;

import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name = "cast")
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "cast", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MovieCast> movieCasts = new ArrayList<>();

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "img", nullable = false, length = 500)
    private String img;

    @Column(name = "age")
    private Integer age;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MovieCast> getMovieCasts() {
        return movieCasts;
    }

    public void setMovieCasts(List<MovieCast> movieCasts) {
        this.movieCasts = movieCasts;
    }

    // ... getters and setters
}
