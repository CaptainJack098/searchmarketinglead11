package com.search.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.Entity.Lead;
import com.search.Repository.StudentRepository;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
@Autowired
StudentRepository studRepo;

 //localhost:8080/api/leads
@GetMapping
public List<Lead> getAllLeads(){
	
         List<Lead> leads = studRepo.findAll();	
         return leads;
}

//localhost:8080/api/leads
@PostMapping
public void saveOneLead(@RequestBody Lead lead) {
	studRepo.save(lead);
}
//localhost:8080/api/leads
@PutMapping
public void updateOneLead(@RequestBody Lead lead) {
	studRepo.save(lead);
}
//localhost:8080/api/leads/10
@DeleteMapping("/{id}")
public void deleteOneLead(@PathVariable("id") long id) {
	studRepo.deleteById(id);
}
//localhost:8080/api/leads/4
@GetMapping("/{id}")
public Lead getOneLead(@PathVariable("id") long id) {
	Optional<Lead> findById = studRepo.findById(id);
	 Lead lead = findById.get();
	 return lead;
}
}
