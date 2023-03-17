package com.corso.bibliotecadao.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Prestito {

	//JDBC RESTITUISCE java.sql.date -> toLocalDate()
	
	private long idPrestito; 
	private Libro libro ; //al posto di id_libro (che tanto è dentro libro)
	private Utente utente; 
	private LocalDate dataInizio;
	private LocalDate dataFine;
	
	
	public Prestito() {
		super();
	}


	public Prestito(long idPrestito, Libro libro, Utente utente, LocalDate dataInizio, LocalDate dataFine) {
		super();
		this.idPrestito = idPrestito;
		this.libro = libro;
		this.utente = utente;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}


	public Prestito(Libro libro, Utente utente, LocalDate dataInizio, LocalDate dataFine) {
		super();
		this.libro = libro;
		this.utente = utente;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public Prestito(Libro libro, Utente utente, LocalDate dataInizio) {
		super();
		this.libro = libro;
		this.utente = utente;
		this.dataInizio = dataInizio;
		this.dataFine = null;
	}
	
	public long getIdPrestito() {
		return idPrestito;
	}


	public void setIdPrestito(long id) {
		this.idPrestito = id;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public Utente getUtente() {
		return utente;
	}


	public void setUtente(Utente utente) {
		this.utente = utente;
	}


	public LocalDate getDataInizio() {
		return dataInizio;
	}


	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}


	public LocalDate getDataFine() {
		return dataFine;
	}


	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idPrestito);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestito other = (Prestito) obj;
		return idPrestito == other.idPrestito;
	}


	@Override
	public String toString() {
		
			String s = String.format("%10s\t%10s\t%10s\t%20s\t%20s\n", idPrestito, libro.getIdLibro(), utente.getIdUtente(), dataInizio,dataFine);
			return s;

	}
	
	

}
