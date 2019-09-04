package ca.csf.dfc.poo.Template.main;

import ca.csf.dfc.poo.Template.classes.*;

public class Main {

	public static void main(String[] args) {
		 Game game = new Cricket();
	      game.play();
	      System.out.println();
	      
	      
	      game = new Football();
	      game.play();		

	}

}
