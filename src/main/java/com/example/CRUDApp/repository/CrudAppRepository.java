package com.example.CRUDApp.repository;

import com.example.CRUDApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CrudAppRepository extends JpaRepository<Employee,Long> {

}
