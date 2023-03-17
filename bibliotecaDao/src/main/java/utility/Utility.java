package utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	
	// SCANNERS
	
	// INTEGER
	public static int scanInt(String msg) {
		int input = 0;
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		do {
			input = sc.nextInt();
		} while (input < 0); // condition
		

		return input;
	}
	
	public static int scanInt() {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		do {
			input = sc.nextInt();
		} while (input < 0); // condition
		

		return input;
	}
	// DOUBLE
	public static double scanDouble(String msg) {
		double input = 0;
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		do {
			input = sc.nextDouble();
		} while (input < 0); // condition
		

		return input;
	}
	
	public static double scanDouble() {
		double input = 0;
		Scanner sc = new Scanner(System.in);
		do {
			input = sc.nextDouble();
		} while (input < 0); // condition
		

		return input;
	}
	// STRING
	public static String scanString(String msg) {
		String myString;
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		myString = sc.nextLine();
		return myString;
	}
	
	public static String scanString() {
		String myString;
		Scanner sc = new Scanner(System.in);
		myString = sc.nextLine();
		return myString;
	}
	// CHAR
	public static char scanChar(String msg) {
		char myChar;
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		myChar = sc.next().charAt(0);
		return myChar;
	}

	
	// GENERATE ARRAYS 
	
	// Random INT in RANGE
	public static int randomInt(int[] range) {

		Random rand = new Random();
		int num = rand.nextInt(range[1], range[2]);
		return num;
		}
	
	// Random INT ARRAY in RANGE
	public static int[] randomArrayInt(int lenArr, int[] range) {

		Random rand = new Random();
		int[] arr = new int[lenArr];
		for (int i = 0; i < lenArr; i++) {
			arr[i] = rand.nextInt(range[1], range[2]);
		}
		return arr;
	}
	
	// Random DOUBLE ARRAY in RANGE
	// using math
	public static double[] randomArrayM(int lenArr, int[] range) {
		double[] arr = new double[lenArr];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random() * range[1]);
		}

		return arr;
	}

	// using Random
	public static double[] randomArray(int lenArr, int[] range) {

		Random rand = new Random();
		double[] arr = new double[lenArr];
		for (int i = 0; i < lenArr; i++) {
			arr[i] = rand.nextDouble(range[1], range[2]);
		}
		return arr;
	}

	// pop array with random letters
	public static char[] randomArray(char[] arr) {

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) rand.nextDouble(97, 123); // ascii table
		}
		return arr;
	}

	
	// PRINTERS
	
	public static void printArray(char[] a) {
		System.out.println("-----------");
		for (char el : a) {
			System.out.println(el);
		}
	}

	public static void printArray(double[] a) {
		System.out.println("-----------");
		for (double el : a) {
			System.out.println(el);
		}
	}

	public static void printEmpty() {
		System.out.println("");
	}
	

	
	
}