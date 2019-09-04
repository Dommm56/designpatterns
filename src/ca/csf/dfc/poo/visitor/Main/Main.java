package ca.csf.dfc.poo.visitor.Main;

import ca.csf.dfc.poo.visitor.classes.*;

public class Main {

	public static void main(String[] args) {
		 ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());

	}

}
