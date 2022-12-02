package com.example.demo;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsofUser(Long userId);
	
}
