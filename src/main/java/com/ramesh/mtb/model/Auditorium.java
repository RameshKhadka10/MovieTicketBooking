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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dell
 */
@Entity
@Table(name="auditorium_tbl")
public class Auditorium implements Serializable{
    private static final long serialVersionUID=113456L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int auditorium_id;
    private String name;
    
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.DETACH, mappedBy="auditorium")
    private List<Screening> screening;
    
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.DETACH, mappedBy="auditorium")
    private List<Seat> seat;

    public Auditorium() {
    }

    public Auditorium(int auditorium) {
        this.auditorium_id=auditorium;
    }

    public int getAuditorium_id() {
        return auditorium_id;
    }

    public void setAuditorium_id(int auditorium_id) {
        this.auditorium_id = auditorium_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Screening> getScreening() {
        return screening;
    }

    public void setScreening(List<Screening> screening) {
        this.screening = screening;
    }

    public List<Seat> getSeat() {
        return seat;
    }

    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Auditorium{" + "auditorium_id=" + auditorium_id + ", name=" + name + '}';
    }

   
    
    
    
    
}
