package com.cognizant.outreach.event.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.event.entity.Event;

public interface EventDAO extends JpaRepository<Event, Long> {

}
