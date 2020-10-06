package com.example.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Profile")
public class Profile {
	@Id
	private String firstName;
	private String lastName;
	private int age;
	private int mobileNumber;
	
}
