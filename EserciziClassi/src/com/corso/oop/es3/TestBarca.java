package com.corso.oop.es3;

import java.util.Scanner;

public class TestBarca {
	public static void main(String[] args) {
		System.out.println("Benvenuto nella classe Barca A Motore.");
		
		double cap=leggiDouble("Inserisci la capacita' del serbatoio della tua barca");
		double vel=leggiDouble("Inserisci la velocita' massima della barca");
		double eff=leggiDouble("Inserisci l'efficienza della barca (in litri al km)");
		
		BarcaAMotore b1=new BarcaAMotore(cap,vel,eff);
		
		System.out.println(b1.toString());
		int a;
		do {
			System.out.println("\n\nMenu'");
			System.out.println("1) Aumenta la velocita' della barca.");
			System.out.println("2) Diminuisci la velocita' della barca.");
			System.out.println("3) Inizia la navigazione.");
			System.out.println("4) Rifornisci la barca di carburante.");
			System.out.println("5) Esci dal programma.");
			a=leggiInt("");
			switch (a) {
			case 1:
				b1.aumentaVelocita(leggiDouble("Di quanto vuoi aumentare la velocita'?"));
				break;
			case 2:
				b1.diminuisciVelocita(leggiDouble("Di quanto vuoi diminuire la velocita'?"));
				break;
			case 3:
				b1.naviga(leggiDouble("Per quanti minuti vuoi navigare?"));
				break;
			case 4:
				b1.rifornimento(leggiDouble("Quanti litri di carburante vuoi mettere?"));
				break;
			case 5:
				System.out.println("Hai selezionato esci.\nFine del programma.");
				return;
			
			default:
				System.out.println("Hai selezionato un numero non valido");
			}
		} while (a>=1 && a<6);
	}
	
	public static double leggiDouble(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
		return sc.nextDouble();
	}
	
	public static int leggiInt(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
		return sc.nextInt();
	}
}
