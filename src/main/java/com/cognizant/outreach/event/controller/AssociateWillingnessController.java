package com.cognizant.outreach.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.event.entity.AssociateWillingness;
import com.cognizant.outreach.event.service.AssociateWillingnessService;

@RestController
@RequestMapping("/api/willingness")
public class AssociateWillingnessController {
	
	private AssociateWillingnessService associateWillingnessService;
	
	@Autowired
	public AssociateWillingnessController(AssociateWillingnessService associateWillingnessService) {
		super();
		this.associateWillingnessService = associateWillingnessService;
	}
	
	@GetMapping("/{employeeId}/{locationId}")
	@CrossOrigin("*")
	public AssociateWillingness getAssociateWillingness(@PathVariable Long employeeId, @PathVariable Long locationId) {
		return this.associateWillingnessService.getAssociateWillingness(employeeId, locationId);
	}
	
	@GetMapping("/{employeeId}")
	@CrossOrigin("*")
	public List<AssociateWillingness> getAssociateWillingnessByEmployee(@PathVariable Long employeeId) {
		return this.associateWillingnessService.getAssociateWillingnessByEmployeeId(employeeId);
	}
	
	@PostMapping("/save")
	@CrossOrigin("*")
	public AssociateWillingness saveAssociateWillingness(@RequestBody AssociateWillingness associateWillingness) {
		return this.associateWillingnessService.saveAssociateWillingness(associateWillingness);
	}
	
}
