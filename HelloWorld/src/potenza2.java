import java.util.Scanner;

public class potenza2 {
	
public static void main(String[] args) {
		
		int base, espo;
		
		System.out.println("Inserisci la base");
		base=leggi();
		
		System.out.println("Inserisci l'esponente");
		espo=leggi();
		
		System.out.print(elev(base, espo));
			
	}

	public static int elev(int base, int esp) {
		
		int pot=1;
		
		for (int i=0; i<esp; i++) {
			pot*=base;
			
		}
		
		return pot;
	}
	
	public static int leggi() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			num=sc.nextInt();
			
			if (num <= 0)
				System.out.println("Il numero che hai inserito è fuori dal range");
		
		} while (num <= 0);
		
		return num;
	}
}