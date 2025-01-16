package com.example.CRUDApp.entity;

import com.example.CRUDApp.model.Designation;
import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeID;
    private String name;
    @Column(columnDefinition = "default 'UNKNOWN'")
//    @Enumerated(EnumType.STRING)
    private String designation;
    @Column(nullable = false, unique = true)
    private String email;

    public Employee(){

    }

    public Employee(Long employeeID, String name, String designation, String email) {
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
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", designation=" + designation +
                ", email='" + email + '\'' +
                '}';
    }
}
