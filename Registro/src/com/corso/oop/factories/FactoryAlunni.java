package com.corso.oop.factories;

import java.util.Random;
import com.corso.oop.entities.*;
import com.corso.oop.enums.*;

public class FactoryAlunni {
	
	public String genNome() {
		Random rng = new Random();
		Nomi[] nome = Nomi.values();
		return nome[rng.nextInt(0,nome.length)].name();
	}
	
	public String genCognome() {
		Random rng = new Random();
		Cognomi[] cognome = Cognomi.values();
		return cognome[rng.nextInt(0,cognome.length)].name();
	}
	
	public int genMatricola() {
		Random rng = new Random();
		return rng.nextInt(10000,100000);
	}
	
	public Materia genMateria() {
		Random rng = new Random();
		Materie[] nomiMaterie = Materie.values();
		return new Materia(nomiMaterie[rng.nextInt(0,nomiMaterie.length)].name(),rng.nextFloat(1,10));
	}
	
	public Alunno creaAlunno() {
		Random r = new Random();
		Materia m = null;
		Alunno a =  new Alunno(genNome(), genCognome(), genMatricola());
		for (int j = 0; j < r.nextInt(1, Materie.values().length); j++) {
			m=genMateria();
			a.getMaterie().add(m);
		}
		a.calcolaMedia();
		return a;
	}
}
