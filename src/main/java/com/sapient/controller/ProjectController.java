package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.ProjectBean;
import com.spring.entity.Project;
import com.spring.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/saveProject", method = RequestMethod.POST)
	public ModelAndView saveProject(@ModelAttribute("command") ProjectBean projectBean, 
			BindingResult result) {
		Project project = prepareModel(projectBean);
		projectService.addProject(project);
		return new ModelAndView("redirect:/addProject.html");
	}
	
	private Project prepareModel(ProjectBean projectBean){
		Project project = new Project();
		project.setProjName(projectBean.getName());
		project.setProjCategory(projectBean.getCategory());
		project.setProjStatus(projectBean.getStatus());
		project.setProjId(projectBean.getId());
		projectBean.setId(null);
		return project;	
	}
	
	@SuppressWarnings("unused")
	private ProjectBean prepareProjectBean(Project project){
		ProjectBean bean = new ProjectBean();
		bean.setName(project.getProjName());
		bean.setCategory(project.getProjCategory());
		bean.setStatus(project.getProjStatus());
		bean.setId(project.getProjId());		
		return bean;
	}
}
