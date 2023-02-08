package com.corso.oop.es5.entities;

public class Carta {
	public enum ValoreCarta {
		ASSO(1),
		DUE(2),
		TRE(3),
		QUATTRO(4),
		CINQUE(5),
		SEI(6),
		SETTE(7),
		OTTO(8),
		NOVE(9),
		DIECI(10),
		J(11),
		Q(12),
		K(13);
		
		final private int valoreNum;
		
		private ValoreCarta (int v) {
			this.valoreNum=v;
		}
		
		public int getValoreCarta() {
			return valoreNum;
		}
		
		
	}
	public enum SemeCarta {
		PICCHE(1),
		FIORI(2),
		QUADRI(3),
		CUORI(4);
		
		final private int prioritaSeme;
		
		private SemeCarta (int p) {
			this.prioritaSeme=p;
		}
		
		public int getPrioritaSeme() {
			return prioritaSeme;
		}
	}
	
	final ValoreCarta valore;
	final SemeCarta seme;
	
	
	public Carta (ValoreCarta valore, SemeCarta seme) {
		this.valore=valore;
		this.seme=seme;
	}
	
	
	public ValoreCarta getValore() {
		return valore;
	}
	public SemeCarta getSeme() {
		return seme;
	}

	@Override
	public String toString() {
		return "Carta [valore=" + valore + ", seme=" + seme + "]";
	}
	
	public int compareTo(Carta carta) {
		if (this.valore==carta.valore) {
			if (this.seme==carta.seme)
				return 0;
			
			return this.seme.prioritaSeme>carta.seme.prioritaSeme ? 1 : -1;
		}
		
		return this.valore.valoreNum>carta.valore.valoreNum ? 1 : -1;
	
	}
	
}
