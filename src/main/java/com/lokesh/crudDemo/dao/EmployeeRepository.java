package com.lokesh.crudDemo.dao;

import com.lokesh.crudDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // all crud method will be present

    // we don't need to specify the DAO interface and Implementation both of those can be removed
}
