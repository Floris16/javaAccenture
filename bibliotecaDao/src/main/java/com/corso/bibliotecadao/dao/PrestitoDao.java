package com.corso.bibliotecadao.dao;

import java.time.LocalDate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.corso.bibliotecadao.entities.*;
import com.corso.bibliotecadao.utils.DbConnection;

public class PrestitoDao implements Dao<Prestito> {

	private Connection conn;

	public PrestitoDao() {
		this.conn = DbConnection.getInstance();
	}

	@Override
	public Prestito insert(Prestito p) throws SQLException {

		String sql = "INSERT INTO prestito(id_libro,id_utente,data_prestito,data_restituzione) "
				+ " VALUES ( ? , ? ,? ,?) ";
		PreparedStatement st = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		st.setLong(1, p.getLibro().getIdLibro());
		st.setLong(2, p.getUtente().getIdUtente());

		// LocalDate -> java.sql.Date
		// LocalDate inizioPrestito = p.getDataInizio();
		// Date d = Date.valueOf(inizioPrestito);
		//

		st.setDate(3, Date.valueOf(p.getDataInizio()));
		if (p.getDataFine() == null)
			st.setDate(4, null);
		else
			st.setDate(4, Date.valueOf(p.getDataFine()));

		st.execute();

		ResultSet rs = st.getGeneratedKeys();
		if (rs != null && rs.next()) {
			p.setIdPrestito(rs.getLong(1));
//			System.out.println("Il nuovo prestito inserito è " + p.toString());
			System.out.println("L' id del prestito è " + p.getIdPrestito());
		}

		// id_prestito da ricavare da result set

		return p;
	}

	@Override
	public Prestito update(Prestito p) throws SQLException {
		String sql = "UPDATE prestito SET " + " id_libro = ?" // 1
				+ ", id_utente = ? " // 2
				+ ", data_prestito = ? " // 3
				+ ", data_restituzione = ? " // 4
				+ " WHERE id_prestito =  ?"; // 5

		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setLong(1, p.getLibro().getIdLibro());
		ps.setLong(2, p.getUtente().getIdUtente());
		ps.setDate(3, Date.valueOf(p.getDataInizio()));
		if (p.getDataFine() == null)
			ps.setDate(4, null);
		else
			ps.setDate(4, Date.valueOf(p.getDataFine()));
		ps.setLong(5, p.getIdPrestito());

		ps.execute();

		return p;
	}

	@Override
	public boolean delete(Prestito p) throws SQLException {
		return this.delete(p.getIdPrestito());

	}

	@Override
	public boolean delete(long id) throws SQLException {
		String sql = "DELETE FROM prestito where id_prestito = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setLong(1, id);
		return ps.execute();

	}

	@Override
	public Prestito find(long id) throws SQLException {
		String sql = "SELECT * FROM prestito WHERE id_prestito = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
		ps.setLong(1, id);
		Prestito p = null;

		ResultSet rs = ps.executeQuery();
		if (rs != null && rs.next()) {
			p = this.fill(rs);
		}

		return p;
	}

	@Override
	public List<Prestito> findAll() throws SQLException {
		String sql = "SELECT * FROM prestito ";

		return this.select(sql);
	}

	@Override
	public List<Prestito> select(String sql) throws SQLException {
		PreparedStatement ps = this.conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Prestito> prestiti = new ArrayList<Prestito>();
		if (rs != null) {
			while (rs.next()) {
				Prestito p = this.fill(rs);
				prestiti.add(p);
			}

		}

		return prestiti;
	}

	public Prestito fill(ResultSet rs) throws SQLException {
		Prestito p = new Prestito();

		p.setIdPrestito(rs.getLong("id_prestito"));
		LibroDao ld = new LibroDao();
		Libro l = ld.find(rs.getLong("id_libro"));
		p.setLibro(l);

		UtenteDao ud = new UtenteDao();
		Utente u = ud.find(rs.getLong("id_utente"));
		p.setUtente(u);
		p.setDataInizio(rs.getDate("data_prestito").toLocalDate());
		if (rs.getDate("data_restituzione") == null)
			p.setDataFine(null);
		else
			p.setDataFine(rs.getDate("data_restituzione").toLocalDate());

		return p;
	}

	public void stampaPrestiti() {
		try {
			System.out.printf("%10s\t%10s\t%10s\t%20s\t%20s\n\n", "id_prestito", "id_libro", "id_utente",
					"data_prestito", "data_restituzione");
			List<Prestito> trovati = this.findAll();
			for (Prestito p : trovati)
				System.out.println(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean findNonRestituiti(Libro l) throws SQLException{
		String dataRestituzioneNull = "SELECT * " + "FROM  PRESTITO p " + "WHERE p.data_restituzione IS null AND p.id_libro = ? ";
		boolean flag = false;
			PreparedStatement st = this.conn.prepareStatement(dataRestituzioneNull);
			st.setLong(1, l.getIdLibro());
			ResultSet rs = st.executeQuery();

			if (rs!=null && rs.next()) {
				return true;
			}
		return false;
	}
}
