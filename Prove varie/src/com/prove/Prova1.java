package com.prove;

public class Prova1{

	private int var1;
	private String var2;
	private static double var3;
	
	public Prova1() {
		this.var1=1;
		this.var2="2";
	}

	public static void metodo1() {
		System.out.println("ciao");
	}
	
	public double metodo2() {
		double ret = var3+1;
		metodo1();
		return ret; 
	}

	public static void metodo2(int a) {
		
	}
}