package com.example.CRUDApp.dto;

import com.example.CRUDApp.model.Designation;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long employeeID;
    private String name;
    private Designation designation;
    private String email;
}
