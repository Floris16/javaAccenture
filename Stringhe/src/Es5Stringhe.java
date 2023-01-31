
public class Es5Stringhe {
	public static void main(String[] args) {
		String in=Utilities.scanString();
		
		System.out.println(spaziVoc(in));
	}
	
	public static int spaziVoc(String s) {
		int i=s.indexOf(' ');
		int count=0;
		
		if (!(i==s.length()-1))
			while (i!=-1) {
				switch (s.charAt(i+1)) {
				//"ciao "
				case 'a': case 'e': case 'i': case 'o': case 'u':
				case 'A': case 'E': case 'I': case 'O': case 'U':
					count++;
				}
				i=s.indexOf(' ', i+1);
		}
		
		return count;
	}
}
