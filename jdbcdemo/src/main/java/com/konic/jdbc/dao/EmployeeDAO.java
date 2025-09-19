package com.konic.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.konic.jdbc.model.Employee;

public class EmployeeDAO {
	private static final String JDBC_URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1"; // 👈 keep DB alive
	private static final String USER = "sa";
	private static final String PASSWORD = "";

	public EmployeeDAO() {
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement()) {
			// Create table if not exists
//			String sql = "CREATE TABLE IF NOT EXISTS employee (" + "id INT PRIMARY KEY, " + "name VARCHAR(255), "
//					+ "salary DOUBLE ,"+"city VARCHAR(255)";
			String sql = "CREATE TABLE IF NOT EXISTS employee (" + "id INT PRIMARY KEY, " + "name VARCHAR(255), "
					+ "salary DOUBLE PRECISION, " + "city VARCHAR(255)" + ")";

			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Insert Employee
	public void addEmployee(Employee emp) {
		String sql = "INSERT INTO employee (id, name, salary,city) VALUES (?, ?, ?,?)";
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setDouble(3, emp.getSalary());
			pstmt.setString(4, emp.getCity());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Fetch All Employees
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		String sql = "SELECT * FROM employee";
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary"),
						rs.getString("Nellore"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void getMaxsalary() {
		// List<Employee> list=new ArrayList<Employee>();
		String sql = "SELECT MAX(salary) AS max_salary FROM employee";
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)) {
			if (rs.next()) {
				Employee e = new Employee();
				double maxSalary = rs.getDouble("max_salary");
				System.out.println("Maximum salary : " + maxSalary);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} // return list;
	}

	public void update() {
		String sql = "update employee set city='SPSR Nellore' where city ilike'nellore'";
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				Statement st = conn.createStatement()) {
			int rowsUpdated = st.executeUpdate(sql);  
	       // System.out.println("Rows updated: " + rowsUpdated);
			if(rowsUpdated > 0) {
				String fetchSql = "SELECT id, name, salary, city FROM employee WHERE city = 'SPSR Nellore'";
	            try (ResultSet rs = st.executeQuery(fetchSql)) {
	                System.out.println("Updated Records:");
	                while (rs.next()) {
	                    System.out.println(
	                        "ID: " + rs.getInt("id") +
	                        ", Name: " + rs.getString("name") +
	                        ", Salary: " + rs.getDouble("salary") +
	                        ", City: " + rs.getString("city")
	                    );
	                }
	            }
	        } else {
	            System.out.println("	 No records found with city = 'Nellore'");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}

