package com.corso.oop.es11.test;

import com.corso.oop.es11.entities.Tamagotchi;
import com.corso.oop.es11.subentities.*;
import com.corso.oop.es11.utility.Utilities;

public class TestTamagotchi {
	public static void main(String[] args) {
		
		int i=0;
		Tamagotchi myTamagotchi=null;
		String nome=null;
		
		do {
			System.out.println("Menu");
			System.out.println("1)Crea il tuo Tamagotchi\n"
					+"2)Fai mangiare il tuo Tamagotchi\n"
					+"3)Metti a dormire il tuo Tamagotchi\n"
					+"4)Gioca con il tuo Tamagotchi");
			i=Utilities.leggiInt();
			
			
			switch (i) {
			
			case 1:
				
				do {
					System.out.println("Che specie scegli?\n"
							+"1)Cagnolino\n"
							+"2)Gattino\n"
							+"3)Canarino\n"
							+"4)Coniglietto");
					i=Utilities.leggiInt();
					nome = (nome==null) ? Utilities.scanString("Che nome dai al tuo Tamagotchi?") : nome;

					switch (i) {
					case 1:
						myTamagotchi=new Cagnolino(nome);
						break;	
					case 2:
						myTamagotchi=new Gattino(nome);
						break;
					case 3:
						myTamagotchi=new Canarino(nome);
						break;
					case 4:
						myTamagotchi=new Coniglietto(nome);
						break;
					default:
						System.err.println("Input non valido, creo un cagnolino di default");
						myTamagotchi=new Cagnolino();
					}
					
				} while (i<1 || i>4);
				System.out.println(myTamagotchi.toString());
				break;
			
			case 2:
				if (myTamagotchi==null) {
					System.err.println("Non hai ancora creato il tamagotchi");
					break;
				}
				myTamagotchi.mangia();
				System.out.println(myTamagotchi.toString());
				break;
			case 3:
				if (myTamagotchi==null) {
					System.err.println("Non hai ancora creato il tamagotchi");
					break;
				}
				myTamagotchi.dorme();
				System.out.println(myTamagotchi.toString());
				break;
			case 4:
				if (myTamagotchi==null) {
					System.err.println("Non hai ancora creato il tamagotchi");
					break;
				}
				myTamagotchi.gioca();
				System.out.println(myTamagotchi.toString());
				break;
			default:
					
			}
			
		} while (i!=0);
		
	}
}
