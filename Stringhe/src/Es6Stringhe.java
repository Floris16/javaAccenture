
public class Es6Stringhe {
	public static void main(String[] args) {
		
		String[] seq1 = new String[5];
		String[] seq2 = new String[5];
		
		System.out.println("Sequenza 1:");
		for (int i=0; i<5; i++)
			seq1[i]=Utilities.scanString();
		
		System.out.println("Sequenza 2:");
		for (int i=0; i<5; i++)
			seq2[i]=Utilities.scanString();
		
		controllo(seq1,seq2);
	}
	
	public static void controllo(String[] seq1, String[] seq2) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (seq1[i].equals(seq2[j])) {
					System.out.println("OK");
					return;
				}
			}	
		}
		System.out.println("NO");
	}
}
