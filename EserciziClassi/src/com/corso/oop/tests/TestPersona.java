package com.corso.oop.tests;

import java.util.Date;

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
			g=Utilities.leggi();
			m=Utilities.leggi();
		} while (!Utilities.checkData(m, g));
		
		int a;
		System.out.println("Anno di nascita:");
		do {
			a=Utilities.leggi();
			if (a<1900 || a>2022)
				System.err.println("Anno non valido");
		} while (a<1900 || a>2022); //voglio escludere a priori il 2023
		
		Date dataNascita=new Date (a-1900,m-1,g);
		
		Persona p1 = new Persona(nome,cognome,codiceFiscale,dataNascita);
		
		System.out.println("La persona " + p1.nome + " ha " + p1.getAge() + " anni");
	}
	
	
}
