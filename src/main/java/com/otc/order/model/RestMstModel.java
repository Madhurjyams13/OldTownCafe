package com.otc.order.model;

import java.util.Date;

public class RestMstModel {
	
	private Long resId;
	
	private String name;
	
	private String category;
	
	private String description;
	
	private String phone;
	
	private String email;
	
	private Date createdOn;
	
	private Date modifiedOn;
	
	private String status;
	
	private String vegStatus;
	
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
		return "RestMstModel [resId=" + resId + ", name=" + name + ", category=" + category + ", description="
				+ description + ", phone=" + phone + ", email=" + email + ", createdOn=" + createdOn + ", modifiedOn="
				+ modifiedOn + ", status=" + status + ", vegStatus=" + vegStatus + ", alcStatus=" + alcStatus + "]";
	}
	
	

}
