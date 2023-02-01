package com.corso.oop.entities;

import java.util.Arrays;
import java.util.Random;

import com.corso.oop.entities.Carta.*;

public class MazzoCarte {
	
	public static final int NCARTE=52;
	
	Carta[] elenco=new Carta[NCARTE];
	private int indiceProxCarta;
	
	public MazzoCarte () { 
		this.indiceProxCarta=0;
		ValoreCarta[] valoriPossibili = ValoreCarta.values();
		SemeCarta[] semiPossibili = SemeCarta.values();
		
		for (ValoreCarta valore : valoriPossibili)
			for (SemeCarta seme : semiPossibili)
				elenco[indiceProxCarta++]=new Carta(valore,seme);
		
		this.indiceProxCarta=0; //riporto l'indiceProxCarta a 0 per poter estrarre la prima carta del mazzo
	}
	
	public Carta estrae() {
		//estrae(): Carta → restituisco la carta dalla testa del mazzo di carte
		//la testa del mazzo è indicata dall'indice proxCarta. Quando arrivo alla fine semplicemente riporto l'indice a 0
		
		if (this.indiceProxCarta==NCARTE-1)
			this.indiceProxCarta=0;
		
		return this.elenco[indiceProxCarta++];
	}
	
	public void mischia() {
		Random rng = new Random();
		for (int i=0; i<NCARTE; i++) {
			Carta temp = this.elenco[i];
			this.elenco[i] = this.elenco[rng.nextInt(0,NCARTE)];
			this.elenco[rng.nextInt(0,NCARTE)] = temp;
		}
	}
	
	@Override
	public String toString() {
		return "MazzoCarte [elenco=" + Arrays.toString(elenco) + ", indiceProxCarta=" + indiceProxCarta + "]";
	}
	
	
}
