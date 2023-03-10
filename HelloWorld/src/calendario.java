import java.util.Scanner;

public class calendario {
	public static void main(String[] args) {
		
		int giorno, mese;
		System.out.println("Inserisci giorno e mese");
		
		do {
			giorno=checkGiorno();
			mese=checkMese();
			if (!checkData(giorno,mese))
				System.out.println("Data non valida, combinazione errata");
		} while (!checkData(giorno,mese));
		
		System.out.println(contaGiorni(giorno, mese));
	}
	
	
	
	public static int leggi() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static int checkGiorno() {
		int giorno;
		
		do {
			giorno=leggi();
			if (giorno<=0 || giorno>31)
				System.out.println("Giorno non valido");
		} while (giorno<=0 || giorno>31);
		
		return giorno;
	}
	
	public static int checkMese() {
		int mese;
		
		do {
			mese=leggi();
			if (mese<=0 || mese>12)
				System.out.println("Mese non valido");
		} while (mese<=0 || mese>12);
		
		return mese;
	}
	
	public static boolean checkData(int giorno, int mese) {
		switch (mese) {
		case 2:
			return !(giorno>28);
		case 4: case 6: case 9: case 11:
			return !(giorno>30);
		default:
			return true;
		}
	}
	
	public static int contaGiorni(int giorno, int mese) {
		int tot=0;
		
		for (int i=1;i<mese;i++)
			switch (i) {
			case 2:
				tot+=28;
				break;
			case 4: case 6: case 9: case 11:
				tot+=30;
				break;
			default:
				tot+=31;
		}
		tot+=(giorno-1);
		return tot;
	}
}
