import java.util.Random;

public class Es8Array {
	public static void main(String[] args) {
		int k = Utilities.dim();

		double[] redditi = popArray(k);
		System.out.printf("il reddito della famiglia più ricca è di %.2f euro\n\n", trovaRedditoMax(redditi));
		famigliePovere(redditi);

	}

	public static double[] popArray(int length) {
		double[] array = new double[length];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble(5000, 100000);
		}

		return array;

	}

	
	public static double trovaRedditoMax(double[] array) {
		double max = array[0];
		for (double e : array)
			if (e>max)
				max = e;
		return max;
	}

	public static void famigliePovere(double[] array) {
		double redditoMaxPoveri = trovaRedditoMax(array)*0.1;
		int famPovere=0;
		for(int i=0; i<array.length;i++) {
			if(array[i]<redditoMaxPoveri) {
				famPovere++;
				System.out.printf("Il reddito della famiglia %d è di %.2f euro\n", i, array[i]);
			}
		}
		System.out.println("Le famiglie povere sono " + famPovere);
		
		
	}
}