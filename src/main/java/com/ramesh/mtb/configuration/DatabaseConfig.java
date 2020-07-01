/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.mtb.configuration;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

/**
 *
 * @author dell
 */
@Configuration
public class DatabaseConfig {
    
    @Bean
     public DataSource getDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mtb-db");
        ds.setUsername("root");
        ds.setPassword("");
        return ds;
        
    }
    
    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
    LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
    sessionFactory.setDataSource(getDataSource());
    sessionFactory.setPackagesToScan("com.ramesh.mtb.model");
    sessionFactory.setHibernateProperties(getHibernateProperties());
    return sessionFactory;
    
}
    
    public Properties getHibernateProperties(){
    Properties props=new Properties();
    props.setProperty("hibernate.hbm2ddl.auto","validate");
    props.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
    props.setProperty("hibernate.show_sql", "true");
    
    //props.setProperty("hibernate.enable_lazy_load_no_trans", "true");
    
    return props;
    
    
}
    @Bean
    public PlatformTransactionManager getTransactionManager(){
    HibernateTransactionManager transactionManager=new HibernateTransactionManager();
    transactionManager.setSessionFactory(getSessionFactory().getObject());
    return transactionManager;
}
}
