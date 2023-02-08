package com.corso.oop.es13.intefraces;

import java.util.ArrayList;

import com.corso.oop.es13.entities.Ingrediente;

public interface ARIngredienti {
	public static final ArrayList<Ingrediente> LISTAINGR = new ArrayList<Ingrediente>();
	
	public default void popolaIngr() {
		if(LISTAINGR.isEmpty()) {
			LISTAINGR.add(new Ingrediente("Mozzarella", false, 1.00));
			LISTAINGR.add(new Ingrediente("Pomodoro", false, 0.50));
			LISTAINGR.add(new Ingrediente("ProsciuttoCrudo", false, 1.50));
			LISTAINGR.add(new Ingrediente("Gamberetti", true, 2.00));
			LISTAINGR.add(new Ingrediente("Zucchine", false, 1.00));
			LISTAINGR.add(new Ingrediente("Carciofini", false, 2.00));
			LISTAINGR.add(new Ingrediente("Olive", false, 1.00));
		}
	}
}
