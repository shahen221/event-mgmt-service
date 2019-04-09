package com.cognizant.outreach.event.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.event.entity.RegisterEvent;

public interface RegisterDAO extends JpaRepository<RegisterEvent, Long> {
	
	public List<RegisterEvent> getEventsByAssociateId(Long associateId);
	
}
