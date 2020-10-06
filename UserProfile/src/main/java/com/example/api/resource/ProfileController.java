package com.example.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Profile;
import com.example.api.repository.ProfileRepo;

@RestController
public class ProfileController {
	@Autowired
	private ProfileRepo pRepository;
	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody Profile profile) {
		pRepository.save(profile);
		return "user added successfully.";
	}
	
	@GetMapping("/findAllUsers")
	public List<Profile> getUser(){
		return pRepository.findAll();
	}
	
	@DeleteMapping("/userDelete")
	public String deleteUser(@PathVariable int id) {
		pRepository.deleteAll();
		return "user deleted";
	}
	
}

