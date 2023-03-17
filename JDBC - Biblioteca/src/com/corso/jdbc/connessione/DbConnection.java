package com.corso.jdbc.connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	
	public DbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static Connection instance;

	public static Connection getInstance() {

		if (instance == null) {
			createConnection();
		}

		return instance;
	}
	
	
	protected static void createConnection() {
		
		String hostname = "127.0.0.1";
		int port = 3306;
		String dbName = "biblioteca";
		String user = "root";
		String password = "root";
		String options = "serverTimezone=Europe/Rome";
		String driver = "com.mysql.cj.jdbc.Driver";
		String connectionString = String.format("jdbc:mysql://%s:%d/%s?%s", hostname, port, dbName, options);

		System.out.println(connectionString);

		try {
			Class.forName(driver); // ClassNotFoundException
			System.out.println("Driver caricato nel build path");

			instance = DriverManager.getConnection(connectionString, user, password); // SQLException

			System.out.println("Connesso");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver non caricato, controlla i build path e importa il driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DbConnection non riuscita");
			e.printStackTrace();
		}
		
	}
	
	public static void close() {
		try {
			instance.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			instance = null;
		}
	}
	
	
}
