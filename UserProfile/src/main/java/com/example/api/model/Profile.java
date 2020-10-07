package com.example.api.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection="Profile")
public class Profile {
	@Id
	private ObjectId _id;
	
	private String firstName;
	private String lastName;
	private int age;
	private long mobileNumber;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date createdDate = new Date();

	public Profile() {
	
	}
	
	public Profile(ObjectId _id, String firstName, String lastName, int age, long mobileNumber, Date createdDate) {
		super();
		this._id = _id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.createdDate = createdDate;
	}

	public String get_id() {
		return _id.toHexString();
	}
	
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Date getCreatedDate() {
	    return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
	    this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Profile [_id=" + _id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", mobileNumber=" + mobileNumber + ", createdDate=" + createdDate + "]";
	}
	
	
	
}
