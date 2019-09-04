package ca.csf.dfc.poo.visitor.classes;

public class Keyboard implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
