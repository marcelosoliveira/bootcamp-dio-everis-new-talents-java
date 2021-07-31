package com.example.demo.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.DuplicateUsernameException;

@ControllerAdvice
public class TestUsuarioHandlerException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(DuplicateUsernameException.class)
	public ResponseEntity<Object> handlerDuplicateUsernameException(
			DuplicateUsernameException ex, WebRequest request) {
		
		HttpStatus status = HttpStatus.CONFLICT;
		
		DemoProblem problem = new DemoProblem();
		problem.setTitle(ex.getMessage());
		problem.setStatus(status.value());
		problem.setDataTime(LocalDateTime.now());
		
		return handleExceptionInternal(ex, problem, new HttpHeaders(), status, request);
	}
	

}
