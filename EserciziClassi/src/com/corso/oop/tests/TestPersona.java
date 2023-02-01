package com.corso.oop.tests;

import com.corso.oop.entities.Persona;
import com.corso.oop.utility.Utilities;

public class TestPersona {
	public static void main(String[] args) {
		
		System.out.println("Benvenuto nella classe Persona");
		System.out.println("Inserisci i seguenti dati:");
		
		String nome=Utilities.scanString("Nome: ");
		String cognome=Utilities.scanString("Cognome: ");
		String codiceFiscale=Utilities.scanString("Codice fiscale (senza controllo di correttezza):");
		
		int m, g;
		System.out.println("Giorno di nascita:");
		System.out.println("Mese di nascita:");
			
		do {
			g=Utilities.leggiInt();
			m=Utilities.leggiInt();
		} while (!Utilities.checkData(m, g));
		
		int a;
		System.out.println("Anno di nascita:");
		do {
			a=Utilities.leggiInt();
			if (a<1900 || a>2022)
				System.err.println("Anno non valido");
		} while (a<1900 || a>2022); //voglio escludere a priori il 2023
		
		Persona p1 = new Persona(nome,cognome,codiceFiscale,g,m,a);
		
		System.out.println("La persona " + p1.getNome() + " ha " + p1.getAge() + " anni");
	}
	
	
}
