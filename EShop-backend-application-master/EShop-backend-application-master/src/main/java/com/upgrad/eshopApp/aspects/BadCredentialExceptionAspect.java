package com.upgrad.eshopApp.aspects;

import com.upgrad.eshopApp.exceptions.BadCredentialsException;
import com.upgrad.eshopApp.responses.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BadCredentialExceptionAspect {
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<CustomResponse> badCredentialsException(Exception e){
        CustomResponse response = new CustomResponse(e.getMessage(), HttpStatus.EXPECTATION_FAILED.value());
        return  new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }
}
