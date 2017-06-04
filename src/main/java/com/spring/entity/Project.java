package com.spring.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "projid")
	private Integer projId;
	
	@Column(name = "projname")
	private String projName;
	
	@Column(name = "projcategory")
	private String projCategory;
	
	@Column(name = "projstatus")
	private String projStatus;
	
	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getProjCategory() {
		return projCategory;
	}

	public void setProjCategory(String projCategory) {
		this.projCategory = projCategory;
	}

	public String getProjStatus() {
		return projStatus;
	}

	public void setProjStatus(String projStatus) {
		this.projStatus = projStatus;
	}

	



}
