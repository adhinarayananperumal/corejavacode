package com.ib.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl extends BaseDaoImpl implements EmployeeDao {

	
	@Override
	public void save(EmployeePojo employeePojo) throws Exception {
		try {
			con = getConnection();
			if (con == null) {
				throw new ConnectionCreationFailed();
			}
			String sql = "insert into emp values(?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, employeePojo.getEmpId());
			stmt.setString(2, employeePojo.getEmpName());
			stmt.setInt(3, employeePojo.getAge());
			stmt.execute();
		} catch (ConnectionCreationFailed e) {
			// send mail
			System.out.println("Database connection creation failed in Employee Dao Class  in save ");
		} catch (SQLException e) {
			// send mail
			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public EmployeePojo getEmployee(String empId) throws Exception {
		EmployeePojo employeePojo = null;
		try {
			con = getConnection();
			if (con == null) {
				throw new ConnectionCreationFailed();
			}

			String sql = "select * from  emp where emp_id=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, empId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				employeePojo = new EmployeePojo();
				employeePojo.setEmpId(rs.getString("emp_id"));
				employeePojo.setEmpName(rs.getString("emp_name"));
				employeePojo.setAge(rs.getInt("age"));
			}

		} catch (ConnectionCreationFailed e) {
			// send mail
			System.out.println("Database connection creation failed in Employee Dao Class");
			throw e;
		} catch (SQLException e) {
			// send mail
			// e.printStackTrace();
			throw e;
		} finally {
			close();
		}
		return employeePojo;

	}

	@Override
	public void updateEmployee(EmployeePojo employeePojo) throws Exception {
		try {
			con = getConnection();
			if (con == null) {
				throw new ConnectionCreationFailed();
			}
			String sql = "update  emp set emp_name=?, age=? where emp_id=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, employeePojo.getEmpName());
			stmt.setInt(2, employeePojo.getAge());
			stmt.setString(3, employeePojo.getEmpId());

			stmt.executeUpdate();
		} catch (ConnectionCreationFailed e) {
			// send mail
			System.out.println("Database connection creation failed in Employee Dao Class  in save ");
		} catch (SQLException e) {
			// send mail
			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public void deleteEmployee(EmployeePojo employeePojo) throws Exception{
		try {
			con = getConnection();
			if (con == null) {
				throw new ConnectionCreationFailed();
			}

			String sql = "delete  from  emp where emp_id=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, employeePojo.getEmpId());
			stmt.execute();
		} catch (ConnectionCreationFailed e) {
			// send mail
			System.out.println("Database connection creation failed in Employee Dao Class");
			throw e;
		} catch (SQLException e) {
			// send mail
			// e.printStackTrace();
			throw e;
		} finally {
			close();
		}

	}

	@Override
	public List<EmployeePojo> listEmployee() throws Exception {

		List<EmployeePojo> listEmp = new ArrayList();
		EmployeePojo employeePojo = null;

		try {
			con = getConnection();
			if (con == null) {
				throw new ConnectionCreationFailed();
			}

			String sql = "select * from  emp";
			stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				employeePojo = new EmployeePojo();
				employeePojo.setEmpId(rs.getString("emp_id"));
				employeePojo.setEmpName(rs.getString("emp_name"));
				employeePojo.setAge(rs.getInt("age"));

				listEmp.add(employeePojo);
			}

		} catch (ConnectionCreationFailed e) {
			// send mail
			System.out.println("Database connection creation failed in Employee Dao Class");
			throw e;
		} catch (SQLException e) {
			// send mail
			// e.printStackTrace();
			throw e;
		} finally {
			close();
		}
		return listEmp;
	}

}
