package com.ib.database;

import java.util.List;

public interface EmployeeDao {

	void save(EmployeePojo employeePojo) throws Exception;

	EmployeePojo getEmployee(String empId) throws Exception;

	void updateEmployee(EmployeePojo employeePojo) throws Exception;

	void deleteEmployee(EmployeePojo employeePojo) throws Exception;

	List<EmployeePojo> listEmployee() throws Exception;

}
