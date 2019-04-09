package com.cognizant.outreach.event.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="event_info")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="event_id")
	private long id;
	
	@OneToOne
	@JoinColumn(name="beneficiary_id")
	private Beneficiary beneficiary;
	
	@OneToOne
	@JoinColumn(name="council_id")
	private Council council;
	
	@OneToOne
	@JoinColumn(name="category_id")
	@JoinColumn(name="project_id")
	private ProjectCategory projectCategory;
	
	@OneToOne
	@JoinColumn(name="project_id",insertable=false, updatable=false)
	private Project project;
	
	@Column(name="event_title",nullable=false)
	private String title;
	
	@Column(name="event_description")
	private String description;
	
	@Column(name="start_time", nullable=false)
	private Timestamp startTime;
	
	@Column(name="end_time", nullable=false)
	private Timestamp endTime;
	
	@Column(name="status")
	private String status;
	
	@Column(name="volunteers_count", nullable=false)
	private long volunteers;
	
	@Column(name="poc_id")
	private long pocId;
	
	@Column(name="poc_contact_no")
	private String pocContactNo;
	
	@OneToOne
	@JoinColumn(name="location_id")
	private Location location;
	
	@Column(name="venue_address")
	private String venueAddress;
	
	@Column(name="boarding_type_id", nullable=false)
	private long boardingTypeId;
	
	@Column(name="boarding_points")
	private String boardingPoints;
	
	@Column(name="drop_points")
	private String dropPoints;
	
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="created_time",nullable=false)
	private Timestamp createdTime;
	
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="updated_time",nullable=false)
	private Timestamp updatedTime;
	
	@Column(name="created_by",nullable=false)
	private long createdBy;
	
	@Column(name="updated_by")
	private long updatedBy;
	
	@Column(name="favourite_event")
	private Character favorite;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	
	public Council getCouncil() {
		return council;
	}

	public void setCouncil(Council council) {
		this.council = council;
	}

	public ProjectCategory getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(ProjectCategory projectCategory) {
		this.projectCategory = projectCategory;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(long volunteers) {
		this.volunteers = volunteers;
	}

	public long getPocId() {
		return pocId;
	}

	public void setPocId(long pocId) {
		this.pocId = pocId;
	}

	public String getPocContactNo() {
		return pocContactNo;
	}

	public void setPocContactNo(String pocContactNo) {
		this.pocContactNo = pocContactNo;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public long getBoardingTypeId() {
		return boardingTypeId;
	}

	public void setBoardingTypeId(long boardingTypeId) {
		this.boardingTypeId = boardingTypeId;
	}

	public String getBoardingPoints() {
		return boardingPoints;
	}

	public void setBoardingPoints(String boardingPoints) {
		this.boardingPoints = boardingPoints;
	}

	public String getDropPoints() {
		return dropPoints;
	}

	public void setDropPoints(String dropPoints) {
		this.dropPoints = dropPoints;
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

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Character getFavorite() {
		return favorite;
	}

	public void setFavorite(Character favorite) {
		this.favorite = favorite;
	}
	
}
