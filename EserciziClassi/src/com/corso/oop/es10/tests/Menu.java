package com.lotr;

public class Menu {

	public void menuBattaglia() {
		Esercito army1 = new Esercito();
		Esercito army2 = new Esercito();
		int scelta = 0;
		int nSoldati = 0;
		do {
			System.out.println("Menu");
			System.out.println("1)Arruola soldati nei due eserciti.");
			System.out.println("2)Fai combattere i due eserciti.");
			System.out.println("3)Mostra i superstiti.");
			
			scelta = ScanVari.scanInt("Scegli un'opzione, per uscire premi 0.");
			switch (scelta) {
			case 1:
				army1.arruola(ScanVari.scanInt("Inserisci il numero di soldati dell'esercito 1"));
				army2.arruola(ScanVari.scanInt("Inserisci il numero di soldati dell'esercito 2"));
				break;
			case 2:
				if(army1.getArmy().size()==0 || army2.getArmy().size()==0) {
					System.err.println("Popola gli eserciti.");
					break;
				}
				army1.battle(army2.getArmy());
				System.out.println("Combattimento terminato");
				break;
			case 3:
				if(army1.getArmy().size()==0 || army2.getArmy().size()==0) {
					System.err.println("Popola gli eserciti.");
					break;
				}
				System.out.println(army1.superstiti());
				System.out.println(army2.superstiti());
				break;
			default:
				System.err.println("Scelta errata. Inserisci un numero valido.");
			}

		} while (scelta != 0);
	}

}
