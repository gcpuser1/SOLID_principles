package com.solid.singleResponsiblity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepository {

	public void save(Employee emp) {
		String objectStr=MyUtils.seralizeIntoAString(emp);
		Connection connection=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql//localhost:3306/mysdb","root","password");
		    stmt=connection.createStatement();
		    stmt.execute("Insert into employee values ("+objectStr+")");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
