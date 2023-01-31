
public class Es2Stringhe {
	public static void main(String[] args) {
		String s1=Utilities.scanString();
		String s2=inv(s1);
		
		System.out.println(s1 + " è la stringa originale");
		System.out.println(s2 + " è la stringa invertita");
	}
	
	
	public static String inv (String str) {
		int n=str.length(); 
		char[] inv = new char[n];  //creo un array di char che conterrà la stringa s1 invertita
		for (int i=0; i < str.length(); i++) { 
			inv[i]=str.charAt(n-1); 
			n--;
		}
		String strInv=new String(inv);  //metto l'array di char in una stringa, che verrà restituita
		return strInv;
	}
}