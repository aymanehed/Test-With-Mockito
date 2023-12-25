package org.example;

import org.example.CalculatriceAire;
import org.example.IForme;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CalculatriceAireApp {
	public static void main(String args[]) {
		Cercle c = new Cercle(2.0);
		Rectangle r = new Rectangle(2, 4);
		List<IForme> myArrayList = new ArrayList<IForme>();
		myArrayList.add(c);
		myArrayList.add(r);
		System.out.println("Totale des surfaces du cercle et du rectangle: " 
		+ CalculatriceAire.aire(myArrayList));
	}
}
