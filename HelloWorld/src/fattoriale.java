import java.util.Scanner;

public class fattoriale {
	public static void main(String[] args) {
		System.out.println("Inserisci un numero");
		System.out.println(fact(leggi()));
		
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
	
	public static int fact(int n) {
		int fat=n;
		
		if (n==1) 
			return 1;
		for (int i=1; i<n; i++)
			fat*=n-i;
		
		return fat;
	}
}
