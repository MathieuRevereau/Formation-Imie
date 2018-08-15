package com.capgemini.builder;

/**
 * Class MealBuilder
 */
public class MealBuilder {

	private Meal meal = new Meal();
	
    /**
     * Default constructor
     */
    public MealBuilder() {
    }




    /**
     * @return a meal
     */
    public Meal menu() {
    	return meal;
    }

    /**
     * @return default vegetarian mealBuilder
     */
    public MealBuilder vegetarian() {
        meal.addItem(new VegBurger(), 1);
        meal.addItem(new Pepsi(), 1);
        return this;
    }

    /**
     * @return default vegetarian + game mealBuilder
     */
    public MealBuilder happyVeg() {
        meal.addItem(new VegBurger(), 1);
        meal.addItem(new Pepsi(), 1);
        meal.addItem(new Doll(), 2);
        return this;
    }

    /**
     * @return default meat mealBuilder
     */
    public MealBuilder meat() {
        meal.addItem(new BeefBurger(), 1);
        meal.addItem(new Coke(), 1);
        return this;
    }

    /**
     * @return default meat + game mealBuilder
     */
    public MealBuilder happyMeat() {
        meal.addItem(new BeefBurger(), 1);
        meal.addItem(new Coke(), 1);
        meal.addItem(new GameBoy(), 1);
        return this;
    }

}