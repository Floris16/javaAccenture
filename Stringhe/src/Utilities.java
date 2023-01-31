import java.util.Scanner;

public class Utilities {
	public static String scanString() {
	    Scanner sc = new Scanner(System.in);
	    String stringaDaTastiera;
	    System.out.println("Dammi una stringa: ");
	    stringaDaTastiera=sc.nextLine();
	    return stringaDaTastiera;
	}
	
	public static int dim() {
		System.out.println("Inserisci la dimensione della stringa:");
		int n=leggiInt();
		
		while (n<0) {
			System.out.println("L'indice che hai inserito è sbagliato");
			n=leggiInt();
		}
		return n;
	}
	
	public static int leggiInt() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	public static String inv (String str) {
		int n=str.length(); 
		char[] inv = new char[n];  //creo un array di char che conterrà la stringa s1 invertita
		for (int i=0; i < str.length(); i++) { 
			inv[i]=str.charAt(n-1); 
			n--;
		}
		String strInv=new String(inv);  //metto l'array di char in una stringa, che verrà restituita
		return strInv;
	}
	
}
