
public class Es4Array {
	public static void main(String[] args) {
		int n=Utilities.dim();
		
		System.out.println("Popola l'array");
		int[] A= new int[n];
		A=Utilities.pop(A);
		
		Utilities.stampaArray(A);
		
		A=Utilities.inv(A);
		
		Utilities.stampaArray(A);
	}
}
