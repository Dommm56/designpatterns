package ca.csf.dfc.poo.Observer.classes;

import java.util.Observable;

public class OctalObserver extends Observer implements java.util.Observer{

	   public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	}