package com.bridgeit.hibernate.service;

import com.bridgeit.hibernate.model.Note;
import com.bridgeit.hibernate.model.User;

public interface IService 
{
	public boolean addUser(User user);

	public boolean addNote(Note note);
}
