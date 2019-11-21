package com.cos.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.board.model.Person;
import com.cos.board.repository.PersonRepository;

@RestController
public class PersonController {

	
	@Autowired
	PersonRepository repository;
	
	@GetMapping("/person")
	public List<Person> getAllPerson() {
		
		List<Person> people = repository.findByAllId();
		return people;
	}
	
	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable int id) {

		Person person = repository.findById(id);
		return person;
	}
	
	
	
	@PostMapping("/person")
	public int setPerson(Person person) {
		
		try {
			repository.save(person);
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	@DeleteMapping("/person/{id}")
	public int deletePerson(@PathVariable int id) {
		
		try {
			repository.delete(id);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	@PatchMapping("/person")
	public int updatePerson(Person person) {
		try {

			repository.update(person);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}

}
