package com.corso.oop.es10.utility;

import java.util.Scanner;

public class ScanVari {
	public static int scanInt(String g) {
		System.out.println(g);
		Scanner sc = new Scanner(System.in);
		int it = 0;
		it = sc.nextInt();
		return it;
	}

	public static String scanString(String g) {
		System.out.println(g);
		Scanner sc = new Scanner(System.in);
		String str = "";
		str = sc.nextLine();

		return str;
	}

	public static double scanVDouble(String g) {

		Scanner sc = new Scanner(System.in);
		double db = 0.00;

		System.out.println(g);
		db = sc.nextDouble();

		return db;
	}

	public static boolean scanBool(String g) {
		System.out.println(g);
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		bool = sc.nextBoolean();
		return bool;
	}

	public static short scanShort(String g) {
		System.out.println(g);
		Scanner sc = new Scanner(System.in);
		short it = 0;
		it = sc.nextShort();
		if (it >= 0 && it < 24) {
			return it;
		} else {
			scanShort("Ora non valida");
		}
		return it;
	}
}
