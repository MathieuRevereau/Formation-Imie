package com.capgemini.builder;

/**
 * Class Item
 */
public abstract class Item {

    /**
     * Default constructor
     */
    public Item() {
    }

    /**
     * Item Name
     */
    public String name;

    /**
     * Item Price
     */
    public float price;

    /**
     * @return a packaging for one item
     */
    public abstract Packaging selectPackage();

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