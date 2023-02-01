package com.corso.oop.tests;

import java.util.Random;

import com.corso.oop.entities.Film;

public class TestFilm {
	public static void main(String[] args) {
		System.out.println("Benvenuto nel test della classe Film");
		
		String titolo1="Il Padrino";
		String classificazione1="R";
		
		Film f1 = new Film(titolo1,classificazione1);
		
		Random rng = new Random();
		
		for (int i=0; i<20; i++)
			f1.addValut(rng.nextInt(1,6));
		
		System.out.println(f1.toString());
		
		f1.stampaVoti();
		
		
		System.out.println("\n\n\n");
		String titolo2="Il Gatto con gli stivali";
		int classificazione2=1;
		
		Film f2 = new Film(titolo2,classificazione2);
		
		for (int i=0; i<20; i++)
			f2.addValut(rng.nextInt(1,6));
		
		
		System.out.println(f2.toString());
		
		f2.stampaVoti();
	}
}
