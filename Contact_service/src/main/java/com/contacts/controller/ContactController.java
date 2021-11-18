package com.contacts.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.contacts.Entities.Contact;
import com.contacts.contactServiceImpul.ContactServiceImpul;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactServiceImpul contactServiceImpul;
	

	
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContactList(@PathVariable("userId") Long id){
		System.out.println("contact");
		List<Contact> listOfContacts = this.contactServiceImpul.getListOfContacts(id);
		for(Contact c:listOfContacts) {
			System.out.println(c);
		}
		return this.contactServiceImpul.getListOfContacts(id);
	}
}
