package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

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
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") Project projectobj, 
			BindingResult result) {
		Project project = prepareModel(projectobj);
		projectService.addProject(project);
		return new ModelAndView("redirect:/add.html");
	}
	
	private Project prepareModel(Project project){
		Project project1 = new Project();
		return project1;
	}
}
