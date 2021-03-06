package com.librarysystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column(name = "user_name", length = 20, nullable = false, unique = true, updatable = false)
	private String userName;
	
	@Column
	private String password;
	
	@ManyToOne
	@JoinColumn(name ="role_id")
	private Role role ;
	
	
	
}
