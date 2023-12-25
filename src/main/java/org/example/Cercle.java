package org.example;

public class Cercle implements IForme{
	private double rayon;
	public Cercle(double r) {
		rayon = r;
	}
	public double getRayon() {
		return rayon;
	}
	public double aire() {
		return this.getRayon() * this.getRayon() * Math.PI;
	}
}
