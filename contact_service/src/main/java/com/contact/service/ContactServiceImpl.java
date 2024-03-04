package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	//Fake list of Contacts
	  List<Contact> list;

	
	public ContactServiceImpl() {
		
		list=List.of(
						new Contact(1L, "amit@gmail.com", "Amit", 1311L),
						new Contact(2L, "anil@gmail.com", "Anil", 1311L),
						new Contact(3L, "rohan@gmail.com", "Rohan", 1314L)
					);
		
	}


	@Override
	public List<Contact> getContactofUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
	
	
	
}
