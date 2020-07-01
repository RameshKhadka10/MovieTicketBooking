/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.controller;

import com.ramesh.mtb.model.Movie;
import com.ramesh.mtb.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author dell
 */
@Controller
public class AdminController {
    @Autowired
    MovieService movieService;
    
    @RequestMapping(value="/admin",method=RequestMethod.GET)
    public String adminhome(){
        return "/admin/adminhome";
    }
    
    @RequestMapping(value="/addmovie",method=RequestMethod.GET)
    public String addMovie(){
        return "/admin/book";
    }
    
   @RequestMapping(value="/addmovie", method=RequestMethod.POST)
    public String saveMovie(@RequestParam("title") String title, 
                                @RequestParam("genre") String genre,
                                @RequestParam("director") String director,@RequestParam("cast") String cast,@RequestParam("duration") int duration,
                                @RequestParam(" n") String description){
        Movie mov=new Movie();
        mov.setTitle(title);
        mov.setCast(cast); 
        mov.setDescription(description);
        mov.setDirector(director);
        mov.setDuration_min(duration);
        mov.setGenre(genre);
        movieService.addMovie(mov);
        
        return "redirect:/addmovie ";
    }
    
    @RequestMapping(value="/displaymovie",method=RequestMethod.GET)
    public String displayMovie(Model model){
        List<Movie> ml=movieService.getAllMovie();
        model.addAttribute("movielist",ml);
        return "/admin/displaymovie";
    }
    
}
