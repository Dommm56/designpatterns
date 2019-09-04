package ca.csf.dfc.poo.decorateur.classes;

public class RedFormesDecorator extends FormesDecorator {

	   public RedFormesDecorator(Formes decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void Dessiner() {
	      decoratedShape.Dessiner();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Formes decoratedShape){
	      System.out.println("Border Color: Red");
	   }
	}