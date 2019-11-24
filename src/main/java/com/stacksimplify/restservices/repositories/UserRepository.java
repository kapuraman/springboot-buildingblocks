package com.stacksimplify.restservices.repositories;

import com.stacksimplify.restservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;



//Repository
public interface UserRepository extends JpaRepository <User,Long>{

	 User findByUsername(String username);
	 
}
