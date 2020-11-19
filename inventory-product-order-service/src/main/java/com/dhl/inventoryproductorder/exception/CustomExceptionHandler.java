package com.dhl.inventoryproductorder.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleValidateonExceptions(MethodArgumentNotValidException ex) {
		List<FieldErrorResponse> responses = new ArrayList<>();
		ex.getBindingResult()
		.getAllErrors()
		.forEach(error-> {
			responses
			.add(FieldErrorResponse.builder()
					.field(((FieldError)error).getField())
					.message(error.getDefaultMessage())
					.build());
		});
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ErrorResponse.builder()
						.timeStamp(System.currentTimeMillis())
						.status(HttpStatus.BAD_REQUEST.value())
						.message("FieldExceptions")
						.errors(responses)
						.build());
	}
	
	@ExceptionHandler(InvalidOrderUpdateStatusException.class)
	public ResponseEntity<ErrorResponse> handleInvalidStatus(InvalidOrderUpdateStatusException ex) {
		return ResponseEntity
	            .status(HttpStatus.BAD_REQUEST)
	            .body(ErrorResponse.builder()
	                .timeStamp(System.currentTimeMillis())
	                .status(HttpStatus.BAD_REQUEST.value()).message("FieldException")
	                .errors(Collections.singletonList(FieldErrorResponse.builder()
	                    .field(ex.getErrorName())
	                    .message(ex.getErrorDescription())
	                    .build())).build());
	}
	@ExceptionHandler(ProductOrderIdNotFoundException.class)
	
	public ResponseEntity<ErrorResponse> handleInvalidId(ProductOrderIdNotFoundException ex) {
		
		  return ResponseEntity
		            .status(HttpStatus.BAD_REQUEST)
		            .body(ErrorResponse.builder()
		                .timeStamp(System.currentTimeMillis())
		                .status(HttpStatus.BAD_REQUEST.value()).message("FieldException")
		                .errors(Collections.singletonList(FieldErrorResponse.builder()
		                    .field(ex.getErrorName())
		                    .message(ex.getErrorDescription())
		                    .build())).build());
		
	}
	

	@ExceptionHandler
    public ResponseEntity<ErrorResponse> catchAllException(Exception exception) {
        return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(ErrorResponse.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .message(exception.getMessage())
                .timeStamp(System.currentTimeMillis()).build());
    }
}
