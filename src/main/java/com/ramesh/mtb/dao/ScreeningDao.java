/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.dao;

import com.ramesh.mtb.model.Screening;
import java.util.List;

/**
 *
 * @author dell
 */
public interface ScreeningDao {
    int getMovieId(String title);
    void insertScreening(Screening s);
    List<Screening> selectAll();
    List<Screening> selectAllById(int id);
}