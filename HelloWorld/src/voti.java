import java.util.Scanner;

public class voti {

	public static void main(String[] args) {	
		System.out.println("Inserisci 10 voti tra 18 e 30:");
		System.out.println(media());
	}

	public static double media() {
		double media=0;
		for (int i=1; i<=10; i++)
			media+=leggiVoto();
		
		return media/10;
	}
	
	public static int leggiVoto() {
		Scanner sc = new Scanner(System.in);
		int voto;
		
		do {
			voto=sc.nextInt();
			
			if (voto < 18 || voto > 30)
				System.out.println("Il numero che hai inserito è fuori dal range");
		
		} while (voto < 18 || voto > 30);
		
		return voto;
	}
}