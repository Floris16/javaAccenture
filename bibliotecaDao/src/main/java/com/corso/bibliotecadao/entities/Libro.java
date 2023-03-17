package com.corso.bibliotecadao.entities;

import java.util.Objects;

public class Libro {
	
	
	private long idLibro;
	

	private String titolo;
	private String autore;
	private String isbn;

	public Libro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param titolo
	 * @param autore
	 * @param isbn
	 */
	public Libro(String titolo, String autore, String isbn) {
		super();
		this.setTitolo(titolo);
		this.setAutore(autore);
		this.setIsbn(isbn);
	}
	
	/**
	 * @param idLibro
	 * @param titolo
	 * @param autore
	 * @param isbn
	 */
	public Libro(long id_libro, String titolo, String autore, String isbn) {
		super();
		this.setIdLibro(id_libro);
		this.setTitolo(titolo);
		this.setAutore(autore);
		this.setIsbn(isbn);
	}

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long id_libro) {
		this.idLibro = id_libro;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		String s = String.format("%10s\t%40s\t%20s\t%20s\n", idLibro, titolo, autore, isbn);
		return s;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLibro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return idLibro == other.idLibro;
	}
	
	
	

}
