package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.entity.Project;

@Repository("projectDao")
public class ProjectDaoImpl implements ProjectDao {

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Project> listProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project getProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProject(Project project) {
		// TODO Auto-generated method stub

	}

}
