
public class Es5Array {
	public static void main(String[] args) {
		int n=Utilities.dim();
		int m=Utilities.dim();
		
		System.out.println("Popola l'array");
		int[] A= new int[n];
		A=Utilities.pop(A);
		
		System.out.println("Popola l'array");
		int[] B= new int[m];
		B=Utilities.pop(B);
		
		System.out.println("Gli elementi in comune sono: ");
		
		confronto(A,B);
		
	}
	
	public static void confronto(int[] A, int[] B) {
		for (int elemA : A) //per ogni elemento di A (for (int i=0; i<A.length; i++))
			for (int elemB : B) //per ogni elemento di B (for (int i=0; i<B.length; i++))
				if (elemA==elemB)
					System.out.println(elemA);
	}
}