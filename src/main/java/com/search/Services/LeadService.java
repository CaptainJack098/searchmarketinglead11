package com.search.Services;

import java.util.List;

import com.search.Entity.Lead;

public interface LeadService {
	
	public void saveLead(Lead lead);
    List<Lead> findAllLeads();
    public void deleteLead(long id);
	public Lead findLeadById(long id);
}
