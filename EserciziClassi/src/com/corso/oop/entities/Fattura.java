package com.corso.oop.entities;

public class Fattura {
	Paziente paziente;
	Dottore dottore;
	
	public Fattura(Paziente paziente, Dottore dottore) {
		this.paziente = paziente;
		this.dottore = dottore;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public Dottore getDottore() {
		return dottore;
	}

	public void setDottore(Dottore dottore) {
		this.dottore = dottore;
	}
	
	public double totale() {
		return dottore.parcella*1.22;
	}

	@Override
	public String toString() {
		String msg = String.format("%.2f€", this.totale());
		return "Fattura [paziente=" + paziente.getNome() + " " +
				paziente.getCognome() + ", dottore=" + 
				dottore.getNome() + " " + dottore.getCognome() +
				", totale fattura=" + msg + "]";
	}
	
	
	
}
