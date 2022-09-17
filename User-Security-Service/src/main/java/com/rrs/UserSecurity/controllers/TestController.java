package com.rrs.UserSecurity.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrs.UserSecurity.models.User;
import com.rrs.UserSecurity.repository.UserRepository;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/user")
	public String userAccess() {
		return "User Content.";
	}
	@GetMapping("/mod")
	public String moderatorAccess() {
		return "Moderator Board.";
	}
	@GetMapping("/admin")
	public String adminAccess() {
		return "Admin Board.";
	}
	
	@GetMapping("/list/{id}")
	public Optional<User> registerUser(@Valid @PathVariable String id) {
		
		return repository.findById(id);


	}
	
	@GetMapping("/")
	public String check() {
		return "hii";
	}
	
}