package com.prep.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo 
{
	public static void main(String[] args) 
	{
		String url ="jdbc:mysql://localhost:3306/javadb";
		String username = "root";
		String password = "admin";
		String sqlquery = 
				"""
				create table employee(empname varchar(20), 
				empID int primary key,
				city varchar(20))
				""";
		Connection connection =null;
		Statement statement = null;
		
		try {
			//create connection
			 connection = DriverManager.getConnection(url, username, password);
			
			
			//get statement object
			 statement = connection.createStatement();

			
			//execute query
			statement.execute(sqlquery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				if(connection != null)
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(statement != null)
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
