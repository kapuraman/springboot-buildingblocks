package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.repositories.UserRepository;

//service
@Service
public class UserService {
//Autowire the userrepository
	@Autowired
	private UserRepository userRepository;
	
	//getAllUsers Method
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	public User createUser(User user)
	{
		return userRepository.save(user);
		
	}
	
	public Optional <User> getUserbyID(Long id)
	{
		Optional <User> user = userRepository.findById(id);
		return user;
		
	}
	
	public User updateUserbyId(Long id , User user)
	{
		user.setId(id);
		return userRepository.save(user);
		
	}
	
	public void deleteUserbyId(Long id)
	{
		if(userRepository.findById(id).isPresent())
		{
			userRepository.deleteById(id);
		}
		
	}
	
	public User getUserByUsername(String username)
	{
		return userRepository.findByUsername(username);
		
	}
	
	
}
