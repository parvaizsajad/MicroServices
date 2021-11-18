package com.contacts.contactServiceImpul;


import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contacts.ContactSerrvice;
import com.contacts.Entities.Contact;
@Service
public class ContactServiceImpul implements ContactSerrvice {
	
	//fske contsct service
	List<Contact> list=List.of(
			new Contact(12L,"Parvaiz","parvaizsajjad@gmail.com",123L),
			new Contact(13L,"Sajad","sajjad@gmail.com",124L),
			new Contact(14L,"Mir","mir@gmail.com",123L),
			new Contact(15L,"baabji","baabji@gmail.com",124L));

	public List<Contact> getListOfContacts(Long userId) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(contact->contact.getUser_id().equals(userId)).collect(Collectors.toList());
	}

}
