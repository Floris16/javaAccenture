package com.corso.oop.es8.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Parcheggio {

	private int numPosti;
	private Veicolo[] parcheggiati;
	private short oraCorrente;
	private ArrayList<Veicolo> rimozione;

	public Parcheggio() {
		super();
		this.numPosti = 100;
		this.parcheggiati = new Veicolo[this.numPosti];
		this.rimozione = new ArrayList<Veicolo>();
		this.oraCorrente = 8;
	}

	public Parcheggio(int numPosti, short ora) {
		super();
		this.numPosti = numPosti;
		this.parcheggiati = new Veicolo[this.numPosti];
		this.oraCorrente = ora;
	}

	public Parcheggio(int numPosti, Veicolo[] veicoli, short ora) {
		super();
		this.numPosti = numPosti;
		this.parcheggiati = veicoli;
		this.oraCorrente = ora;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}

	public Veicolo[] getParcheggiati() {
		return parcheggiati;
	}

	public void setParcheggiati(Veicolo[] parcheggiati) {
		this.parcheggiati = parcheggiati;
	}

	public int getOraCorrente() {
		return oraCorrente;
	}

	public void setOraCorrente(short oraCorrente) {
		this.oraCorrente = oraCorrente;
	}

	public ArrayList<Veicolo> getRimozione() {
		return rimozione;
	}

	public void setRimozione(ArrayList<Veicolo> rimozione) {
		this.rimozione = rimozione;
	}

	public void entraVettura(Veicolo newV) {

		for (int i = 0; i < this.numPosti; i++) {
			if (parcheggiati[i] == null) {
				parcheggiati[i] = newV;
				System.out.println("Il veicolo " + newV.getTarga() + " è entrato.");
				return;
			}
		}
		System.out.println("Il parcheggio è pieno.");
	}

	public boolean esceVettura(Veicolo byeV) {
		boolean checkUscita = false;
		int i = 0;
		for (Veicolo v : parcheggiati) {
			if (v != null && v.equals(byeV)) { // ho trovato il veicolo, uso il metodo equals in Veicolo
				parcheggiati[i] = null;

				System.out.println("Il veicolo " + v.getTarga() + " è uscito.");
				contoParcheggio(v);
				return (checkUscita = true); // se lo trovo interrompo il ciclo
			}
			i++;
		}
		System.out.println("Veicolo non trovato.");
		return checkUscita;
	}
	
	public boolean esceVettura(int byeVTarga) {
		boolean checkUscita = false;
		int i = 0;
		for (Veicolo v : parcheggiati) {
			if (v != null && v.getTarga()==byeVTarga) { // ho trovato il veicolo, uso il metodo equals in Veicolo
				parcheggiati[i] = null;
				System.out.println("Il veicolo " + v.getTarga() + " è uscito.");
				contoParcheggio(v);
				return (checkUscita = true); // se lo trovo interrompo il ciclo
			}
			i++;
		}
		System.out.println("Veicolo non trovato.");
		return checkUscita;
	}

	public void aggiornaOra() {
		this.oraCorrente++;
		if (this.oraCorrente > 24) {// se è passata la mezzanotte
			this.oraCorrente -= 24;
		}

		for (int i = 0; i < numPosti; i++) {
			if (parcheggiati[i] != null && parcheggiati[i].getOraScadenza() < this.oraCorrente) {
				rimozione.add(parcheggiati[i]);
				parcheggiati[i] = null;
			}
		}
	}

	public boolean promozione() {
		// offre gratuitamente ore gratuite a tutte le vetture nel parcheggio
		// il cui numero di targa termini con le cifre di un certo codice
		boolean check = false;
		Random rng = new Random();
		int luckyTarga = rng.nextInt(10, 100);
		for (Veicolo v : parcheggiati) {
			if (v != null && v.getTarga() % 100 == luckyTarga) {
				v.setOraArrivo(this.oraCorrente);
				System.out.println("Veicolo " + v.getTarga() + " ha ricevuto una promozione!");
				check = true;
			}
		}
		return check;
	}

	public void statVetture() {
		// restituisce l’insieme delle vetture che
		// hanno il più alto numero di ore di parcheggio dichiarate.
		ArrayList<Veicolo> spendaccioni = new ArrayList();
		int i;
		int max = 0;
		for (Veicolo v : parcheggiati) {
			if (v == null)
				continue;
			i = v.getOraScadenza() - v.getOraArrivo();
			if (i < max)
				continue;
			max = i;  // aggiorno il massimo
			spendaccioni.add(v);
			if (spendaccioni.size() <= 5) //sto creando uno stack dei 5 con più ore
				continue;
			for (Veicolo oldV : spendaccioni) {
				if (oldV.getOraScadenza() - v.getOraArrivo() < max)
					spendaccioni.remove(oldV);
			}

		}

		for (Veicolo v : spendaccioni)
			System.out.println(v.getTarga());
		System.out.println("Il maggior numero di ore è " + max);
	}


	public void contoParcheggio(Veicolo myV) {

		int ore = this.oraCorrente - myV.getOraArrivo(); // calcolo le ore effettive di sosta
		if (ore < 0) { // se sono < 0, l'ora d'arrivo era prima della mezzanotte
						// e l'ora corrente ha passato la mezzanotte
			ore += 24;
		}
		double tariffa = myV.calcolaTariffa(ore); // calcolo tariffa per le ore

		System.out.println("La tariffa pagata è: " + tariffa + "€.\n");
	}

	@Override
	public String toString() {
		ArrayList<Veicolo> list = new ArrayList();
		for (Veicolo v : parcheggiati) {
			if (v != null) {
				list.add(v);
			}
		}

		String s = "";
		int i = 0;
		for (Veicolo v : list) {
			s += v.toString();
			i++;
		}

		return "\nVeicoli parcheggiati: \n" + s;
	}

}
