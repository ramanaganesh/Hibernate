package com.bridgeit.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.hibernate.dao.UserDao;
import com.bridgeit.hibernate.model.Note;
import com.bridgeit.hibernate.model.User;

@Transactional
public class UserServiceImplementation implements IService
{
	@Autowired
	@Qualifier("getUserDao")
	UserDao userDao;
	
	public UserServiceImplementation()
	{
		
	}
	public UserServiceImplementation(UserDao userDao) 
	{
		this.userDao=userDao;
	}
	@Override
	public boolean addUser(User user) {
		System.out.println(userDao);
		boolean check=userDao.save(user);
		return check;
	}
	@Override
	public boolean addNote(Note note) {
		boolean check=userDao.saveNote(note);
		return check;
	}

}
