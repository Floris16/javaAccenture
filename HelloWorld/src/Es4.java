import java.util.Scanner;

public class Es4 {
	public static void main(String[] args) {
		
		double prezzo, tot;
		int qta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il prezzo senza iva del prodotto e la quantità acquistata");
		
		prezzo=sc.nextDouble();
		qta=sc.nextInt();
		
		tot=prezzo*qta*1.22; 
		
		System.out.println("Il prezzo totale senza iva è " + (qta*prezzo) + ", mentre il prezzo compreso di iva è " + tot);

		sc.close();
	}
}
