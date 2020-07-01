/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.dao;

import com.ramesh.mtb.model.Movie;
import java.util.List;

/**
 *
 * @author dell
 */
public interface MovieDao {
    void insert(Movie mov);
    List<Movie> selectAll();
   List<Movie> getMovieById(int id);
    List<Movie> selectAllById(int id);
}
