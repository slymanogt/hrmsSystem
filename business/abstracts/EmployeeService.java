package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.entities.concretes.Employee;

public interface EmployeeService {

	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
}
