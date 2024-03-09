package com.crudoperation.project_management_system.model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="pms")
public class ProjectManagementSystemModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String projectName;
private String projectDescription;
private Date projectStartDate;
private Date projectEndDate;
public ProjectManagementSystemModel() {
	super();
	
}
@Override
public String toString() {
	return "ProjectManagementSystemModel [id=" + id + ", projectName=" + projectName + ", projectDescription="
			+ projectDescription + ", projectStartDate=" + projectStartDate + ", projectEndDate=" + projectEndDate
			+ "]";
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getProjectDescription() {
	return projectDescription;
}
public void setProjectDescription(String projectDescription) {
	this.projectDescription = projectDescription;
}
public Date getProjectStartDate() {
	return projectStartDate;
}
public void setProjectStartDate(Date projectStartDate) {
	this.projectStartDate = projectStartDate;
}
public Date getProjectEndDate() {
	return projectEndDate;
}
public void setProjectEndDate(Date projectEndDate) {
	this.projectEndDate = projectEndDate;
}

}
