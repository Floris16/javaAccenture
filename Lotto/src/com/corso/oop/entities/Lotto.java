package com.corso.oop.entities;

import java.util.HashSet;

import com.corso.oop.utlities.Utilities;

public class Lotto {
	
	private HashSet<Integer> estrazione;
	private HashSet<Integer> giocata;
	
	
	
	
	//il costruttore del lotto mi creerà la ruota e me la riempirà
	
	public Lotto() {
		this.estrazione = new HashSet<Integer>();
		this.giocata=new HashSet<Integer>();
		setRuota();
		
	}

	public void setRuota() {
		while (this.estrazione.size() < 5) {
			this.estrazione.add(Utilities.generaInt(1, 90));
		}
	}
	
	public void setGiocata() {
		int dim=0, in=0;
		do {
			dim = Utilities.leggiInt("Quanti numeri vuoi giocare?");
			if (dim<=0 || dim>5)
				System.err.println("INPUT NON VALIDO");
		} while ( dim<=0 || dim>5 );
		
		while (this.giocata.size() < dim) {
			
			do {
				in = Utilities.leggiInt("->");
				if (in<=0 || in>90)
					System.err.println("INPUT NON VALIDO");
			} while ( in<=0 || in>90 );
			
			
			if (!this.giocata.add(in))
				System.err.println("Numero già giocato");
		}
	}
	
	public int checkVittoria() {
		int i=0;
		for(int numEstratto : estrazione)
			if (this.giocata.contains(numEstratto))
				i++;
		return i;
	}
	
	@Override
	public String toString() {
		return "Lotto [ruota =" + ruotaToString() + "]";
	}
	
	public String ruotaToString() {
		String s="";
		for (Integer num : estrazione)
			s+=" " + num;
		return s;
	}

	public static void main(String[] args) {
		Lotto sardegna = new Lotto();
		sardegna.setGiocata();

		System.out.println(sardegna);
		System.out.println("Hai giocato " + sardegna.checkVittoria() + " numeri vincenti");
	}
}
