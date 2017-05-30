package com.spring.dao;

import java.util.List;

import com.spring.entity.Project;

public interface ProjectDao {
	
	public void addProject(Project project);
	
    public List<Project> listProject();
	
	public Project getProject(int id);
	
	public void deleteProject(Project project);

}
