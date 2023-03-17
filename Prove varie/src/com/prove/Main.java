/**
 * 
 */
package com.prove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Gabriele
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// utility per avere delle stringhe da ciclare
		String[] mesiAnno = { "gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto",
				"settembre", "ottobre", "novembre", "ottobre"/* errore da modificare */ };

		// dichiarazione nuovo arraylist
		ArrayList<String> mesi = new ArrayList<>();

		// inserimento nell'arraylist
		for (String mese : mesiAnno) {
			mesi.add(mese);
		}

		System.out.println(mesi.get(11));
		mesi.set(11, "dicembre");
		System.out.println(mesi.get(11));
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		mesi.forEach(t -> System.out.println(t)); //metodo compatto per la stampa
		System.out.println();
		
		for (Iterator iterator = mesi.iterator(); iterator.hasNext();) { //metodo con gli iterator
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		

		HashSet<String> giorni = new HashSet<>();
	}

}
