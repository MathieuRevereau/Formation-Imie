package com.capgemini.builder;

public class Application {

	public static void main(String[] args) {
		MealBuilder mealBV = new MealBuilder();
		MealBuilder mealBB = new MealBuilder();
		
	    /**
	     * Use predefined meal
	     */
		Meal vegetarianM = mealBV.vegetarian().menu();
		Meal beefM = mealBB.meat().menu();
		
		System.out.println("Votre menu V�g�tarien contient :");
		vegetarianM.menuDisplay();
		System.out.println();
		System.out.println("Votre menu Boeuf contient :");
		beefM.menuDisplay();
		
	    /**
	     * Add item on meal
	     */
		beefM.addItem(new BeefBurger(), 1);
		System.out.println();
		System.out.println("Votre menu Boeuf modifi� contient maintenant :");
		beefM.menuDisplay();
		
	    /**
	     * Add some items on meal
	     */
		vegetarianM.addItem(new VegBurger(), 3);
		System.out.println();
		System.out.println("Votre menu V�g�tarien modifi� contient maintenant :");
		vegetarianM.menuDisplay();
		
	    /**
	     * Add game on meal
	     */
		beefM.addItem(new GameBoy(), 1);
		System.out.println();
		System.out.println("Votre menu Boeuf avec jouet contient maintenant :");
		beefM.menuDisplay();
	}

}
