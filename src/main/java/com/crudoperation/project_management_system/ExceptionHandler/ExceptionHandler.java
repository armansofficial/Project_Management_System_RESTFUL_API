package com.crudoperation.project_management_system.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(ProjectNotFoundException.class)
	public ResponseEntity<String> handlerProjectNotFoundException(ProjectNotFoundException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<String> otherExceptionHandle(Exception e) {
		return new ResponseEntity<>("Something wrong with them:" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}