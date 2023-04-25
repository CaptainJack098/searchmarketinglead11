package com.search.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.Entity.Lead;
import com.search.Repository.StudentRepository;

@Service
public class LeadSeviceImpl implements LeadService {

	@Autowired
	private StudentRepository studRepo;
	
	@Override
	public void saveLead(Lead lead) {
		studRepo.save(lead);

	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> leads = studRepo.findAll();
		return leads;
	}

	@Override
	public void deleteLead(long id) {
		studRepo.deleteById(id);
		
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = studRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
