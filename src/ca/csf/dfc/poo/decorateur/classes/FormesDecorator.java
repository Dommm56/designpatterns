package ca.csf.dfc.poo.decorateur.classes;

public abstract class FormesDecorator implements Formes {
	   protected Formes decoratedShape;

	   public FormesDecorator(Formes decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.Dessiner();
	   }	
	}
