package com.corso.oop.tests;

import com.corso.oop.entities.*;

public class TestCartoleria {
	public static void main(String[] args) {
		Articolo p1 = new Penna("Faber", "Sfera", "Nero", 
	            2);
	    Articolo p2 = new Penna("Mark", "Pilot", "Blu", 
	            1);
	    Articolo p3 = new Penna("Mar", "Pilot", "Blu", 
	            1);
	    Articolo p4 = new Penna("Ma", "Pilot", "Blu", 
	            1);
	    Articolo p5 = new Penna("M", "Pilot", "Blu", 
	            1);
	    Articolo g1 = new Gomma("Gummy", "Mod1", 1, "Tondo",
	            2);
	    Articolo g2 = new Gomma("Bear", "Mod2", 2, "Square",
	            1);
	    
	    Cartoleria cart = new Cartoleria();
	    
	    cart.caricaArticolo(p1);
	    cart.caricaArticolo(p2);
	    cart.caricaArticolo(p3);
	    cart.caricaArticolo(p4);
	    cart.caricaArticolo(p5);
	    cart.caricaArticolo(g1);
	    cart.caricaArticolo(g2);
	    
	    System.out.println(cart.toString());
	    
	    p1.setCosto(4);
	    g1.setCosto(4);
	    
	    System.out.println(p1.toString());
	    System.out.println(g1.toString());
	    
	    cart.scaricaArticolo(g2);
	    System.out.println(cart.toString());
	    
	    cart.ricercaModello("Pilot");
	    
	    System.out.println(cart.ricercaModello("Pilot").toString());
	    
	    cart.stampaArticoli(cart.ricercaModello("Pilot"));
	    System.out.println(cart.toString());
	    
	    cart.stampaArticoli(cart.ricercaColorePenna("Blu"));
	    
	    
	    
	    
	}
    
}
