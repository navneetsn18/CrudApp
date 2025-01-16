package com.example.CRUDApp.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(){
    }

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
