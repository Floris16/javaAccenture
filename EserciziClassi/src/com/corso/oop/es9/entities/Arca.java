package com.corso.oop.es9.entities;

import java.util.Arrays;

public class Arca {
	private int capacità = 10;
	private Animale[] animali;
	
	
	public Arca(int capacità) {
		this.capacità = capacità;
		this.animali = new Animale[capacità];
	}
	
	public void salva(Animale a) {
		for (int i=0; i<this.animali.length; i++)
			if (this.animali[i]==null) {
				this.animali[i]=a;
				System.out.println("Animale salvato");
				return;
			}
	}

	public Animale getAnimale(int index) {
		if (index<0 || index>this.capacità)
			return null;
		
		
		return (this.animali[index]==null) ? null : this.animali[index];
	}
	
	public String coro() {
		String s="";
		for (Animale a : animali) 
			if (a!=null)
				s+=a.verso() + "\n";
		
		return s;
	}

	@Override
	public String toString() {
		return "Arca [capacità=" + capacità + ", animali=" + Arrays.toString(animali) + "]";
	}
	
	
	
	
}
