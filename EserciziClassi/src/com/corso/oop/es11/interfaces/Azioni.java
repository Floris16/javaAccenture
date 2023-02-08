package com.corso.oop.es11.interfaces;

import com.corso.oop.es11.entities.Tamagotchi;

public interface Azioni {
	public default void mangia() {
		Tamagotchi.setEnergia(Tamagotchi.getEnergia()+1);
	}
	public default void dorme() {
		Tamagotchi.setEnergia(Tamagotchi.getEnergia()+1);
	}
	public default void gioca() {
		Tamagotchi.setEnergia(Tamagotchi.getEnergia()-1);
	}
}
