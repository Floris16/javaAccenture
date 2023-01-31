package com.corso.oop.es2gr5;

public class TestAuto {

	public static void main(String[] args) {
		Auto a1 = new Auto("Audi", "A1");
		System.out.println(a1.getBenzina());
		System.out.println(a1.toString());
		a1.accendi();
		a1.accelera(50);
		System.out.println(a1.toString());
		a1.faiBenzina(30);
		a1.getBenzina();
		a1.decelera(20);
		System.out.println(a1.toString());
		a1.accelera(250);
		System.out.println(a1.toString());
		a1.decelera(1000);
		a1.ferma();
		a1.faiBenzina(0);
		a1.faiBenzina(140);
		a1.spegni();
		System.out.println(a1.toString());

	}

}
