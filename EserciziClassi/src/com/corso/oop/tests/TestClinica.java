package com.corso.oop.tests;

import com.corso.oop.entities.*;

public class TestClinica {
	public static void main(String[] args) {
		Impiegato i1 = new Impiegato("Paolo","Rossi","RSSPLA",10,10,1985,27000,2017,"AA00");
		Impiegato i2 = new Impiegato("Marco","Verdi","VRDMRC",11,11,1986,27500,2016,"AB01");

		System.out.println(i1.toString());
		System.out.println(i2.toString());
		
		Paziente p1 = new Paziente("P_A","B","000",1,1,1900,"A0","Febbre");
		Paziente p2 = new Paziente("P_B","C","001",2,1,1901,"A1","Raffreddore");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		//creo una persona di tipo dottore
		Persona d1 = new Dottore("D_A","B","002",3,1,1902,"Medico di base",150);
		Dottore d2 = new Dottore("D_B","C","003",4,1,1903,"Ortopedico",570);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
									//qui ho bisogno di castare
		Fattura f1 = new Fattura(p1,(Dottore)d1);
		Fattura f2 = new Fattura(p2,d2);
		
		System.out.println(f1.totale());
		System.out.println(f2.totale());
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
	}
}
