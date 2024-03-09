package com.crudoperation.project_management_system.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperation.project_management_system.model.ProjectManagementSystemModel;

@Repository
public interface ProjectManagementSystemRepositry extends JpaRepository<ProjectManagementSystemModel, Long>{

	

}
