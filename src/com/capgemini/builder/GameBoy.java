package com.capgemini.builder;

/**
 * Class GameBoy
 */
public class GameBoy extends Game {

    /**
     * Default constructor
     */
    public GameBoy() {
    }

    /**
     * GameBoy Name
     */
    public String name = "GameBoy";

    /**
     * GameBoy Price
     */
    public float price = 5.90f;

    
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