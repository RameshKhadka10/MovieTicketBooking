/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author dell
 */
@Entity
@Table(name="seatreserved_tbl")
public class SeatReserved implements Serializable {
    private static final long serialVersionUID=113456L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int seat_reserved_id;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="seat_id",nullable=false)
    private Seat seat;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="screening_id" ,nullable=false)
    private Screening screening;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="reservation_id" ,nullable=false)
    private Reservation reservation;

    public SeatReserved() {
    }

    public int getSeat_reserved_id() {
        return seat_reserved_id;
    }

    public void setSeat_reserved_id(int seat_reserved_id) {
        this.seat_reserved_id = seat_reserved_id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    
}
