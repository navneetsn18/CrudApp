package com.example.CRUDApp.mapper;

import com.example.CRUDApp.dto.EmployeeDTO;
import com.example.CRUDApp.entity.Employee;

public class EmployeeMapper {

    public static Employee mapEmployeeFromEmployeeDto(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getEmployeeID(), employeeDTO.getName(), employeeDTO.getDesignation(), employeeDTO.getEmail()
        );
    }

    public static EmployeeDTO mapEmployeeDtoFromEmployee(Employee employee) {
        return new EmployeeDTO(
                employee.getEmployeeID(), employee.getName(), employee.getDesignation(), employee.getEmail()
        );
    }

}
