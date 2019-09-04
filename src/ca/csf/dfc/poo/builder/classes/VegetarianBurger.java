package ca.csf.dfc.poo.builder.classes;

public class VegetarianBurger extends Burger {

	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
	}