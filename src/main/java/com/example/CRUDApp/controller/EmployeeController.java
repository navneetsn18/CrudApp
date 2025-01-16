package com.example.CRUDApp.controller;

import com.example.CRUDApp.dto.EmployeeDTO;
import com.example.CRUDApp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable long id){
        EmployeeDTO employeeDTO = employeeService.getEmployeeByID(id);
        return ResponseEntity.ok(employeeDTO);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee(){
        List<EmployeeDTO> employeeDTOS = employeeService.getAllEmoployees();
        return ResponseEntity.ok(employeeDTOS);
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employeeDTOReq){
        EmployeeDTO employeeDTO = employeeService.addEmployee(employeeDTOReq);
        return new ResponseEntity<>(employeeDTO,HttpStatus.CREATED);
    }


    @PutMapping("{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable long id, @RequestBody EmployeeDTO employeeDTOReq){
        EmployeeDTO employeeDTO = employeeService.updateEmployee(id, employeeDTOReq);
        return new ResponseEntity<>(employeeDTO,HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Employee Deleted : "+id, HttpStatus.OK);
    }
}
