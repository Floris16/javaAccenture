package com.corso.oop.utility;

import java.util.Random;
import java.util.Scanner;

public class Utilities {
	public static String scanString(String str) {
	    Scanner sc = new Scanner(System.in);
	    String stringaDaTastiera;
	    System.out.println(str);
	    stringaDaTastiera=sc.nextLine();
	    
	    return stringaDaTastiera;
	}
	
	public static boolean checkData(int m, int g) {

        switch (m) {
        case 4: case 6: case 9: case 11:
            if (g <= 30 && g >= 1)
                return true;
            break;
            
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
           if (g <= 31 && g >= 1)
                return true;
            break;
            
        case 2:
            if (g <= 28 && g >= 1)
                return true;
            break;
        }

        System.err.println("Data non valida");
        return false;
    }
	
	public static int leggiInt() {

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}
	
	public static double generaDouble() {
		Random rng = new Random();
		return rng.nextDouble(150,30001);
	}
}
