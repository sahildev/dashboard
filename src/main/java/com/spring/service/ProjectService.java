package com.spring.service;

import java.util.List;

import com.spring.entity.Project;

public interface ProjectService {

	public void addProject(Project project);

	public List<Project> listProject();

	public Project getProject(int id);

	public void deleteProject(Project project);
}
