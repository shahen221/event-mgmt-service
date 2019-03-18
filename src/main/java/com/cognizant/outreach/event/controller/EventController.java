package com.cognizant.outreach.event.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.event.entity.Event;
import com.cognizant.outreach.event.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {
	
	private EventService eventService;
	
	@Autowired
	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}
	
	@PostMapping("/save")
	@CrossOrigin("*")
	public Event saveEvent(@RequestBody Event event) {
		return this.eventService.saveEvent(event);
	}
	
	@PostMapping("/bulksave")
	@CrossOrigin("*")
	public List<Event> saveBulkEvents(@RequestBody List<Event> events) {
		return this.eventService.saveBulkEvents(events);
	}
	
	@PutMapping("/update")
	@CrossOrigin("*")
	public Event updateEvent(@RequestBody Event event) {
		return this.eventService.saveEvent(event);
	}
	
	@DeleteMapping("/delete/{eventId}")
	@CrossOrigin("*")
	public void deleteEvent(@PathVariable Long eventId) {
		this.eventService.deleteEvent(eventId);
	}
	
	@GetMapping("/{eventId}")
	@CrossOrigin("*")
	public Event findEventById(@PathVariable Long eventId) {
		Optional<Event> eventInfo = this.eventService.findEventById(eventId);
		return eventInfo.get();
	}
	
	@GetMapping("/")
	@CrossOrigin("*")
	public List<Event> findAllEvents(){
		return this.eventService.findAllEvents();
	}
}
