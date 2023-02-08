package com.corso.oop.es8.entities;

public class Camion extends Veicolo{

	//0.3€ all'ora per i Camion * il loro peso 
	//(in tonnellate) e se hanno il refrigeratore 
	//altri 0.50€ centesimi addizionali a ora
	
	private int peso;
	private int refrigeratore; // 0-1
	
	
	
	public Camion() {
		super();
		boolean check = false;
		int test = (check) ? 1 : 0;
	}

	public Camion(int targa, int oraArrivo, int oraScadenza,int peso, int refrigeratore) {
		super(targa, oraArrivo, oraScadenza);
		this.peso = peso;
		this.refrigeratore = refrigeratore;
	}


	public double calcolaTariffa(int ore) {
		
		double tariffa = 0.3*ore*peso + 0.5*refrigeratore*ore;
		
		return tariffa;
	}
	
	@Override
	public String toString() {
		return ("\nVeicolo: Camion"+super.toString());
	}
}
