package ca.csf.dfc.poo.decorateur.Main;

import ca.csf.dfc.poo.decorateur.classes.*;

public class Main {

	public static void main(String[] args) {
		Formes circle = new Cercle();

		Formes redCircle = new RedFormesDecorator(new Cercle());

		Formes redRectangle = new RedFormesDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.Dessiner();

	      System.out.println("\nCircle of red border");
	      redCircle.Dessiner();

	      System.out.println("\nRectangle of red border");
	      redRectangle.Dessiner();

	}

}
