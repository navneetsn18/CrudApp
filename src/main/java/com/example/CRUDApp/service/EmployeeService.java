package com.example.CRUDApp.service;

import com.example.CRUDApp.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO getEmployeeByID(long id);
    List<EmployeeDTO> getAllEmoployees();
    EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO updateEmployee(long id, EmployeeDTO employeeDTO);
    void deleteEmployee(long id);
}
