package com.arun.HibernateSecond;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondMain {

	public static void main(String[] args) throws IOException 
	{
        Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	
    	SessionFactory sf=config.buildSessionFactory();
    	
    	Session session=sf.openSession();
    			
    	Student std=session.load(Student.class,505);
    	
    	System.out.println(std.getRoll());
    	
    	System.in.read();
    	
    	System.out.println(std.getName());
    	
    	System.in.read();
    	
    	Student std1=session.load(Student.class,505);
    	
        System.out.println(std1.getRoll());
    	
    	System.out.println(std1.getName());
    	
    	
    	
    	
    	
    	
    	session.close();
     	
	}

}
