package com.cognizant.outreach.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.outreach.event.dao.AssociateWillingnessDAO;
import com.cognizant.outreach.event.entity.AssociateWillingness;

@Service
@Transactional
public class AssociateWillingnessService {

	private AssociateWillingnessDAO associateWillingnessDAO;
	
	@Autowired
	public AssociateWillingnessService(AssociateWillingnessDAO associateWillingnessDAO) {
		super();
		this.associateWillingnessDAO = associateWillingnessDAO;
	}
	
	public AssociateWillingness saveAssociateWillingness(AssociateWillingness associateWillingness) {
		return this.associateWillingnessDAO.save(associateWillingness);
	}
	
	public List<AssociateWillingness> getAssociateWillingnessByEmployeeId(Long employeeId) {
		return this.associateWillingnessDAO.getDataByEmployeeId(employeeId);
	}
	
	public AssociateWillingness getAssociateWillingness(Long employeeId, Long locationId) {
		return this.associateWillingnessDAO.getDataByEmployeeIdAndLocationId(employeeId, locationId);
	}
}
