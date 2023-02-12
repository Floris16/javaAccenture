package com.corso.oop.tests;

import com.corso.oop.entities.Alunno;
import com.corso.oop.entities.Registro;
import com.corso.oop.utilities.Utilities;

public class Menu {
	
	public void menu() {
		Registro registro = new Registro();
		int i=0;
		do {
			System.out.println("---Menù---");
			System.out.println("--1) Crea un nuovo registro con 10 alunni");
			System.out.println("--2) Stampa alunni");
			System.out.println("--3) Aggiungi un alunno");
			System.out.println("--0) Esci");
			
			i=Utilities.leggiInt("Inserisci la tua scelta");
			
			switch(i) {
			case 1:
				registro.genRegistro();
				System.out.println("OK! GRAZIE!");
				break;
			case 2:
				System.out.println(registro.toString());
				
				break;
			case 3:
				registro.aggiungiAlunno();
				System.out.println("Alunno aggiunto");
			case 0:
				System.out.println("Esco dal programma");
				break;
			default:
				System.err.println("Input sbagliato");
			}
		} while(i!=0);
		
		
	}
	
}
