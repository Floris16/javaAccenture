import java.util.Scanner;

public class Utilities {
	
	public static int leggiInt() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public static int[] pop (int[] array) {
		for (int i=0; i < array.length; i++) {
			System.out.println("Indice " + i);
			array[i]=leggiInt();
		}
		return array;
	}
	
	public static void stampaArray (int[] array) {
		for (int i=0; i < array.length; i++) {
			if (i==0)
				System.out.print("{"+array[i]);
			else
				System.out.print(", "+array[i]);
			if (i==array.length-1)
				System.out.println("}");
		}
	}
	
	public static int[] inv (int[] array) {
		int n=array.length; 
		int[] invertito = new int[n];
		for (int i=0; i < array.length; i++) {
			invertito[i]=array[n-1];
			n--;
		}
		return invertito;
	}
	
	public static int dim() {
		System.out.println("Inserisci la dimensione dell'array:");
		int n=Utilities.leggiInt();
		
		while (n<0) {
			System.out.println("L'indice che hai inserito è sbagliato");
			n=Utilities.leggiInt();
		}
		return n;
	}
	
	public static double[] popolaArrayRandom (int length) {
		double[] arr =new double[length];
	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random()*60)-10;
		}
		
		
		return arr;
		
	}
}