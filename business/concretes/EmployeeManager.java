package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.Result;
import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.core.utilities.result.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "İşçiler Listelendi");
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("İşçi eklendi");
	}

}
