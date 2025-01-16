package com.example.CRUDApp.service.impl;

import com.example.CRUDApp.dto.EmployeeDTO;
import com.example.CRUDApp.entity.Employee;
import com.example.CRUDApp.exception.EmployeeNotFoundException;
import com.example.CRUDApp.mapper.EmployeeMapper;
import com.example.CRUDApp.repository.CrudAppRepository;
import com.example.CRUDApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private CrudAppRepository crudAppRepository;
    /**
     * @param id
     * @return
     */
    @Override
    public EmployeeDTO getEmployeeByID(long id) {
        Employee employee = crudAppRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("No Employee Exist : "+ id));
        return EmployeeMapper.mapEmployeeDtoFromEmployee(employee);
    }

    /**
     * @return
     */
    @Override
    public List<EmployeeDTO> getAllEmoployees() {
        List<Employee> employeeList = crudAppRepository.findAll();
        return employeeList.stream().map(EmployeeMapper::mapEmployeeDtoFromEmployee).collect(Collectors.toList());
    }

    /**
     * @param employeeDTO
     * @return
     */
    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapEmployeeFromEmployeeDto(employeeDTO);
        Employee savedEmployee = crudAppRepository.save(employee);
        return EmployeeMapper.mapEmployeeDtoFromEmployee(savedEmployee);
    }

    /**
     * @param id
     * @param employeeDTO
     * @return
     */
    @Override
    public EmployeeDTO updateEmployee(long id, EmployeeDTO employeeDTO) {
        Employee employee = crudAppRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("No Employee Exist : "+ id));
        employee.setName(employeeDTO.getName());
        employee.setDesignation(employeeDTO.getDesignation());
        employee.setEmail(employeeDTO.getEmail());
        Employee savedEmployee = crudAppRepository.save(employee);
        return EmployeeMapper.mapEmployeeDtoFromEmployee(savedEmployee);
    }

    /**
     * @param id
     */
    @Override
    public void deleteEmployee(long id) {
        Employee employee = crudAppRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("No Employee Exist : "+ id));
        crudAppRepository.delete(employee);
    }
}
