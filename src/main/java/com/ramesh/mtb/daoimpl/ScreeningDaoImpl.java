/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.daoimpl;

import com.ramesh.mtb.dao.ScreeningDao;
import com.ramesh.mtb.model.Screening;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.hql.internal.QueryExecutionRequestException;
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
public class ScreeningDaoImpl implements ScreeningDao{

    @Autowired
    private SessionFactory sessionFactory;
     
    @Override
    public int getMovieId(String title) {
       Session session=sessionFactory.openSession();
       Transaction tx=session.beginTransaction();
       String hql="SELECT movie_id,title FROM Movie where title=:title";
       Query query=session.createQuery(hql);
       query.setParameter("title", title);
       Object[] id=(Object[]) query.uniqueResult();
       int mid=Integer.parseInt(id[0].toString());
        session.getTransaction().commit();
        session.close();
        return mid;
    }

    @Override
    public void insertScreening(Screening s) {
        try(Session session = sessionFactory.openSession()){
          Transaction tx=session.beginTransaction();
          session.save(s);
          tx.commit();
          session.close();
        }
    
}

    @Override
    public List<Screening> selectAll() {
        List<Screening> sl=null;
        try(Session session = sessionFactory.openSession()){
         session.beginTransaction();
        // session.createQuery("FROM Auditorium");
         sl=session.createQuery("select e.screening_id,e.screening_date,e.screening_time,a.name,m.title from Screening as e,Auditorium as a,Movie as m where e.auditorium=a.auditorium_id and e.movie=m.movie_id").list();
         session.getTransaction().commit();
          session.close();
          
        }
        
        return sl;
    }
// screening data time ra movie data retrieve garna la ..
    @Override
    public List<Screening> selectAllById(int id) {
        List<Screening> s2=null;
        try(Session session = sessionFactory.openSession()){
         session.beginTransaction();
        // session.createQuery("FROM Auditorium");
         String hql=("select m.title,m.cast,m.director,s.screening_date,s.screening_time from Movie as m,Screening as s inner join Screening where m.movie=:mid");
         Query query=session.createQuery(hql);
         query.setParameter("mid",id);
         s2=query.list();
         session.getTransaction().commit();
         session.close();
          
        }
        return s2;
    }
    
}
