package com.nagarro.empManagement.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.nagarro.empManagement.constant.Constant;
import com.nagarro.empManagement.exception.EmptyInputException;

@ControllerAdvice
public class GlobalExceptions extends ResponseEntityExceptionHandler{

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException){
		return new ResponseEntity<String>(Constant.ERROR_MSG_VALID_INPUT, HttpStatus.BAD_REQUEST);
		
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		return new ResponseEntity<Object>(Constant.ERROR_MSG_VALID_METHOD, HttpStatus.NOT_FOUND);
	}
	
}
