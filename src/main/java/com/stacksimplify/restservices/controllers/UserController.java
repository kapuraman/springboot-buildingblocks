package com.stacksimplify.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.services.UserService;

//Controller
@RestController
public class UserController {
	
	//Autowire the UserService
	@Autowired
	private UserService userService;
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
		
	}
	//getUserByID
	
	@GetMapping("/users/{id}")
	public Optional <User> getUserById(@PathVariable("id") Long id)
	{
		return userService.getUserbyID(id);
		
	}
	
	//updateUserById
	@PutMapping("/users/{id}")
	public User updateUserbyId(@PathVariable("id") Long id, @RequestBody User user)
	{
		
		return userService.updateUserbyId(id,user);
		
	}
	
	//updateUserById
	@DeleteMapping("/users/{id}")
	public void deleteUserbyId(@PathVariable("id") Long id)
	{
		userService.deleteUserbyId(id);
	}
	
	@GetMapping("/users/byusername/{username}")
	public User getUserById(@PathVariable("username") String  username)
	{
		return userService.getUserByUsername(username);
		
	}
}
