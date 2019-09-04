package ca.csf.dfc.poo.builder.main;

import ca.csf.dfc.poo.builder.classes.Meal;
import ca.csf.dfc.poo.builder.classes.MealBuilder;

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal(); //utilisation builder
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
