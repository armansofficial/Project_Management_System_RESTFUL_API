package com.crudoperation.project_management_system.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudoperation.project_management_system.ExceptionHandler.ProjectNotFoundException;
import com.crudoperation.project_management_system.model.ProjectManagementSystemModel;
import com.crudoperation.project_management_system.model.services.ProjectManagementSystemService;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController

public class ProjectManagementSystemController {
	@Autowired
	private ProjectManagementSystemService pmss;


	// For getting all project details

	 @Tag(name = "Get All Project Details", description = "This is the section of all projects")
	@GetMapping("/all-project-details")
	public List<ProjectManagementSystemModel> getProjectInformation() {
		List<ProjectManagementSystemModel> listOfProject = this.pmss.read();
		if (listOfProject.isEmpty()) {
			throw new ProjectNotFoundException("No Project are present");
		}
		return this.pmss.read();
	}

	// For getting all projects by id
	@GetMapping("/all-project-details/{id}")
	public Optional<ProjectManagementSystemModel> getProjectInformationById(@PathVariable String id) {
	 Optional<ProjectManagementSystemModel>project=	this.pmss.readById(Long.parseLong(id));
		if(project.isEmpty()) {
		throw new ProjectNotFoundException("Project not present at this id: " +id);	
		}
		return this.pmss.readById(Long.parseLong(id));
	}

	// For adding new project
	@PostMapping("/all-project-details")
	public ProjectManagementSystemModel addProjectDetail( @RequestBody ProjectManagementSystemModel pmsModel) {
		this.pmss.create(pmsModel);
		return pmsModel;
	}

	// For updating the project by id
	@PutMapping("/all-project-details/{id}")
	public ProjectManagementSystemModel updateProjectDetailById(@PathVariable String id,
			@RequestBody ProjectManagementSystemModel pmsModel) {
		return this.pmss.update(Long.parseLong(id), pmsModel);

	}

	// For deleting project by id
	@DeleteMapping("/all-project-details/{id}")
	public String deleteProjectById(@PathVariable String id) {
		this.pmss.delete(Long.parseLong(id));
		return "Deleted Project";
	}

}
