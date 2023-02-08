package com.corso.oop.es8.entities;

public abstract class Veicolo {

	private int targa;
	private short oraArrivo; // int 0-23
	private short oraScadenza;

	public Veicolo() {

	}

	public Veicolo(int targa, int oraArrivo, int oraScadenza) {
		super();
		this.targa = targa;
		this.oraArrivo = (short)oraArrivo;
		this.oraScadenza = (short)oraScadenza;
	}

	public int getTarga() {
		return targa;
	}

	public void setTarga(int targa) {
		this.targa = targa;
	}

	public short getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(short oraArrivo) {
		this.oraArrivo = oraArrivo;
	}

	public short getOraScadenza() {
		return oraScadenza;
	}

	public void setOraScadenza(short oraScadenza) {
		this.oraScadenza = oraScadenza;
	}

	public double calcolaTariffa(int ore) {
		double tariffa = 0;

		return tariffa;
	}

	// chiedo di controllare solo la TARGA per
	// determinare se due veicoli sono uguali
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Veicolo other = (Veicolo) obj;
		return (this.targa==other.getTarga());
	}

	@Override
	public String toString() {
		return "\nTarga = " + targa + "\nOra di arrivo = " + oraArrivo + 
				"\nOra scadenza = " + oraScadenza+"\n";
	}
	
	

}
