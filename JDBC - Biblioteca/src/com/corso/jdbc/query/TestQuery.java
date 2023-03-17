package com.corso.jdbc.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.corso.jdbc.connessione.DbConnection;
import com.utility.Utilities;

public class TestQuery {

	private Connection c1;
	
	
	public TestQuery() {
		c1 = DbConnection.getInstance();
	}
	
	public void insert() {
		PreparedStatement insert = null;

		try {
			String queryInsert = "INSERT INTO libro (titolo, autore, isbn)"
					+ "VALUES (?,?,?);";
			insert = c1.prepareStatement(queryInsert);

			insert.setString(1, Utilities.scanString("titolo"));
			insert.setString(2, Utilities.scanString("autore"));
			insert.setString(3, Utilities.scanString("isbn"));

			int ris = insert.executeUpdate();

			System.out.println(ris);


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void select() {
		String query = "SELECT * FROM Libro";

		try {
			PreparedStatement viewTable = c1.prepareStatement(query);
			
			ResultSet rs = viewTable.executeQuery(query);
			
			if (rs == null) {
				System.err.println("Tabella vuota");
				return;
			}
				
			
			System.out.printf("%10s\t%40s\t%20s\t%20s\n", "id_libro", "titolo", "autore", "isbn");
			
			while (rs.next()) {
				System.out.printf("%10s\t%40s\t%20s\t%20s\n", 
						rs.getInt("id_libro"), rs.getString("titolo"),
						rs.getString("autore"), rs.getString("isbn"));
			}
			
			rs.close();
			viewTable.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
