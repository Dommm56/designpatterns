package ca.csf.dfc.poo.Observer.main;

import ca.csf.dfc.poo.Observer.classes.*;

public class Main {

	public static void main(String[] args) {
		//cree un sujet cobaile
		Subject subject = new Subject();
//on lui met des observeurs
	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);
//on change letat et on voit que la facon de voir est change
	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}

}
