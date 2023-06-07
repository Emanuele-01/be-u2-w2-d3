package com.example.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="user")
@Data
public class User {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String name;
	private String lastName;
	private int age;
	
	
	
	public User(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
}
