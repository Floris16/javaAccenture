import java.util.Scanner;

public class Es5 {
	public static void main(String[] args) {
		
		float assegno, costoRiscossione;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il valore dell'assegno");
		assegno = sc.nextFloat();
		
		if (assegno<=10)
			costoRiscossione=1;
		else if (assegno<=1000)
			costoRiscossione=0.05F*assegno;
		else
			costoRiscossione=40+assegno*0.01F;
		
		System.out.println("Il costo per la riscossione dell'assegno e': " + costoRiscossione);
		
		sc.close();
			
	}
}
