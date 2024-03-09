package com.crudoperation.project_management_system.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.project_management_system.model.ProjectManagementSystemModel;
import com.crudoperation.project_management_system.repositories.ProjectManagementSystemRepositry;

@Service
public class ProjectManagementSystemService {
	@Autowired
	private ProjectManagementSystemRepositry pms;

	// For adding project
	public void create(ProjectManagementSystemModel pmsm) {
		pms.save(pmsm);
	}

	// For get all project data
	public List<ProjectManagementSystemModel> read() {
		return pms.findAll();
	}

	// For get all project data by id
	public Optional<ProjectManagementSystemModel> readById(Long id) {
		return pms.findById(id);
	}

	// For updating project
	public ProjectManagementSystemModel update(Long id, ProjectManagementSystemModel pmsModel) {
		pms.findById(id);
		return pms.save(pmsModel);

	}

	// For deleting project
	public void delete(Long id) {
		pms.deleteById(id);

	}

}
