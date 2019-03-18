package com.cognizant.outreach.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.outreach.event.dao.RegisterDAO;
import com.cognizant.outreach.event.entity.RegisterEvent;

@Service
@Transactional
public class RegisterService {

	private RegisterDAO registerDAO;

	@Autowired
	public RegisterService(RegisterDAO registerDAO) {
		super();
		this.registerDAO = registerDAO;
	}
	
	public RegisterEvent saveRegistration(RegisterEvent registerEvent) {
		return this.registerDAO.saveAndFlush(registerEvent);
	}
	
	public List<RegisterEvent> saveBulkRegistrations(List<RegisterEvent> registerEvents) {
		return this.registerDAO.saveAll(registerEvents);
	}
}
