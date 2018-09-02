package org.jrm;

/**
 * Class model for a abstract class Pet
 * @author mgreen14
 * @version 1.0
 */
public abstract class Pet {
    protected String name;

    /**
     * Pet constructor.
     * @param name String representation of name for this pet
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Method for returning this name
     * @return String representation of the name of this pet.
     */
    public String getName() {
        return name;
    }

}