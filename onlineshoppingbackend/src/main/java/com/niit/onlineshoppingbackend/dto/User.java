package com.niit.onlineshoppingbackend.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.internal.NotNull;

public class User {

	@Id
	@GeneratedValue
	private String usersId;

	@NotNull
	@Column(name = "username", unique = true, columnDefinition = "VARCHAR(35)")
	private String username;

	private String password;

	@NotNull
	private long phoneNo;

	@NotNull
	@Column(name = "emailid", unique = true, columnDefinition = "VARCHAR(35)")
	private String emailid;

	private String adress;
	private int zipCode;
	private boolean enabled;
}
