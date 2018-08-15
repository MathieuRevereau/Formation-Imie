package com.capgemini.builder;

/**
 * Class Pepsi
 */
public class Pepsi extends Drink {

    /**
     * Default constructor
     */
    public Pepsi() {
    }

    /**
     * Pepsi Name
     */
    public String name = "Pepsi";

    /**
     * Pepsi Price
     */
    public float price = 3.20f;

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