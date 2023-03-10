package com.corso.oop.es2.entities;

public class Auto {

	private String marca;
	private String modello;
	private double benzina = 10;
	private boolean accesa = false;
	private double velocita = 0;
	private static final double MAXBENZINA = 100;
	private static final double MAXVELOCITA = 200;


	public Auto(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
	}

	public void accendi() {
		if (!accesa) {
			accesa = true;
		} else
			System.out.println("l'auto e' gia' accesa..");
	}

	public void spegni() {
		if (accesa) {
			accesa = false;
			velocita = 0;
		} else
			System.out.println("l'auto e' gia' spenta..");
	}

	public boolean eAccesa() {
		return accesa;
	}

	public void faiBenzina(double qnt) {
		if (qnt <= 0) {
			System.out.println("non hai messo benzina..");
		} else if ((benzina + qnt) <= MAXBENZINA) {
			benzina += qnt;
		} else {
			System.out.println("hai fatto il pieno");
			benzina = MAXBENZINA;
		}
	}

	public double getBenzina() {
		System.out.println("totale benzina:" + benzina);
		return benzina;
	}

	public void accelera(double vlct) {
		System.out.println("stai accelerando");
		if (vlct <= 0) {
			System.out.println("non stai accelerando..");
		} else {
			if (accesa == true && (vlct + velocita) <= MAXVELOCITA) {
				velocita += vlct;
			} else if (accesa == true && (vlct + velocita) > MAXVELOCITA) {
				velocita = MAXVELOCITA;
				System.out.println("L'auto va gia al massimo, rallenta!..");
			} else
				System.out.println("l'auto e' spenta..");
		}
	}

	public void decelera(double vlct) {
		if (vlct <= 0) {
			System.out.println("non stai decelerando..");
		} else if ((velocita - vlct) <= 0) {
			ferma();
			System.out.println("Ti sei fermato");
		} else
			velocita -= vlct;

	}

	public void ferma() {
		if (accesa) {
			velocita = 0;
		} else
			System.out.println("l'auto e' spenta..");
	}

	public boolean eInMoto() {
		if (accesa && velocita != 0) {
			return true;
		} else
			return false;
	}


	public String toString() {
		String s1 = "", s2 = "";
		if (accesa) {
			s1 = "accesa";
			if (eInMoto()) {
				s2 = String.format("sta viaggiando a: %.1f", velocita);
			} else s2 = "e' ferma";
		} else {
			s1 = "spenta";
			s2 = "e' ferma";
		}
		String ss = String.format(
				"Marca: %s Modello: %s \nIl livello del serbatoio e': %.1f \nora l'auto e': %s \n" + "L'auto %s",
				marca, modello, benzina, s1, s2);
		return ss;
	}

}
