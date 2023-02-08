package com.corso.oop.es12.test;

import com.corso.oop.es12.entities.*;
import com.corso.oop.es12.subentities.Quadro;
import com.corso.oop.es12.subentities.Statua;
import com.corso.oop.es12.utilities.Utilities;

public class TestMuseo {
	public static void main(String[] args) {
		Museo museo;
		Opera opera=null;
		Opera temp=null;
		
		String nome=Utilities.scanString("Dai il nome al tuo museo");
		System.out.println("Indica le dimensioni massime della sala");
		int i=Utilities.leggiInt();
		
		museo=new Museo(nome, i);
		
		System.out.println("\n");
		
		i=0;
		
		nome="";
		String autore="";
		String s="";
		double altezza=0;
		do {
			System.out.println("Menù\n"
					+"1)Crea opera\n"
					+"2)Carica opera\n"
					+"3)Cerca opera\n"
					+"4)Sposta opera\n"
					+"5)Stampa sala\n"
					+"6)Stampa deposito\n"
					+"7)Ordina deposito per titolo");
			
			i=Utilities.leggiInt();
			
			switch (i) {
			case 1:
				System.out.println("Vuoi creare una statua (1) o un quadro (2)?");
				i=Utilities.leggiInt();
				
				switch(i) {
				case 1:
					nome=Utilities.scanString("Indica il nome della statua");
					autore=Utilities.scanString("Indica l'autore della statua");
					s=Utilities.scanString("Indica il materiale della statua");
					do {
						System.out.println("Indica l'altezza della statua");
						altezza=Utilities.leggiDouble();
					} while (altezza<=0);
					
					opera = new Statua(autore, nome, s, altezza);
					break;
				case 2:
					nome=Utilities.scanString("Indica il nome del quadro");
					autore=Utilities.scanString("Indica l'autore del quadro");
					s=Utilities.scanString("Indica la tecnica del quadro");
					
					opera = new Quadro(autore, nome, s);
					break;
				default:
					System.err.println("INPUT ERRATO! Opera non creata!");
				}
				
				break;
			case 2:
				if (opera!=null) {
					museo.Carica(opera);
					System.out.println(opera.toString());
				} else
					System.err.println("Non hai creato nessuna opera!");
				opera=null; //mi serve perché altrimenti rischierei di avere doppioni in magazzino
				break;
			case 3:
				nome=Utilities.scanString("Inserisci il titolo dell'opera da cercare");
				temp=museo.cerca(nome);
				if (temp==null)
					System.err.println("Opera non presente!");
				else
					System.out.println(temp.toString() + " è presente nel museo");
				break;
			case 4:
				System.out.println("Da che posizione della sala?");
				temp=museo.sposta(Utilities.leggiInt());
				System.out.println(temp.toString() + " spostata nel deposito");
				break;
			case 5:
				System.out.println(museo.stampaSala());
				break;
			case 6:
				System.out.println(museo.stampaDeposito());
				break;
			case 7:
				museo.riordinaDeposito();
				System.out.println("Deposito riordinato");
			default:
				
			}
		} while (i!=0);
		
	}
}
