
public class Es7Array {
	public static void main(String[] args) {
		
		int n = Utilities.dim();
		
		double[] temperatura = Utilities.popolaArrayRandom(n);
		System.out.printf("La media totale è: %.2f\n\n", mediaArray(temperatura));
		stampaTemperature(temperatura);
		
	}
	
	
	public static double mediaArray(double[] array) {
		double media=0;
		
		for (double k : array) {
			media = media + k;
		}
		
		return media/array.length;
		
	}
	
	public static void stampaTemperature(double[] array) {
		double mediaTemp = mediaArray(array);
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]>mediaTemp) {
				System.out.printf("La temperatura %.1f è sopra la media\n" ,array[i]);
			}else if(array[i]<mediaTemp) {
				System.out.printf("La temperatura %.1f è sotto la media\n" ,array[i]);
				
			}else {
				System.out.printf("La temperatura %.1f è uguale alla media\n" ,array[i]);
			}
		}
	}
}
