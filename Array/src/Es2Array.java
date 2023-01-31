public class Es2Array {

	public static void main(String[] args) {
		int n=Utilities.dim();
		
		System.out.println("Popola l'array");
		int[] A= new int[n];
		A=popHalf(A);
		
		Utilities.stampaArray(A);
		System.out.println("\n");
		
		System.arraycopy(A, 0, A, n/2, n/2);
		
		Utilities.stampaArray(A);
	}
	
	public static int[] popHalf(int[] array){
		
		int dim=array.length/2;
		
		for (int i=0; i < dim; i++) {
			System.out.println("Indice " + i);
			array[i]=Utilities.leggiInt();
		}
		return array;
		
		
	}
}