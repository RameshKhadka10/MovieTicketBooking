/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.controller;

import com.ramesh.mtb.dao.ScreeningDao;
import com.ramesh.mtb.model.Auditorium;
import com.ramesh.mtb.model.Movie;
import com.ramesh.mtb.model.Screening;
import com.ramesh.mtb.service.MovieService;
import java.time.LocalDate;
import java.time.LocalTime;
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
public class ScreeningController {
    @Autowired
    MovieService movieService;
    @Autowired
    ScreeningDao screeningDao;
    
    @RequestMapping(value="/addscreening",method=RequestMethod.GET)
    public String addScreening(){
        return "admin/addscreening";
    }
       
    @RequestMapping(value="/displayscreening",method=RequestMethod.GET)
    public String displayScreening(Model model){
         //List<Screening> sl=screeningDao.selectAll();
         
        model.addAttribute("screeninglist",screeningDao.selectAll());
        return "admin/displayscreening";
    }
    
    @RequestMapping(value="/addscreening",method=RequestMethod.POST)
    public String saveScreening(@RequestParam("date") String d,
                                @RequestParam("time") String t,
                                 @RequestParam("auditoriumId") int auditorium,
                                 @RequestParam("title") String title){
        Screening s=new Screening();
        int id=screeningDao.getMovieId(title);
        LocalDate date=LocalDate.parse(d);
        LocalTime time=LocalTime.parse(t);
        s.setMovie(new Movie(id));
        s.setScreening_date(date);
        s.setScreening_time(time);
        s.setAuditorium(new Auditorium(auditorium));
        screeningDao.insertScreening(s);
        return "redirect:/addscreening";
        
    }
    
    
                
}
