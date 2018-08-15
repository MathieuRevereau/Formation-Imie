package com.capgemini.builder;

/**
 * Class Drink
 */
public class Drink extends Item {

    /**
     * Default constructor
     */
    public Drink() {
    }

    /**
     * @return a packaging for a drink
     */
    @Override
	public Packaging selectPackage() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}