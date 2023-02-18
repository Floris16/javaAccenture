package com.corso.oop.factories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

import com.corso.oop.entities.*;
import com.corso.oop.enums.CategoriaAuto;
import com.corso.oop.exceptions.TooHeavyException;
import com.corso.oop.utilities.Utilities;

public abstract class Factory {
	
	public static Persona factoryPersona() {
		String[] nomi = {"Nino", "Gabriella", "Silvia", "Corrado", "Cinzia", "Gabriele", "Federica"};
		String[] cognomi = {"Floris", "Lampis", "Soriga", "Uccheddu"};
		
		Random rng = new Random();
		return new Persona(nomi[rng.nextInt(0, nomi.length)],cognomi[rng.nextInt(0, cognomi.length)],LocalDateTime.now());
	}
	
	public static String genTarga() {
		
		Random rng = new Random();
		char[] caratteriTarga = new char[7];
		
		caratteriTarga[0] = (char) (rng.nextInt(26) + 65);
		
		
		
		String targa = ;
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		return targa;
		
	}
	
	public static Auto factoryAuto() {
		CategoriaAuto[] tipi = CategoriaAuto.values();
		Random rng = new Random();
		
		return new Auto(tipi[rng.nextInt(0, tipi.length)], genTarga(), LocalDateTime.now());
	}
	
	public static Moto factoryMoto() {
		return new Moto(genTarga(), LocalDateTime.now());
	}
	
	public static Tir factoryTir() throws TooHeavyException { //in realta non la lancera mai, dato che genero un double fino a maxcapienza
		Random rng = new Random();
		return new Tir(genTarga(), rng.nextDouble(0, Tir.getMaxcapienza()), LocalDateTime.now());
	}
	
}
