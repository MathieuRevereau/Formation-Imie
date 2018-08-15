package com.capgemini.builder;

/**
 * Class BeefBurger
 */
public class BeefBurger extends Burger {

    /**
     * Default constructor
     */
    public BeefBurger() {
    }

    /**
     * Burger Name
     */
    public String name = "BeefBurger";

    /**
     * Burger Price
     */
    public float price = 8.50f;

    
    /**
     * Accessors
     */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    
}