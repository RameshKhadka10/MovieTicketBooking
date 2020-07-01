/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author dell
 */
@Entity
@Table(name="movie_tbl")
public class Movie implements Serializable {
    private static final long serialVersionUID=113456L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int movie_id;
    private String title;
    private String genre;
    private String director;
    private String cast;
    private String description;
    private int duration_min;
    
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.DETACH, mappedBy="movie")
    private List<Screening> screening;

    public Movie() {
    }

    public Movie(int movie_id, String title, String genre, String director, String cast, String description, int duration_min, List<Screening> screening) {
        this.movie_id = movie_id;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.description = description;
        this.duration_min = duration_min;
        this.screening = screening;
    }

    public Movie(int id) {
        this.movie_id=id;
    }
    
    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration_min() {
        return duration_min;
    }

    public void setDuration_min(int duration_min) {
        this.duration_min = duration_min;
    }

    public List<Screening> getScreening() {
        return screening;
    }

    public void setScreening(List<Screening> screening) {
        this.screening = screening;
    }

    @Override
    public String toString() {
        return "Movie{" + "movie_id=" + movie_id + ", title=" + title + ", genre=" + genre + ", director=" + director + ", cast=" + cast + ", description=" + description + ", duration_min=" + duration_min + '}';
    }

    
    
    
    
    
}
