package com.cognizant.outreach.event.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beneficiary")
public class Beneficiary {
	
	@Id
	@Column(name="beneficiary_id")
	private Long id;
	
	@Column(name="beneficiary_name", nullable=false)
	private String name;
	
	@Column(name="location_id", nullable=false)
	private Long locationId;
	
	public Beneficiary() {
		super();
	}
	
	public Beneficiary(Long id, String name, Long locationId) {
		super();
		this.id = id;
		this.name = name;
		this.locationId = locationId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

}
