package ca.csf.dfc.poo.Singleton;

public class ObjetSeul {
	 
	private static ObjetSeul instance = new ObjetSeul();
	 //espace memoire deja reserve
	  private ObjetSeul() {};//constructeur private comme sa personne peut creer la classe

	  public static ObjetSeul getInstance(){
	      
		  return instance;
	   }

	  public void showMessage(){
	      System.out.println("Hello World!");
	   }



}
