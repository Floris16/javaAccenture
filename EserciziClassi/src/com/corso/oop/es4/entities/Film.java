package com.corso.oop.es4.entities;

public class Film {
	
	enum MPAA {
		G,
		PG, 
		PG_13, 
		R;
		}
	enum Valutazione {
		TERRIBILE(1,0),
		ERUCTO(2,0), 
		NORMALE(3,0), 
		BELLO(4,0),
		GRANDIOSO(5,0);
		
		final int val;
		int numPers;
		Valutazione(int val, int numPers) {
			this.val = val;
			this.numPers = numPers;
		}
	}
	
	
	
	String titoloDelFilm;
	MPAA classificazioneDelFilm;
	Valutazione valutazioneDelFilm;
	
	
	
	public Film () {
		}
	
	public Film (String titolo, String Classificazione) {
		this.titoloDelFilm=titolo;
		setClassif(Classificazione);;
	}
	
	public Film (String titolo, int Classificazione) {
		this.titoloDelFilm=titolo;
		setClassif(Classificazione);;
	}
	
	
	
	@Override
	public String toString() {
		return "Film [titoloDelFilm=" + titoloDelFilm + ", classificazioneDelFilm=" + classificazioneDelFilm
				+ "]";
	}

	public String getTitolo() {
		return titoloDelFilm;
	}

	public void setTitolo(String titolo) {
		this.titoloDelFilm = titolo;
	}

	public MPAA getClassif() {
		return classificazioneDelFilm;
	}

	public void setClassif(int clas) {
		
		MPAA[] possibiliClassificazioni = MPAA.values(); 
 		
		for (MPAA classificazione : possibiliClassificazioni) 
			if (classificazione.ordinal()==clas) {
				this.classificazioneDelFilm=classificazione;
				System.out.println("Classificazione modificata");
			}
	}
	
	
	public void setClassif(String clas) {
		MPAA[] possibiliClassificazioni = MPAA.values(); 
 		
		for (MPAA classificazione : possibiliClassificazioni) 
			if (classificazione.toString().equalsIgnoreCase(clas)){
				this.classificazioneDelFilm=classificazione;
				System.out.println("Classificazione modificata");
			}
	}

	public Valutazione getValut() {
		return valutazioneDelFilm;
	}
	
	public void addValut(int score) {
		if (score<1 && score>5) {
			System.out.println("Valore fuori dal range. Non e' stata eseguita nessuna modifica");
			return;
		}
		
		
		Valutazione[] possibiliValutazioni = Valutazione.values();
		
		for (Valutazione voto : possibiliValutazioni)
			if (voto.val==score) {
				this.valutazioneDelFilm=voto;
				this.valutazioneDelFilm.numPers++;
				//System.out.println("Aggiunta nuova valutazione");
			}
	}
	
	public void addValut(String score) {
		Valutazione[] possibiliValutazioni = Valutazione.values();
		
		for (Valutazione voto : possibiliValutazioni) {
			if (voto.toString().equalsIgnoreCase(score)) {
				this.valutazioneDelFilm=voto;
				this.valutazioneDelFilm.numPers++;
				//System.out.println("Aggiunta nuova valutazione");
				return;
			}
		}
		
		System.out.println("Valore fuori dal range. Non e' stata eseguita nessuna modifica");
	}

	public double getMedia() {
		Valutazione[] possibiliValutazioni = Valutazione.values();
		double media=0;
		int i=0;
		
		for (Valutazione voto : possibiliValutazioni) {
			media+=voto.val;
			i+=voto.numPers;
		}
		
		return media/i;
	}
	
	public void stampaVoti () {
		//ogni asterisco che stampo dovra' essere il 5% dei voti che ha il film
		
		String sh = "*";
		
		int i = 0;
		Valutazione[] possibiliValutazioni = Valutazione.values();
		
		for (Valutazione voto : possibiliValutazioni)
			i+=voto.numPers; //conto i votanti
		
		System.out.println("Il totale dei votanti e' " + i);
		
		//trovo la percentuale dei votanti
		for (Valutazione voto : possibiliValutazioni) {
			String msg = String.format("\n\n%s: ", voto);
			int perc=voto.numPers*100/i;
			System.out.println(msg + sh.repeat(perc/5));
			System.out.println("% dei votanti: " + perc);
		}
	}
}
