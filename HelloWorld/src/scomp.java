import java.util.Scanner;

public class scomp {
	public static void main(String[] args) {
		
		System.out.println("Inserisci un numero:");
		int num=leggi();
	
		scomp(num);
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
	
	public static void scomp(int num) {
		int primo=1;
		int originale=num;
		
		while (num>1) {
			primo=primo(num);
			
			if (num==originale)
				System.out.print(primo);
			else
				System.out.print(" * " + primo);   //"2*2*3" oppure "E' un numero primo"
			
			num/=primo;
		}
		if (primo==originale && primo!=1)
			System.out.println(" è un numero primo");
		
	}
	
	
	public static int primo(int num) {
		for (int i=2; i<=num; i++) {
			if (num%i==0) 
				return i;
		}
		return 1;
	}
}
