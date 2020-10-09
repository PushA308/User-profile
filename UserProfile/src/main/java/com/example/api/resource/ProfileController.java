package com.example.api.resource;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Profile;
import com.example.api.repository.ProfileRepo;

@RestController
@RequestMapping("/userData")
public class ProfileController {
	@Autowired
	private ProfileRepo pRepository;
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public Profile saveProfile(@Validated @RequestBody Profile profile) {
		profile.set_id(ObjectId.get());
		pRepository.save(profile);
		return profile;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Profile> getProfile(){
		return pRepository.findAll();
	}
	
	/* This code is added
	   in newfeature branch
	*/
	//---------------------------------
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public void modifyProfileById(@PathVariable("id") objectId id, @validated @RequestBody Profile profile){
		profile.set-id(id);
		pRepository.save(profile);
	}
	//----------------------------------

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteProfile(@PathVariable ObjectId id) {
		pRepository.delete(pRepository.findBy_id(id));
	}
	
}

