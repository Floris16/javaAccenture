import java.util.Scanner;

public class Es1 {

	public static void main(String[] args) {
		
		int a, b;   //dichiaro due variabili a e b
		
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Inserisci un numero da inserire nella variabile a: ");
		a=sc.nextInt();
		
		System.out.println("Inserisci un numero da inserire nella variabile b: ");
		b=sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a+b));  //qui ho concatenato le stringhe nello stesso modo che ho imparato su python
		
		//non controllo se l'input è inserito correttamente
		
		
		sc.close();
	}

}
