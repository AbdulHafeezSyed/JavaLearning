package com.konic.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.konic.model.Student;

public class StudentDAO {
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/mydb"; 
	private static final String USER = "postgres"; // 👈 your postgres username
	private static final String PASSWORD = "admin123"; // 👈 your postgres password

public StudentDAO() {
	try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement()) {
		String sql = "CREATE TABLE IF NOT EXISTS Student (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(255), " +
                "age INT)";
   stmt.execute(sql);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
 public void addStudent(Student s) {
	 String sql="INSERT INTO Student (id,name,age) VALUES(?,?,?)";
	 try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
		 pstmt.setInt(1,s.getId());
		 pstmt.setString(2, s.getName());
		 pstmt.setInt(3, s.getAge());
		 pstmt.executeUpdate();
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }
 }
 
 public List<Student> getAllStudents(){
	 List<Student> list=new ArrayList<Student>();
	 String sql="SELECT * FROM Student";
	 try(Connection conn=DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
			 Statement stmt =conn.createStatement();
			 ResultSet rs=stmt.executeQuery(sql)){
		 while (rs.next()) {
			 Student s=new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"));
			 list.add(s);
		 }
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }
	return list;
	 
 }

}
