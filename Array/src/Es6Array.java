
public class Es6Array {
	public static void main(String[] args) {
		int n=Utilities.dim();
		int m=Utilities.dim();
		
		System.out.println("Popola l'array");
		int[] A= new int[n];
		A=Utilities.pop(A); //int[] A={1,1,2,2,3};
		
		System.out.println("Popola l'array");
		int[] B= new int[m];
		B=Utilities.pop(B);//int[] B={1,2,3,4,5,6};
		
		
		diversi(A,B);
	}
	
	public static void diversi(int[] A, int[] B) {
		int j;
		for (int i=0; i<B.length; i++){   //prendi il primo valore di B e lo confronti con tutti i valori di A           
			for (j=0; j<A.length; j++)
				if (A[j]==B[i])   //si ferma al primo valore uguale, per continuare a scorrere B
					break;
			if (j == A.length) //se non trova occorrenze stampa i valori di B non presenti in A 
				System.out.print(B[i]+ " ");
			}
	}
}
