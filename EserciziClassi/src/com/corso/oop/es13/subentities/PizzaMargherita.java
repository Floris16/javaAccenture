package com.corso.oop.es13.subentities;

import com.corso.oop.es13.entities.Pizza;
import com.corso.oop.es13.intefraces.ARIngredienti;

public class PizzaMargherita extends Pizza {

	public PizzaMargherita() {
		super("Margherita");
		super.aggiungiIngrediente(ARIngredienti.LISTAINGR.get(0));
		super.aggiungiIngrediente(ARIngredienti.LISTAINGR.get(1));

	}

}
