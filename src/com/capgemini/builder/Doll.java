package com.capgemini.builder;

/**
 * Class Doll
 */
public class Doll extends Game {

    /**
     * Default constructor
     */
    public Doll() {
    }

    /**
     * Doll Name
     */
    public String name = "Doll";

    /**
     * Doll Price
     */
    public float price = 2.50f;

    /**
     * Accessor
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