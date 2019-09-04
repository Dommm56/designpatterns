package ca.csf.dfc.poo.FactoryPattern.classes;

public class FactoryFormes {
	
	   //use getShape method to get object of type shape 
	   public Formes getForme(String TypeForme){
	      if(TypeForme == null){
	         return null;
	      }		
	      if(TypeForme.equalsIgnoreCase("Cercle")){
	         return new Cercle();
	         
	      } else if(TypeForme.equalsIgnoreCase("Ellipse")){
	         return new Ellipse();
	         
	      } else if(TypeForme.equalsIgnoreCase("Rectangle")){
	         return new Rectangle();
	      }
	      
	      return null;
	   }
	}