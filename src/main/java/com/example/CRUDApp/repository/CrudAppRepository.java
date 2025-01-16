package com.example.CRUDApp.repository;

import com.example.CRUDApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudAppRepository extends JpaRepository<Employee,Long> {

}
