package com.corso.oop.es5.test;

import java.util.Scanner;

import com.corso.oop.es5.entities.*;

public class TestGiocoCarte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Giocatore g1 = new Giocatore("Gabriele");
		Giocatore g2 = new Giocatore("Fabio");
		
		MazzoCarte mazzo = new MazzoCarte();
		
		mazzo.mischia();
		
		
		int x;
		do {
			System.out.println("Premi 1 per giocare, qualsiasi altro numero per uscire");
			x=sc.nextInt();
			if (x==1) {
				g1.setCartainmano(mazzo.estrae());
				System.out.println(g1.getNome()+ " ha estratto " + g1.getCartainmano());
				g2.setCartainmano(mazzo.estrae());
				System.out.println(g2.getNome()+ " ha estratto " + g2.getCartainmano());
				
				switch (g1.getCartainmano().compareTo(g2.getCartainmano())) {
				case 1: 
					System.out.println("\n");
					System.out.println(g1.getNome() + " vince.");
					g1.setPunteggio(g1.getPunteggio()+1);
					System.out.println("Il suo punteggio attuale e' " + g1.getPunteggio());
					break;
				case -1: 
					System.out.println("\n");
					System.out.println(g2.getNome() + " vince.");
					g2.setPunteggio(g2.getPunteggio()+1);
					System.out.println("Il suo punteggio attuale e' " + g2.getPunteggio());
					break;
				case 0: 
					System.out.println("\n");
					System.out.println("I giocatori hanno estratto la stessa carta!");
				}
				System.out.println("\n\n\n");
			} else {
				System.out.println("Sei uscito dal gioco.");
			}
		} while (x==1);
	}
	
	public static void chiVince(Carta c1, Carta c2) {
		switch (c1.compareTo(c2)) {
		case 1: System.out.println();
		}
	}
}
