package com.stacksimplify.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity ( POJO which can be persisted into a DB . every instance will represent a row in a table. Entity Name default to class
@Entity
@Table(name = "user")

public class User {
	//testing
	 @Id
	 @GeneratedValue
	 private Long id;
	 
	 @Column(name="USER_NAME",length=50, nullable=false,unique=true)
	 private String username;
	 @Column(name="FIRST_NAME",length=50, nullable=false)
	 private String firstname;
	 @Column(name="LAST_NAME",length=50, nullable=false)
	 private String lastname;
	 @Column(name="EMAIL_ADDRESS",length=50, nullable=false)
	 private String email;
	 @Column(name="ROLE",length=50, nullable=false)
	 private String role;
	 @Column(name="SSN",length=50, nullable=false,unique=true)
	 private String ssn;
	
	 
	 //no Argument constructor
	 public User() {
			// TODO Auto-generated constructor stub
		}
	 
	 // Fields Constructor
	 
	 public User(Long id, String username, String firstname, String lastname, String email, String role, String ssn) {
			this.id = id;
			this.username = username;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.role = role;
			this.ssn = ssn;
		}

	 // getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	 
	 // to string
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
	 

	 
}
