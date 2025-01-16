package com.example.CRUDApp.dto;

import com.example.CRUDApp.model.Designation;

public class EmployeeDTO {
    private Long employeeID;
    private String name;
    private String designation;
    private String email;

    public EmployeeDTO(){

    }

    public EmployeeDTO(Long employeeID, String name, String designation, String email) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.email = email;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", designation=" + designation +
                ", email='" + email + '\'' +
                '}';
    }
}
