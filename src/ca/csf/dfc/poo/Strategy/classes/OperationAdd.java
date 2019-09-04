package ca.csf.dfc.poo.Strategy.classes;

public class OperationAdd implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
	}
