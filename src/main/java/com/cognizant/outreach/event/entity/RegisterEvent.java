package com.cognizant.outreach.event.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event_register_info")
public class RegisterEvent {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="registration_id")
	private Long id;
	
	@Column(name="event_id",nullable=false)
	private long eventId;
	
	@Column(name="scheduled_date",nullable=false)
	private Date scheduledDate;
	
	@Column(name="associate_id",nullable=false)
	private Long associateId;
	
	@Column(name="associate_first_name",nullable=false)
	private String associateFirstName;
	
	@Column(name="associate_last_name",nullable=false)
	private String associateLastName;
	
	@Column(name="hours_spent",nullable=false)
	private int hoursSpent;
	
	@Column(name="travel_hours",nullable=false)
	private int travelHours;
	
	@Column(name="impacted_lives",nullable=false)
	private Long impactedLives;
	
	@Column(name="business_unit_id",nullable=false)
	private Long businessUnitId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="boarding_type_id",nullable=false)
	private Long boardingTypeId;
	
	@Column(name="boarding_point_id")
	private Long boardingPointId;
	
	@Column(name="drop_point_id")
	private Long dropPointId;
	
	@Column(name="created_time",nullable=false)
	private Timestamp createdTime;
	
	@Column(name="updated_time",nullable=false)
	private Timestamp updatedTime;
	
	@Column(name="updated_by")
	private long updatedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public Date getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public Long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}

	public String getAssociateFirstName() {
		return associateFirstName;
	}

	public void setAssociateFirstName(String associateFirstName) {
		this.associateFirstName = associateFirstName;
	}

	public String getAssociateLastName() {
		return associateLastName;
	}

	public void setAssociateLastName(String associateLastName) {
		this.associateLastName = associateLastName;
	}

	public int getHoursSpent() {
		return hoursSpent;
	}

	public void setHoursSpent(int hoursSpent) {
		this.hoursSpent = hoursSpent;
	}

	public int getTravelHours() {
		return travelHours;
	}

	public void setTravelHours(int travelHours) {
		this.travelHours = travelHours;
	}

	public Long getImpactedLives() {
		return impactedLives;
	}

	public void setImpactedLives(Long impactedLives) {
		this.impactedLives = impactedLives;
	}

	public Long getBusinessUnitId() {
		return businessUnitId;
	}

	public void setBusinessUnitId(Long businessUnitId) {
		this.businessUnitId = businessUnitId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getBoardingTypeId() {
		return boardingTypeId;
	}

	public void setBoardingTypeId(Long boardingTypeId) {
		this.boardingTypeId = boardingTypeId;
	}

	public Long getBoardingPointId() {
		return boardingPointId;
	}

	public void setBoardingPointId(Long boardingPointId) {
		this.boardingPointId = boardingPointId;
	}

	public Long getDropPointId() {
		return dropPointId;
	}

	public void setDropPointId(Long dropPointId) {
		this.dropPointId = dropPointId;
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

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}
	
}
