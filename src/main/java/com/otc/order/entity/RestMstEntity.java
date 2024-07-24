package com.otc.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="res_mst")
public class RestMstEntity {
	
	@Id
	@GeneratedValue
	@Column(name="res_id")
	private Long resId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="created_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;
	
	@Column(name="modified_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedOn;
	
	@Column(name="status")
	private String status;
	
	@Column(name="veg_status")
	private String vegStatus;
	
	@Column(name="alc_status")
	private String alcStatus;

	public Long getResId() {
		return resId;
	}

	public void setResId(Long resId) {
		this.resId = resId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVegStatus() {
		return vegStatus;
	}

	public void setVegStatus(String vegStatus) {
		this.vegStatus = vegStatus;
	}

	public String getAlcStatus() {
		return alcStatus;
	}

	public void setAlcStatus(String alcStatus) {
		this.alcStatus = alcStatus;
	}

	@Override
	public String toString() {
		return "ResMstEntity [resId=" + resId + ", name=" + name + ", category=" + category + ", description="
				+ description + ", phone=" + phone + ", email=" + email + ", createdOn=" + createdOn + ", modifiedOn="
				+ modifiedOn + ", status=" + status + ", vegStatus=" + vegStatus + ", alcStatus=" + alcStatus + "]";
	}
	
	
	
}
