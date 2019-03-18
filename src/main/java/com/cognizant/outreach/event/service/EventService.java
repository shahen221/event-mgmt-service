package com.cognizant.outreach.event.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.outreach.event.dao.EventDAO;
import com.cognizant.outreach.event.entity.Event;

@Service
@Transactional
public class EventService {
	
	private EventDAO eventDAO;
	
	@Autowired
	public EventService(EventDAO eventDAO) {
		super();
		this.eventDAO = eventDAO;
	}
	
	public Event saveEvent(Event event) {
		return this.eventDAO.saveAndFlush(event);
	}
	
	public List<Event> saveBulkEvents(List<Event> events) {
		return this.eventDAO.saveAll(events);
	}
	
	public Optional<Event> findEventById(Long eventId) {
		return this.eventDAO.findById(eventId);
	}
	
	public List<Event> findAllEvents(){
		return this.eventDAO.findAll();
	}
	
	public void deleteEvent(Long eventId) {
		this.eventDAO.deleteById(eventId);
	}
}
