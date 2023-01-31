
public class Es4Stringhe {
	public static void main(String[] args) {
		String in;
		int counter=0;
		
		do {
			in=Utilities.scanString();  //inserisco una stringa da tastiera
			counter+=checkMarks(in);
		} while(!in.isEmpty());
		
		
		System.out.println(counter);
	}
	
	public static int checkMarks(String s) {
		int counter=0;
		for (int i=0; i<s.length(); i++) //controllo tutti i caratteri della stringa
			switch (s.charAt(i)) { //(.,;:!?)
			case '.': case ',': case ';': case ':': case '!': case '?':
				counter++; //se sono (.,;:!?) allora incremento il counter
			}	
		return counter;
	}
}
