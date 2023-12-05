package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "RESOURCE_DTLS")
public class Resource {
	@Id
	@SequenceGenerator(name = "res_id", sequenceName="resource_dtls_seq", initialValue=10,allocationSize= 2)
	@GeneratedValue(generator="res_id",strategy=GenerationType.IDENTITY)
	@Column(name="RESOURCE_ID")
	private Integer resourceId;
	
	@Column(name="RESOURCE_NAME")
	private String resourceName;
	
	@Column(name="RESOURCE_EXP")
	private String resourceExp;
	
	@Column(name="RESOURCE_SKILL")
	private String resourceSkill;

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceExp() {
		return resourceExp;
	}

	public void setResourceExp(String resourceExp) {
		this.resourceExp = resourceExp;
	}

	public String getResourceSkill() {
		return resourceSkill;
	}

	public void setResourceSkill(String resourceSkill) {
		this.resourceSkill = resourceSkill;
	}

	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + ", resourceName=" + resourceName + ", resourceExp=" + resourceExp
				+ ", resourceSkill=" + resourceSkill + "]";
	}
	
	
	
}
