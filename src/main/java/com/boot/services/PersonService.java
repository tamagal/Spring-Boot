package com.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.boot.model.Person;
import com.boot.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository prepo;
	
	public List<Person> getPeople(){
		return (List<Person>) prepo.findAll();
	}
	
	public void putPerson(Person p) {
		prepo.save(p);
	}
	
	public void removePerson(Person p) {
		prepo.delete(p);
	}
	
	public void removePerson(Integer sno) {
		prepo.deleteBySno(sno);
	}
	
	
}
