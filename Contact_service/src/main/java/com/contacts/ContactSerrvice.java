package com.contacts;

import java.util.List;

import com.contacts.Entities.Contact;

public interface ContactSerrvice {
	public List<Contact> getListOfContacts(Long userId);

}
