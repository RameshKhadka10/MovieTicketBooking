/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.service;

import com.ramesh.mtb.model.Movie;
import java.util.List;

/**
 *
 * @author dell
 */
public interface MovieService {
    void addMovie(Movie mov);
    List<Movie> getAllMovie();
}
