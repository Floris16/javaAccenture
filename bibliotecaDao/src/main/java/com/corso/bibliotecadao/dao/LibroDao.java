package com.corso.bibliotecadao.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.corso.bibliotecadao.entities.Libro;
import com.corso.bibliotecadao.entities.Prestito;
import com.corso.bibliotecadao.utils.DbConnection;

public class LibroDao implements Dao<Libro> {

	private Connection conn;

	public LibroDao() {
		super();

		this.conn = DbConnection.getInstance();
	}
	
	@Override
	public Libro insert(Libro l) throws SQLException {

		String sql = "INSERT INTO libro (titolo,autore,isbn) " + " VALUES (?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, l.getTitolo());
		ps.setString(2, l.getAutore());
		ps.setString(3, l.getIsbn());

		ps.execute();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs != null && rs.next()) {
			l.setIdLibro(rs.getLong(1));
//			System.out.println("Il nuovo libro inserito è " + l.toString());
			System.out.println("L' id libro è " + l.getIdLibro());
		}

		return l;
	}

	@Override
	public Libro update(Libro l) throws SQLException {

		String sql = "UPDATE libro SET " + " titolo = ?" // 3
				+ ", autore = ? " // 1
				+ ", isbn = ? " // 2
				+ " WHERE id_libro =  ?"; // 4

		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setString(1, l.getTitolo());
		ps.setString(2, l.getAutore());
		ps.setString(3, l.getIsbn());
		ps.setLong(4, l.getIdLibro());

		ps.execute();

		return l;
	}

	@Override
	public boolean delete(Libro l) throws SQLException {

		return this.delete(l.getIdLibro());
	}

	@Override
	public boolean delete(long id) throws SQLException {

		String sql = "DELETE FROM libro where id_libro = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setLong(1, id);
		return ps.execute();
	}

	@Override
	public Libro find(long id) throws SQLException {

		String sql = "SELECT * FROM libro WHERE id_libro = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setLong(1, id);
		Libro l = null;

		ResultSet rs = ps.executeQuery();
		if (rs != null && rs.next()) {
			l = this.fill(rs);
		}

		return l;
	}

	@Override
	public List<Libro> findAll() throws SQLException {

		String sql = "SELECT * FROM libro ";

		return this.select(sql);
	}

	@Override
	public List<Libro> select(String sql) throws SQLException {

		PreparedStatement ps = this.conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Libro> libri = new ArrayList<Libro>();
		if (rs != null) {
			while (rs.next()) {
				Libro l = this.fill(rs); // creo un libro dal ResultSet
				libri.add(l); // inserisco nella lista di libri
			}

		}

		return libri;
	}

	public Libro fill(ResultSet rs) throws SQLException {
		Libro l = new Libro();

		l.setIdLibro(rs.getLong("id_libro"));
		l.setTitolo(rs.getString("titolo"));
		l.setAutore(rs.getString("autore"));
		l.setIsbn(rs.getString("isbn"));

		return l;
	}
	public void stampaLibri() {
		try {
			List<Libro> trovati = this.findAll();
			System.out.printf("%10s\t%40s\t%20s\t%20s\n\n", ("id_libro"), ("titolo"), ("autore"), ("isbn"));
			for(Libro l : trovati)
				System.out.println(l);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
