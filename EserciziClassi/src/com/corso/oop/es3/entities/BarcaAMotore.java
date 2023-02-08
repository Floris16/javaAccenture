package com.corso.oop.es3.entities;

public class BarcaAMotore {
	
	private double capacity;
	private double fuelQty;
	private double maxSpeed;
	private double currentSpeed;
	private double efficency;
	private double distance;
	
	
	
	public BarcaAMotore () {
	}
	
	public BarcaAMotore (double capacity, double maxSpeed, double efficency) {
		this.capacity=capacity;
		this.maxSpeed=maxSpeed;
		this.efficency=efficency;
	}
	
	
	
	public double getFuelQty() {
		return fuelQty;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void aumentaVelocita(double vel) {
		if (vel<=0) {
			System.out.println("Non stai accelerando");
			return;
		}
		
		if (this.currentSpeed + vel >= this.maxSpeed) {
			this.currentSpeed=this.maxSpeed;
			System.out.println("Stai andando alla velocita' massima!");
			}
		else {
			this.currentSpeed+=vel;
			System.out.println("Velocita' aumentata a " + this.currentSpeed + " km/h");
		}
	}
	
	public void diminuisciVelocita(double vel) {
		if (vel<=0) {
			System.out.println("Non stai decelerando");
			return;
		}
		
		if (this.currentSpeed - vel <= 0) {
			this.currentSpeed=0;
			System.out.println("Non puoi andare in retromarcia! Sei fermo.");
			}
		else {
			this.currentSpeed-=vel;
			System.out.println("Velocita' diminuita a " + this.currentSpeed + " km/h");
		}
	}
	

	public void naviga(double time) {
		if (this.currentSpeed == 0) {
			System.out.println("Prima aumenta la tua velocita'");
			return;
		}
		
		viaggio(time/60);
		
	}
	
	private void viaggio(double time) {
		double fuelNeeded = this.currentSpeed * time * this.efficency;
		if (fuelNeeded >= this.fuelQty) {
			System.out.println("Non puoi viaggiare cosi lontano, prima rifornisci la barca");
		} else {			
			this.fuelQty -= fuelNeeded;
			this.distance += this.currentSpeed * time;
		}
	}
	
	
	public void rifornimento(double qty) {
		if (qty <= 0) {
			System.out.println("Non hai messo benzina.");
			return;
		} 
		if ((this.fuelQty + qty) <= this.capacity)
			this.fuelQty += qty; 
		else {
			System.out.println("Hai fatto il pieno.");
			this.fuelQty = this.capacity;
		}
	}
	
	public String toString() {
        String s = String.format("Quantita' carburante: %.2f lt\n" 
                + "Distanza percorsa: %.2f km\n" 
                + "Velocita' attuale: %.2f km/h\n"
                , this.capacity, this.distance, this.currentSpeed);
        return (s);
    }
}
