import java.util.Scanner;

public class sommatoria {
	public static void main(String[] args) {
		int n, k;
		
		System.out.println("Inserisci due numeri n e k:");
		n=leggi(); 
		k=leggi(); 
		
		System.out.println(somma(n,k));
		
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
	
	
	public static int somma(int n, int k) {
		int x=0;
		
		while (n>0) {
			x+=elev(k,n);
			n--;
		}
		return x;
	}
	
	public static int elev(int base, int esp) {
		
		int pot=1;
		
		for (int i=0; i<esp; i++) {
			pot*=base;
			
		}
		
		return pot;
	}
}