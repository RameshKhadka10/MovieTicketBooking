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
@Table(name="seat_tbl")
public class Seat implements Serializable{
    private static final long serialVersionUID=113456L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int seat_id;
    
    private String row;
    private String number;
    
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.DETACH, mappedBy="seat")
    private List<SeatReserved> seatReserved;

    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH)
    @JoinColumn(name="auditorium_id" ,nullable=false)
    private Auditorium auditorium;
    
    public Seat() {
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public List<SeatReserved> getSeatReserved() {
        return seatReserved;
    }

    public void setSeatReserved(List<SeatReserved> seatReserved) {
        this.seatReserved = seatReserved;
    }

    
    
    
    
}
