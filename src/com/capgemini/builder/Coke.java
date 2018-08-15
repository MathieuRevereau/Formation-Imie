package com.capgemini.builder;


/**
 * Class Coke
 */
public class Coke extends Drink {

    /**
     * Default constructor
     */
    public Coke() {
    }

    /**
     * Coke Name
     */
    public String name = "Coke";

    /**
     * Coke Price
     */
    public float price = 3.50f;

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