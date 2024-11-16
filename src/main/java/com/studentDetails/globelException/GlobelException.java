package com.studentDetails.globelException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.studentDetails.exception.AgeException;

@RestControllerAdvice
public class GlobelException {

	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> handle(AgeException ae){
		return new ResponseEntity<>("Age not found"+" "+ae.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
