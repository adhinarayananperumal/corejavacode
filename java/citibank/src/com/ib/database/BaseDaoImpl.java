package com.ib.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

abstract public class BaseDaoImpl {
	
	
	protected ResultSet rs = null;
	protected PreparedStatement stmt = null;
	protected Connection con = null;

	protected final Connection getConnection() throws Exception {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citydb", "root", "password");			// here sonoo is database name, root is username and password
			//Class.forName("org.postgresql.Driver");
			//con = DriverManager.getConnection("jdbc:postgresql://localhost/citydb", "postgres", "password123");			// here sonoo is database name, root is username and password
		} catch (ClassNotFoundException e) {
			// send mail
			System.out.println("no driver found... ClassNotFoundException");
			throw e;
		} catch (SQLException e) {
			// send mail
			// e.printStackTrace();
		}
		return con;
	}

	protected final void close() {

		try {

			if (rs != null) {
				rs.close();
			}

			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {

		}
	}


}
