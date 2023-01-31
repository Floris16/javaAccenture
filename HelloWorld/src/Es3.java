import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		
		int a, b, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri");
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		temp=a; 
		a=b;
		b=temp;
		
		System.out.println("Ho scambiato con successo le variabili");	
		
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
	}
}
