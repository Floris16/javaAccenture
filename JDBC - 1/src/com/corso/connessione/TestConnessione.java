package com.corso.connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnessione {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		String connectionString = "jdbc:mysql://127.0.0.1:3306/hr?serverTimezone=Europe/Rome";
		String user = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			System.out.println("Driver caricato nel build path");
			conn = DriverManager.getConnection(connectionString, user, password);
			System.out.println("Connesso");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Statement smt = conn.createStatement();
			String sql = "SELECT * FROM employees";
			ResultSet rs = smt.executeQuery(sql);
			
			if (rs != null) {
				while(rs.next()) {
					System.out.println(rs.getInt("employee_id"));
					System.out.println(rs.getString("first_name"));
					System.out.println(rs.getString("last_name"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}