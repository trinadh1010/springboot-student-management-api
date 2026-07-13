package com.trinadh.studentManagement.exception;


import com.trinadh.studentManagement.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleException(MethodArgumentNotValidException ex){
        Map<String,String> errors=new HashMap<>();
        ErrorResponse error= new ErrorResponse("Validation failed ",400);

        List<FieldError> list=ex.getBindingResult().getFieldErrors();
        for(FieldError fieldError:list){
            String field= fieldError.getField();
            String message=fieldError.getDefaultMessage();
            errors.put(field,message);
        }
        error.setErrors(errors);
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleStudentException(StudentNotFoundException stu){
        ErrorResponse error = new ErrorResponse(stu.getMessage(),404);
        return ResponseEntity.status(404).body(error);
    }
}
