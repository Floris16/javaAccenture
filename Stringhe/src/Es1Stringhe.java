
public class Es1Stringhe {
	public static void main(String[] args) {
		
		int n=Utilities.dim();
		String[] seqStr = new String[n]; 
		
    	seqStr=scrivi(seqStr);
    	
    	int lun=0;
    	
    	for (String e : seqStr) {
    		if (e.isEmpty())
    			break;
    		if (e.charAt(0) >= 'A' && e.charAt(0) <='Z')
    			lun+=e.length();
    	}
    	
    	System.out.println(lun);
    	
	}
	
	public static String[] scrivi(String[] seqStr) {
		for (int i=0; i<(seqStr.length); i++) {
	    	if (i==seqStr.length-1)
	    		seqStr[i]="";
	    	else
	    		seqStr[i]=Utilities.scanString();
    		
    	}
    	return seqStr;
	}
	
}