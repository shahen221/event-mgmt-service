package com.cognizant.outreach.event.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transport_boarding_points")
@IdClass(BoardingPointId.class)
public class BoardingPoint {
	
	@Id
	@Column(name="boarding_point_id")
	private Long id;
	
	@Column(name="boarding_point_name", nullable=false)
	private String name;
	
	@Column(name="location_id")
	private Long locationId;
	
	@ManyToOne
	private Location location;

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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

}

@SuppressWarnings("serial")
class BoardingPointId implements Serializable {
	private Long id;
	private Long locationId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	
}
