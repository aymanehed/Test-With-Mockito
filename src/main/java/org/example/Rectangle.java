package org.example;

public class Rectangle implements IForme{
	private double largeur;
	private double hauteur;
	
	public Rectangle(double w, double h) {
		largeur = w;
		hauteur = h;
	}
	public double getLargeur() {
		return largeur;
	}
	public double getHauteur() {
		return hauteur;
	}
	public double aire() {
		return this.getHauteur()*this.getLargeur();
		
	}
}
