package com.cognizant.outreach.event.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="associate_willingness_info")
public class AssociateWillingness {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="willingness_id")
	private Long id;
	
	@Column(name="employee_id")
	private Long employeeId;
	
	@Column(name="location_id")
	private Long locationId;
	
	@Column(name="avail_start_date")
	private Timestamp availabilityStartTime;
	
	@Column(name="avail_end_date")
	private Timestamp availabilityEndTime;
	
	@Column(name="status")
	private String status;
	
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="created_time",nullable=false)
	private Timestamp createdTime;
	
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="updated_time",nullable=false)
	private Timestamp updatedTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Timestamp getAvailabilityStartTime() {
		return availabilityStartTime;
	}

	public void setAvailabilityStartTime(Timestamp availabilityStartTime) {
		this.availabilityStartTime = availabilityStartTime;
	}

	public Timestamp getAvailabilityEndTime() {
		return availabilityEndTime;
	}

	public void setAvailabilityEndTime(Timestamp availabilityEndTime) {
		this.availabilityEndTime = availabilityEndTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}
	
}
