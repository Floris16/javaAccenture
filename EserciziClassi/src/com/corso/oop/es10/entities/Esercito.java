package com.corso.oop.es10.entities;

import java.util.ArrayList;
import java.util.Random;

import com.corso.oop.es10.subentities.*;

public class Esercito {
	ArrayList<Guerriero> army;

	public Esercito() {
		super();
		this.army = new ArrayList<>();
	}

	public void arruola(int quantity) {
		Random rng = new Random();
		int scelta = 0;
		Guerriero g;

		for (int i = 0; i < quantity; i++) {
			scelta = rng.nextInt(0, 3);
			switch (scelta) {
			case 0:
				g = new Uomo();
				this.army.add(g);
				break;
			case 1:
				g = new Elfo();
				this.army.add(g);
				break;
			case 2:
				g = new Nano();
				this.army.add(g);
				break;
			default:
				break;
			}
		}
	}

	public void battle(ArrayList<Guerriero> army2) {
		int size = (this.army.size() > army2.size()) ? this.army.size() : army2.size();
		for (int i = 0; i < size; i++) {
			if (i >= this.army.size() || i >= army2.size()) {
				return;
			}
			if (this.army.get(i).calcolaValore() > army2.get(i).calcolaValore()) {
				army2.remove(i);
			} else if (this.army.get(i).calcolaValore() < army2.get(i).calcolaValore()) {
				this.army.remove(i);
			}
		}

	}

	public String superstiti() {
		return "I superstiti sono: " + this.army.size();

	}

	public ArrayList<Guerriero> getArmy() {
		return army;
	}

	public void setArmy(ArrayList<Guerriero> army) {
		this.army = army;
	}

}
