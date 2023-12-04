package com.arun.HibernateSecond;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
//    	Configuring Hibernate.cfg.xml
    	
    	Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	
    	SessionFactory sf=config.buildSessionFactory();
    	
    	Session session=sf.openSession();
    			
    	Student std=session.get(Student.class,505);
    	
    	System.out.println(std.getName()+ " " +std.getRoll());
    	
    	Student std1=session.get(Student.class,505);
    	
    	System.out.println(std.getName()+ " " +std.getRoll());
    	
    	session.close();
     	
      
    }
}
