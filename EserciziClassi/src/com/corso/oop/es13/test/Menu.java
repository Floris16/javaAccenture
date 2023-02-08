package com.corso.oop.es13.test;

import com.corso.oop.es13.Utilities.Utilities;
import com.corso.oop.es13.entities.*;
import com.corso.oop.es13.intefraces.ARIngredienti;
import com.corso.oop.es13.subentities.PizzaMargherita;

public class Menu implements ARIngredienti{
	public Menu() {
		Pizzeria p = new Pizzeria("Il gallo d'oro", 50, 3.0);
		popolaIngr();
		Pizza m = new PizzaMargherita();
		p.getMenu().add(m);
		int scelta, counter, scelta2;
		do {
			System.out.println("Menù\n"
				     +"1)Lista Ingredienti\n"
				     +"2)Crea pizza e aggiungi nell'ordine\n"
				     +"3)Prezzo base della pizza\n"
				     +"4)Stampa il conto del tavolo\n"
				     +"0)Esci dal programma");
			System.out.println("Scegli");
			scelta = Utilities.leggiInt();
			switch (scelta) {
			case 1:
				counter = 0;
				System.out.println("Lista ingredienti: ");
				for (Ingrediente i : ARIngredienti.LISTAINGR) {
					System.out.println(i + "Numero ingrediente: " + counter++);
				}
				break;
			case 2:
				m = new Pizza(Utilities.scanString("Crea la tua pizza! Inserisci il nome: "));
				do {
					System.out.println("Scegli l'indice dell'ingrediente");
					m.aggiungiIngrediente(ARIngredienti.LISTAINGR.get(Utilities.leggiInt()));
					System.out.println("Premi 0 per uscire o un numero per continuare");
					scelta2 = Utilities.leggiInt();
				} while (scelta2 != 0);
				System.out.println("Inserisci il numero del tavolo");
				p.prendiOrdine(m, Utilities.leggiInt());
				break;

			case 3:
				Pizza.setPrezzoBase(Utilities.leggiDouble("Modifica prezzo base delle pizze: "));
				break;

			case 4:
				System.out.println("Inserisci il tavolo: ");
				System.out.println("Lo scontrino è: " + p.getConto(Utilities.leggiInt()));
				break;
			default:
				System.err.println("Input errato");
				break;
			}

		} while (scelta != 0);
	}
}
