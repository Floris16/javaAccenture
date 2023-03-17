package com.corso.bibliotecadao.dao;

import java.sql.SQLException;
import java.util.List;


                    //GENERICO
public interface Dao<T> {

	public T insert(T e) throws SQLException;  //insert sql
	public T update(T e) throws SQLException ;  //update sql
	
	public boolean delete(T e) throws SQLException; //delete from Libro where id_libro = ?
	public boolean delete(long id) throws SQLException; 
	
	
	/**
	 * Deve fare la select SELECT * FROM LIBRI WHERE ID_LIBRO = ?
	 * e restituire un oggetto libro
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public T find(long id) throws SQLException;  
	
	/**
	 *  // SELECT * FROM LIBRI 
	 *  Restituisce una Lista di Libri
	 * @return
	 * @throws SQLException
	 */
	public List<T> findAll() throws SQLException;  
	
	
	public List<T> select(String sql) throws SQLException; //
	
	
}
