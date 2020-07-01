/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.controller;

import com.ramesh.mtb.dao.MovieDao;
import com.ramesh.mtb.dao.ScreeningDao;
import com.ramesh.mtb.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dell
 */
@Controller
public class UserController {
    
    @Autowired
    MovieDao movieDao;
    ScreeningDao screeningDao;
    @RequestMapping(value={"/","/home"},method=RequestMethod.GET)
    public String index(){
        return "index";
    }
    
    @RequestMapping(value="/about",method=RequestMethod.GET)
    public String about(){
        return "about";
    }
    
    @RequestMapping(value="/ticket",method=RequestMethod.GET)
    public String ticketRate(){
        return "ticketrate";
    }
    
    @RequestMapping(value="/contact",method=RequestMethod.GET)
    public String contact(){
        return "contact";
    }
    
    @RequestMapping(value="/book/show",method=RequestMethod.GET)
    public String bookMovies(@RequestParam("id") int id,Model model){
      // ModelAndView mv=new ModelAndView();
       //Movie mov= movieDao.getMovieById(id);
       model.addAttribute("movielist",movieDao.selectAllById(id));
       //model.addAttribute("moviedetails",movieDao.getMovieById(id));
     // model.addAttribute("moviedetails",screeningDao.selectAllById(id));
      return "bookmovie";
      
        
       
    }
    
//    @RequestMapping(value="/book/show{id}",method=RequestMethod.GET)
//    public ModelAndView movieShow(@PathVariable("id") int id){
//       ModelAndView mv=new ModelAndView();
//       Movie mov= movieDao.getMovieById(id);
//       mv.addObject("moviedetails",mov);
//       mv.setViewName("bookmovie.jsp");
//        return mv;
//    }
}
