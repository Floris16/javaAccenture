import java.util.Scanner;

public class Es2 {
	public static void main(String[] args) {
			
		float base, altezza, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci la base del triangolo:"); //per la leggibilità del programma durante l'esecuzione uso print anziche println
		base=sc.nextFloat();
		
		System.out.print("Inserisci l'altezza del triangolo:");
		altezza=sc.nextFloat();
		
		area=(base*altezza)/2;
		
		System.out.print("L'area del triangolo di base "); //a differenza dell'esercizio precedente ho preferito non 
		System.out.print(base);							   //concatenare le stringhe per aumentare la visibilità del codice
		System.out.print(" e altezza ");
		System.out.print(altezza);
		System.out.print(" ha un'area pari a ");
		System.out.print(area);
		
		sc.close();
		
		
	}
}
