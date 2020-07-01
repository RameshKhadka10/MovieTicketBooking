/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.daoimpl;

import com.ramesh.mtb.dao.MovieDao;
import com.ramesh.mtb.model.Movie;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dell
 */
@Repository
public class MovieDaoImpl implements MovieDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Movie mov) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(mov);
        tx.commit();
        session.close();
    }

    @Override
    public List<Movie> selectAll() {
         List<Movie> ml = null;
       try(Session session = sessionFactory.openSession()){
           session.beginTransaction();
           ml = session.createQuery("FROM Movie").list();
           session.getTransaction().commit();
       }
       return ml;
    }

    @Override
    public List<Movie> getMovieById(int id) {
        List<Movie> m1=null;
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Query q=session.createQuery("select m.title,m.cast,m.director,m.description,m.duration_min,m.genre from Movie as m, s.screening_date,s.screening_time from Screening as s where m.movie_id=:mid");
       //Query q=session.createQuery("select title,cast,director,description,duration_min,genre from Movie where movie_id=:mid");
       q.setParameter("mid", id);
        m1=q.list();
        session.getTransaction().commit();
        session.close();
        return m1;
    }

    @Override
    public List<Movie> selectAllById(int id) {
        List<Movie> m1=null;
        Session session =sessionFactory.openSession();
        session.beginTransaction();
        String hql="select m.title,m.cast,m.director,s.screening_date,s.screening_time from Movie m,Screening s where m.movie_id=:mid";
        Query query =session.createQuery(hql);
        
       query.setParameter("mid",id);
       m1=query.list();
        session.getTransaction().commit();
        session.close();
        return m1;
    }

    
    
}
