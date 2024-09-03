package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/july2024","root","root");
		System.out.println(con);
		Statement st = con.createStatement();
		
		
		// insert
		
		
		String insertSql = "insert into employee (name,salary,doj,gender,address,depName)"
				+ "values('vijay',5000,'2024-03-30','male','Bangalore','admin')";

		int result = st.executeUpdate(insertSql); // executeUpdate() we can useinsert,update,delete

		if (result > 0) {
			System.out.println("Record is inserted Successfully!");
		} else {
			System.out.println("Record is not inserted!");
		}
		 
		
		// select operation
		
		
		/*
		 * String selectQuery = "Select * from employee";
		 * 
		 * ResultSet rs = st.executeQuery(selectQuery); while(rs.next()) {
		 * System.out.println("Employee id :"+rs.getInt("id") + " Employee Name :"
		 * +rs.getString("name") + " Employee Salary :" +rs.getBigDecimal("salary") +
		 * " DOJ :"+rs.getDate("doj") + " Address :"+rs.getString("address") +
		 * " Department Name :"+rs.getString("depName"));
		 * 
		 * }
		 */
		// update 
		
		/*
		 * String updateQuery = "update employee set salary = 45000 where id =2";
		 * 
		 * int value = st.executeUpdate(updateQuery); if(value>0) {
		 * System.out.println("Record is updated successfully"); }else {
		 * System.out.println("Record is Not updated!"); }
		 */
		// Delete 
		
		/*
		 * String deleteQuery = "delete from employee where id =4";
		 * 
		 * int value = st.executeUpdate(deleteQuery); if (value > 0) {
		 * System.out.println("Record is deleted successfully"); } else {
		 * System.out.println("Record is Not deleted!"); }
		 */
		
		st.close();
		con.close();
		
		/*
		 * if(con!=null) { System.out.println("Database Connection is Established");
		 * }else { System.out.println("Database Connection is not Established"); }
		 */

	}

}
