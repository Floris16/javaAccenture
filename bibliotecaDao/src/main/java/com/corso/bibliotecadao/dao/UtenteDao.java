package com.corso.bibliotecadao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.corso.bibliotecadao.entities.Prestito;
import com.corso.bibliotecadao.entities.Utente;
import com.corso.bibliotecadao.utils.DbConnection;

public class UtenteDao implements Dao<Utente> {
	private Connection conn;

	public UtenteDao() {
		super();

		this.conn = DbConnection.getInstance();
	}

	@Override
	public Utente insert(Utente u) throws SQLException {

		String sql = "INSERT INTO utente (nome,cognome) " + " VALUES (?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, u.getNome());
		ps.setString(2, u.getCognome());

		ps.execute();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs != null && rs.next()) {
			u.setIdUtente(rs.getLong(1));
//			System.out.println("Il nuovo utente inserito è " + u.toString());
			System.out.println("L' id utente è " + u.getIdUtente());
		}
		return u;
	}

	@Override
	public Utente update(Utente u) throws SQLException {

		String sql = "UPDATE utente SET " + " nome = ?" // 1
				+ ", cognome = ? " // 2
				+ " WHERE id_utente =  ?"; // 3

		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setString(1, u.getNome());
		ps.setString(2, u.getCognome());
		ps.setLong(3, u.getIdUtente());

		ps.execute();

		return u;
	}

	@Override
	public boolean delete(Utente u) throws SQLException {

		return this.delete(u.getIdUtente());
	}

	@Override
	public boolean delete(long id) throws SQLException {

		String sql = "DELETE FROM utente where id_utente = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setLong(1, id);
		return ps.execute();
	}

	@Override
	public Utente find(long id) throws SQLException {

		String sql = "SELECT * FROM utente WHERE id_utente = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setLong(1, id);
		Utente u = null;

		ResultSet rs = ps.executeQuery();
		if (rs != null && rs.next()) {
			u = this.fill(rs);
		}

		return u;
	}

	@Override
	public List<Utente> findAll() throws SQLException {

		String sql = "SELECT * FROM utente ";

		return this.select(sql);
	}

	@Override
	public List<Utente> select(String sql) throws SQLException {

		PreparedStatement ps = this.conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Utente> utenti = new ArrayList<Utente>();
		if (rs != null) {
			while (rs.next()) {
				Utente u = this.fill(rs);
				utenti.add(u);
			}

		}

		return utenti;
	}

	public Utente fill(ResultSet rs) throws SQLException {
		Utente u = new Utente();

		u.setIdUtente(rs.getLong("id_utente"));
		u.setNome(rs.getString("nome"));
		u.setCognome(rs.getString("cognome"));

		return u;
	}
	public void stampaUtenti() {
		try {
			System.out.printf("%10s\t%20s\t%20s\n\n", ("id_utente"), ("nome"), ("cognome"));
			List<Utente> trovati = this.findAll();
			for(Utente u : trovati)
				System.out.println(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
