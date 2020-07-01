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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dell
 */
@Entity
@Table(name="reservation_tbl")
public class Reservation implements Serializable{
    private static final long serialVersionUID=113456L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int reservation_id;
    private boolean reserved;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="user_id" ,nullable=false)
    private User user;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="screening_id" ,nullable=false)
    private Screening screening;
    
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="reservation")
    private List<SeatReserved> seatReserved;

    public Reservation() {
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public List<SeatReserved> getSeatReserved() {
        return seatReserved;
    }

    public void setSeatReserved(List<SeatReserved> seatReserved) {
        this.seatReserved = seatReserved;
    }

   
    
    
}
