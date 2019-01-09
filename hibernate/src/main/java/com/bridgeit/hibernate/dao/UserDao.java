package com.bridgeit.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeit.hibernate.model.Note;
import com.bridgeit.hibernate.model.User;

@Repository
public class UserDao {
	
	 @Autowired
	   private SessionFactory sessionFactory;
	
public boolean save(User user) {
	System.out.println(sessionFactory);
	if(sessionFactory!=null)
	{
		sessionFactory.getCurrentSession().persist(user);
		return true;
	}
	return false;
}

public boolean saveNote(Note note) {
	System.out.println(sessionFactory);
	if(sessionFactory!=null)
	{
		sessionFactory.getCurrentSession().save(note);
		return true;
	}
	return false;
}
}
