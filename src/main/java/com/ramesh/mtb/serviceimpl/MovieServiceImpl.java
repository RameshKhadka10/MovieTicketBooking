/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.serviceimpl;

import com.ramesh.mtb.dao.MovieDao;
import com.ramesh.mtb.model.Movie;
import com.ramesh.mtb.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dell
 */
@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieDao movieDao;
    
    @Override
    public void addMovie(Movie mov) {
        movieDao.insert(mov);
        
    }

    @Override
    public List<Movie> getAllMovie() {
       return movieDao.selectAll();
    }
    
}
 