
public class Es3Stringhe {
	public static void main(String[] args) {
		String in=Utilities.scanString();
		
		String v=vocali(in);
		
		System.out.println(v);
	}
	
	
	public static String vocali(String str) {
		int n=str.length();
		char[] voc= new char[n];  //al piu ci possono essere n vocali
		
		for (int i=0; i<n; i++)
			switch (str.charAt(i)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				//System.out.print(str.charAt(i));
				voc[i]=str.charAt(i);  //se trova una vocale, maiuscola o minuscola,
				break;				   //la inserisce nell'array di char
			default:
				voc[i]=' ';            //altrimenti inserisce uno spazio che rimuoveremo poi
			}
		//str="ciao come va?"
		//voc=" iao  o e  a "
		
		String vocali=new String(voc); //inseriamo l'array di char nella stringa vocali
		return vocali.replace(" ", "");  //il .replace ci serve per togliere gli spazi
	}  //vocali="iaooea"
}
