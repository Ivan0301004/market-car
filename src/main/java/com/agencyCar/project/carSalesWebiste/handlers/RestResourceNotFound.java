package com.agencyCar.project.carSalesWebiste.handlers;

import com.agencyCar.project.carSalesWebiste.dto.exceptions.ResourceNotFoundDto;
import com.agencyCar.project.carSalesWebiste.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestResourceNotFound {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ResourceNotFoundDto> handler(ResourceNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ResourceNotFoundDto(e.getMessage()));
    }
}
