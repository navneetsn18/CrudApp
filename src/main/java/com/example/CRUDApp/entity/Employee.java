package com.example.CRUDApp.entity;

import com.example.CRUDApp.model.Designation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeID;
    private String name;
    @Column(columnDefinition = "default 'UNKNOWN'")
    @Enumerated(EnumType.STRING)
    private Designation designation;
    @Column(nullable = false, unique = true)
    private String email;

}
