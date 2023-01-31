public class Es3Array {
	public static void main(String[] args) {
		int n=Utilities.dim();
		
		System.out.println("Popola l'array");
		int[] A= new int[n];
		A=Utilities.pop(A);
		
		System.out.println("La somma di tutti gli elementi di A è " + sumAll(A));
		System.out.println("La somma degli elementi in posizione pari è " + sumEven(A));
		System.out.println("La somma degli elementi in posizione dispari è " + sumOdd(A));
		System.out.println("La media degli elementi è " + media(sumAll(A), n));
	}
	
	public static int sumAll(int[] array) {
		int somma=0;
		for (int elem : array)
			somma+=elem;
		return somma;	
	}
	
	public static int sumEven(int[] array) {
		int somma=0;
		for (int i=0; i<array.length; i++) {
			if (i%2==0)
				somma+=array[i];
		}
		return somma;
	}
	
	public static int sumOdd(int[] array) {
		int somma=0;
		for (int i=0; i<array.length; i++) {
			if (i%2!=0)
				somma+=array[i];
		}
		return somma;
	}
	
	public static double media(int somma, int l) {
		return somma/l;
	}
}
