package com.capgemini.builder;

/**
 * Class Game
 */
public class Game extends Item {

    /**
     * Default constructor
     */
    public Game() {
    }

    /**
     * @return a packaging for a game
     */
	@Override
	public Packaging selectPackage() {
		// TODO Auto-generated method stub
		return new PlasticBox();
	}
}