package com.user.controller;




import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.Entities.Contact;
import com.user.Entities.User;
import com.user.serviceImpul.UserServiceImpul;


@RequestMapping("/user")
@RestController
public class User_controller {
	
	@Autowired
	private UserServiceImpul serviceImpul;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long id) {
		
		User user = this.serviceImpul.getUser(id);
		//http://localhost:9002/contact/user/124
		
	List<Contact> contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+id, List.class);
	user.setContacts(contacts);
		return user;
				
		
	}

}
