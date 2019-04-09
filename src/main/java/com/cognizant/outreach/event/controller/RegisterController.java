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

import com.cognizant.outreach.event.entity.RegisterEvent;
import com.cognizant.outreach.event.service.RegisterService;

@RestController
@RequestMapping("/api/register")
public class RegisterController {

	private RegisterService registerService;

	@Autowired
	public RegisterController(RegisterService registerService) {
		super();
		this.registerService = registerService;
	}
	
	@PostMapping("/save")
	@CrossOrigin("*")
	public RegisterEvent saveRegistration(@RequestBody RegisterEvent registerEvent) {
		return this.registerService.saveRegistration(registerEvent);
	}
	
	@PostMapping("/bulksave")
	@CrossOrigin("*")
	public List<RegisterEvent> saveBulkRegistrations(@RequestBody List<RegisterEvent> registerEvents) {
		return this.registerService.saveBulkRegistrations(registerEvents);
	}
	
	@GetMapping("/events/{associateId}")
	@CrossOrigin("*")
	public List<RegisterEvent> getRegisteredEvents(@PathVariable Long associateId) {
		return this.registerService.getRegisteredEvents(associateId);
	}
}
