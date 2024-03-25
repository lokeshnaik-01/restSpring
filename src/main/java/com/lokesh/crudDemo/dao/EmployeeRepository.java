package com.lokesh.crudDemo.dao;

import com.lokesh.crudDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// instead of /employees spring will expose to /members
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // all crud method will be present

    // we don't need to specify the DAO interface and Implementation both of those can be removed
}
