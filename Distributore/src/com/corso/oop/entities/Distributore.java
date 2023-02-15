package com.corso.oop.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.corso.oop.utilities.Utilities;

public class Distributore {
	private HashMap<Integer, ArrayList<Bevanda>> distributore;
	private static final int MAXCOLONNE = 4;
	
	public Distributore() {
		this.distributore=new HashMap<>();
		
		for (int i=1; i<=MAXCOLONNE; i++) {
			this.distributore.put(i, new ArrayList<>());
		}
	}
	
	public boolean isEmpty() {
		Set<Integer> listaColonne = this.distributore.keySet();
		
		for (int checkColonna : listaColonne) {
			if (this.distributore.get(checkColonna)!=null )
				return false;
		}
		return true;
	}
	
	public Set<Integer> getListaCodici() {
		
		Set<Integer> listaCodici=null;
		Set<Integer> listaColonne = this.distributore.keySet();
		int thisCodice;
		
		for (int checkColonna : listaColonne) {
			if (this.distributore.get(checkColonna)!=null ) {
				thisCodice=this.distributore.get(checkColonna).get(1).getCodice();
				listaCodici.add(thisCodice);
			}
		}
		
		return listaCodici;
	}
	
	public String listaCodiciToString() {
		return "Distributore [Codici delle bevande=" + getListaCodici() + "]";
	}

	public int getCodice(String nome) {
		
		Set<Integer> listaColonne = this.distributore.keySet();

		for (int checkColonna : listaColonne) {
			if (this.distributore.get(checkColonna).get(1).getNome()==nome )
				return this.distributore.get(checkColonna).get(1).getCodice();
				
		}
		
		return -1;
		
	}
	
	
	public int dimensione() {
		int dim=0;
		
		Set<Integer> listaColonne = this.distributore.keySet();
		
		for (int checkColonna : listaColonne) {
			if (this.distributore.get(checkColonna)!=null ) {
				dim++;
			}
		}
		
		return dim;
	}
	
	public int contains(String nome) {
		Set<Integer> listaColonne = this.distributore.keySet();
		int i=0;
		int colonna=0;
		
		for (int checkColonna : listaColonne) {
			if (this.distributore.get(checkColonna).get(1).getNome().equals(nome)) {
				i++;
				colonna=checkColonna;
			}
		}
		
		if (i==1)
			return colonna;
		
		if (i>0) {
			
		}
			
		
		return i;
	}
	
	public void addBevanda(String nome) {
		
		//dove la inserisco?
		//cerco uno slot disponibile ma soprattutto controllo se 
		//e' gia' presente qualcosa
		
		/*i casi sono questi:
		
		caso in cui l'hashmap sia vuota totalmente 
		1
		
		
		caso in cui l'hashmap sia riempita parzialmente, ovvero
		quando in una colonna e' gia presente una bibita
		mentre le altre sono vuote 
		2
		
		caso in cui l'hashmap sia totalmente piena e non e' possibile
		aggiungere altre bevande
		3
		
		caso in cui l'hashmap sia piena ma c'e' spazio per aggiungere
		quella bevanda col nome che passiamo come parametro
		4
		
		
		*/
		
		boolean eVuota=this.isEmpty();
		
		if (eVuota) {
			int codice = Utilities.generaInt(1, 40);
			double prezzo = Utilities.leggiDouble("Dai il prezzo alla bevanda");
			int quantita=Utilities.leggiInt("Quante bevande vuoi inserire?");
			
			ArrayList<Bevanda> bevandeDaInserire = new ArrayList<>();
			
			while (quantita>=0) {
				bevandeDaInserire.add(new Bevanda(codice, nome, prezzo));
				quantita--;
			}
			
			this.distributore.replace(1, bevandeDaInserire);
		}
			
		
		if (this.dimensione() != 0 && this.dimensione() != MAXCOLONNE) {
			
		}
		
		
		
		
		int addPosition = 1;
		Set<Integer> listaColonne = this.distributore.keySet();
		
		for (int checkColonna : listaColonne) {
			if (this.distributore.get(checkColonna)==null )
				addPosition=checkColonna;
		}
		
		
		
	}
	
	
	
	
	
	public int colonnaAdd(int checkColonna, Bevanda bevandaDaAggiungere) {
		
		/*i casi sono questi:
		
		caso in cui l'hashmap sia vuota totalmente 
		1
		
		
		caso in cui l'hashmap sia riempita parzialmente, ovvero
		quando in una colonna e' gia presente una bibita
		mentre le altre sono vuote 
		2
		
		caso in cui l'hashmap sia totalmente piena e non e' possibile
		aggiungere altre bevande
		3
		
		caso in cui l'hashmap sia piena ma c'e' spazio per aggiungere
		quella bevanda col nome che passiamo come parametro
		4
		
		
		*/
		
		
		
		
		int returnValue;
		
		ArrayList<Bevanda> test = this.distributore.get(checkColonna);
		return 0;
	}
}