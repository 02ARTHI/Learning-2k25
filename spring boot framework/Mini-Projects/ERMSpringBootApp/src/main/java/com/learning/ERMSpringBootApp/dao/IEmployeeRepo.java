package com.learning.ERMSpringBootApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.ERMSpringBootApp.model.Employee;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

}
