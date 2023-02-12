package com.corso.oop.tests;

import com.corso.oop.entities.Contatto;
import com.corso.oop.entities.Rubrica;
import com.corso.oop.utilities.Utilities;

public class Menu {
	public void menu() {
		
		Rubrica rubrica = new Rubrica();
		
		
		
		int i = 0, numero;
		String nome, email;
		
		
		do {
			System.out.println("Menu\n"
					+"1)Aggiungi un nuovo contatto\n"
					+"2)Aggiorna un contatto esistente\n"
					+"3)Elimina un contatto esistente\n"
					+"4)Visualizza rubrica\n"
					+"5)Ricerca contatto per nome\n"
					+"6)Ricerca contatto per numero\n"
					+"7)Ricerca contatto per email\n"
					+"0)Esci");
			i=Utilities.leggiInt("\n\nFai la tua scelta");
			
			switch(i) {
			case 1:
				do {
					nome = Utilities.scanString("Inserisci il nome del contatto");
				} while (rubrica.ricercaNome(nome)!=null);
				numero=Utilities.leggiInt("Inserisci il numero di telefono");
				email=Utilities.scanString("Inserisci l'email");
				
				rubrica.addContatto(nome, numero, email);
				break;
			case 2:
				do {
					nome = Utilities.scanString("Inserisci il nome del contatto");
				} while (rubrica.ricercaNome(nome)==null);
				numero=Utilities.leggiInt("Inserisci il numero di telefono");
				email=Utilities.scanString("Inserisci l'email");
				
				rubrica.updateContatto(new Contatto(nome, numero, email));
				break;
			case 3:
				nome=Utilities.scanString("Inserisci il nome del contatto");
				
				rubrica.deleteContatto(nome);
				break;
			case 4:
				System.out.println(rubrica);
				break;
			case 5:
				nome=Utilities.scanString("Inserisci il nome del contatto");
				System.out.println(rubrica.ricercaNome(nome));
				break;
			case 6:
				numero=Utilities.leggiInt("Inserisci il numero di telefono");
				System.out.println(rubrica.ricercaNumero(numero));
				break;
			case 7:
				email=Utilities.scanString("Inserisci l'email del contatto");
				System.out.println(rubrica.ricercaEmail(email));
				break;
			case 0:
				System.out.println("Esco dal programma");
				break;
			default:
				System.err.println("Input sbagliato");
			}
			
		} while (i!=0);
		
		
	}
}
