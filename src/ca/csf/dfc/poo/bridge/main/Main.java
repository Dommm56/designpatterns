package ca.csf.dfc.poo.bridge.main;

import ca.csf.dfc.poo.bridge.classes.*;

public class Main {

	public static void main(String[] args) {
		Shape square = new Carre(new Red());
		  System.out.println(square.draw());
		  

	}

}
