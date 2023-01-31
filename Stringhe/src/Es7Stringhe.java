
public class Es7Stringhe {
	public static void main(String[] args) {
		String in=Utilities.scanString();
		
		palindroma(in);
	}
	
	public static void palindroma (String s) {
		String s1=s.replace(" ", ""); //skippo gli spazi
		int n=s1.length();
		
		
		String split1=s1.substring(0,n/2);
		String split2;
		if (n%2==0)
			split2=Utilities.inv(s1.substring(n/2));
		else
			split2=Utilities.inv(s1.substring(n/2+1));
		
		/*System.out.println(split1);
		System.out.println(split2);*/
		
		if (split1.equalsIgnoreCase(split2))
			System.out.println(s + " è palindroma");
		else
			System.out.println(s + " non è palindroma");
	}
}