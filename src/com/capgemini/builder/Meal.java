package com.capgemini.builder;
import java.util.*;

/**
 * Class Meal
 */
public class Meal {

    /**
     * Default constructor
     */
    public Meal() {
    }

    /**
     * Object List Item
     */
    private List<Item> items = new ArrayList<Item>();



    /**
     * @return a meal with one or some item
     */
    public Meal addItem(Item item, int number) {
		for (int i = 1; i <= number; i++) {
			items.add(item);
		}
		return this;
    }

    /**
     * @return meal's price
     */
    public float menuCost() {
        float menuPrice = 0f;
        
        for (Item item : items) {
			menuPrice += item.getPrice();
		}
        return menuPrice;
    }

    /**
     * Show the meal on the consol
     */
    public void menuDisplay() {
        for (Item item : items) {
			System.out.println("Votre item "+item.getName()+" est emballé dans un(e)"+item.selectPackage().getName()+", son prix est de :"+item.getPrice());
		}    
        System.out.println("Son prix total est de "+this.menuCost()+" euros");
    }

}