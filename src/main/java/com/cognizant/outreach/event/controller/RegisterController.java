package com.cognizant.outreach.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public RegisterEvent saveRegistration(@RequestBody RegisterEvent registerEvent) {
		return this.registerService.saveRegistration(registerEvent);
	}
	
	@PostMapping("/bulksave")
	public List<RegisterEvent> saveBulkRegistrations(@RequestBody List<RegisterEvent> registerEvents) {
		return this.registerService.saveBulkRegistrations(registerEvents);
	}
	
}
