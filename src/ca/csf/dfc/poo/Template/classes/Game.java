package ca.csf.dfc.poo.Template.classes;

public abstract class Game {
	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	   //template method
	   public final void play(){ //des fonctions dans des fonctions wow!

	      //initialize the game
	      initialize();

	      //start game
	      startPlay();

	      //end game
	      endPlay();
	   }
	}
