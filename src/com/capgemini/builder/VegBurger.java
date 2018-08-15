package com.capgemini.builder;

/**
 * Class VegBurger
 */
public class VegBurger extends Burger {

    /**
     * Default constructor
     */
    public VegBurger() {
    }

    /**
     * VegBurger Name
     */
    public String name = "VegBurger";

    /**
     * VegBurger Price
     */
    public float price = 7.20f;

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