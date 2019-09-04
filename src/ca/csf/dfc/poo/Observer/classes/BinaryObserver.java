package ca.csf.dfc.poo.Observer.classes;

import java.util.Observable;

public class BinaryObserver extends Observer implements java.util.Observer{

	   public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update(Observable o, Object arg) {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	}