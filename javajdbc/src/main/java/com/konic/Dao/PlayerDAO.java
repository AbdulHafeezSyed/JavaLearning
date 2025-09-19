package com.konic.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.konic.model.Player;

public class PlayerDAO {
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/mydb";
	private static final String USER = "postgres";
	private static final String PASSWORD = "admin123";


	public PlayerDAO() {
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				Statement st = conn.createStatement()) {
			String sql = "CREATE TABLE IF NOT EXISTS player (" +
		             "id INT PRIMARY KEY, " +
		             "name VARCHAR(255), " +
		             "salary DOUBLE PRECISION)";
		st.execute(sql);


		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void addPlayer(Player p) {
		String sql = "INSERT INTO PLAYER (id,name,salary) VALUES(?,?,?)";
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				PreparedStatement pt = conn.prepareStatement(sql)) {
			pt.setInt(1,p.getId());
			pt.setString(2,p.getName());
			pt.setDouble(3,p.getSalary());
			pt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	public List<Player> getAllPlayers() {
		List<Player> list = new ArrayList<Player>();
		String sql = "SELECT *FROM PLAYER";
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)) {
			while (rs.next()) {
				Player p = new Player(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary"));
				list.add(p);

			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;

	}

}
