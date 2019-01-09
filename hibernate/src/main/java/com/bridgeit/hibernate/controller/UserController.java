package com.bridgeit.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.hibernate.model.Note;
import com.bridgeit.hibernate.model.User;
import com.bridgeit.hibernate.service.IService;


@RestController
public class UserController 
{
	@Autowired
	//@Qualifier("getIservice")
	IService userService;

	public UserController()
	{
		
	}
	
	public UserController(IService iService)
	{
		System.out.println("gdhsgdhsg");
		this.userService=iService;
		//System.out.println(userService);
	}
	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("HI");
		return "Welcome to home page";
	}
	
	@RequestMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody User user)
	{
		boolean check=userService.addUser(user);
		if(check)
		return new ResponseEntity<String>("registered successfully",HttpStatus.OK);
		return new ResponseEntity<String>("registered unsuccessfully",HttpStatus.NOT_FOUND);
	}
	@RequestMapping("/addNote")
	public ResponseEntity<String> addNote(@RequestBody Note note)
	{
		boolean check=userService.addNote(note);
		if(check)
		return new ResponseEntity<String>("registered successfully",HttpStatus.OK);
		return new ResponseEntity<String>("registered unsuccessfully",HttpStatus.NOT_FOUND);
	}
}
