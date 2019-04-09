package com.cognizant.outreach.event.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.event.entity.AssociateWillingness;

public interface AssociateWillingnessDAO extends JpaRepository<AssociateWillingness, Long> {
	
	public List<AssociateWillingness> getDataByEmployeeId(Long employeeId);
	
	public AssociateWillingness getDataByEmployeeIdAndLocationId(Long employeeId, Long locationId);
}
