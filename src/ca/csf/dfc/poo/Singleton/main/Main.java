package ca.csf.dfc.poo.Singleton.main;

import ca.csf.dfc.poo.Singleton.ObjetSeul;

public class Main {
	//ATTENTION SINGLETONS PAS BON
	public static void main(String[] args) {
		//ObjetSeul object = new ObjetSeul();//marche pas pcq private->peut pas instancier
		ObjetSeul object = ObjetSeul.getInstance();//va chercher son instance
		
	      //show the message
	      object.showMessage();

	}

}
