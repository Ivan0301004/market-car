package com.agencyCar.project.carSalesWebiste.handlers;

import com.agencyCar.project.carSalesWebiste.dto.exceptions.ResourceNotFoundDto;
import com.agencyCar.project.carSalesWebiste.exceptions.NoArgumentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestNoArgument {

    @ExceptionHandler(value = NoArgumentException.class)
    public ResponseEntity<ResourceNotFoundDto> handler(NoArgumentException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ResourceNotFoundDto(e.getMessage()));
    }
}
