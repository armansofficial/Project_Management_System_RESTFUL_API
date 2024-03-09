package com.crudoperation.project_management_system.ExceptionHandler;

public class ProjectNotFoundException extends RuntimeException {
	public ProjectNotFoundException(String message) {
		super(message);
	}

}
