package ca.csf.dfc.poo.FactoryPattern.main;

import ca.csf.dfc.poo.FactoryPattern.classes.*;


public class Main {

	public static void main(String[] args) {
		 FactoryFormes shapeFactory = new FactoryFormes();
	     Formes shape1 = shapeFactory.getForme("Cercle");
	     shape1.Dessiner();
	     
	     FactoryFormes shapeFactory2 = new FactoryFormes();
	     Formes shape2 = shapeFactory2.getForme("Rectangle");
	     shape2.Dessiner();
	     
	     FactoryFormes shapeFactory3 = new FactoryFormes();
	     Formes shape3= shapeFactory3.getForme("Ellipse");
	     shape3.Dessiner();


	}

}
