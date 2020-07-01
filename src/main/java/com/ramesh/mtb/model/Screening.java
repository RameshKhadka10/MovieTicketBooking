/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.model;


import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dell
 */
@Entity
@Table(name="screening_tbl")
public class Screening implements Serializable{
    private static final long serialVersionUID=113456L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int screening_id;
    private LocalDate screening_date;
    private LocalTime screening_time;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH)
    @JoinColumn(name="movie_id" ,nullable=false)
    private Movie movie;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH)
    @JoinColumn(name="auditorium_id" ,nullable=false)
    private Auditorium auditorium;
    
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.DETACH, mappedBy="screening")
    private List<SeatReserved> seatreserved;
    
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="screening")
    private List<Reservation> reservation;

    public Screening() {
    }

    public Screening(int screening_id, LocalDate screening_date, LocalTime screening_time, Movie movie, Auditorium auditorium, List<SeatReserved> seatreserved, List<Reservation> reservation) {
        this.screening_id = screening_id;
        this.screening_date = screening_date;
        this.screening_time = screening_time;
        this.movie = movie;
        this.auditorium = auditorium;
        this.seatreserved = seatreserved;
        this.reservation = reservation;
    }
    

    public int getScreening_id() {
        return screening_id; 
    }

    public void setScreening_id(int screening_id) {
        this.screening_id = screening_id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public List<SeatReserved> getSeatreserved() {
        return seatreserved;
    }

    public void setSeatreserved(List<SeatReserved> seatreserved) {
        this.seatreserved = seatreserved;
    }

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    public LocalDate getScreening_date() {
        return screening_date;
    }

    public void setScreening_date(LocalDate screening_date) {
        this.screening_date = screening_date;
    }

    public LocalTime getScreening_time() {
        return screening_time;
    }

    public void setScreening_time(LocalTime screening_time) {
        this.screening_time = screening_time;
    }

    

   
    
    
}
