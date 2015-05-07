package com.rest.dao;

import org.hibernate.Session;

import com.rest.model.User;

public class HibernateMain {

	public static void main(String[] args) {

		User user =new User();
		user.setName("Sudipta Sarkar");

		//Get Session
        Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(user);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Employee ID="+user.getId());

        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionAnnotationFactory().close();
	}

}
