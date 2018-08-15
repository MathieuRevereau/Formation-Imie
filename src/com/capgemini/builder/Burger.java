package com.capgemini.builder;

/**
 * Class Burger
 */
public class Burger extends Item {

    /**
     * Default constructor
     */
    public Burger() {
    }

    /**
     * @return a packaging for a burger
     */
    @Override
	public Packaging selectPackage() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}