package org.jrm;

/**
 * Class model for a abstract class Person
 * Should probably think about having this be an exception and support
 * dual inheritance from two, "parents." (bazinga)
 * @author mgreen14
 * @version 1.0
 */
public abstract class Person {
    private String name;

    /**
     * Person constructor.
     * @param name String representation of name for this person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Method for returning this name
     * @return String representation of the name of a person.
     */
    public String getName() {
        return name;
    }

    /**
     * Set this persons name
     * @param name String representation of the persons name
     */
    public void setName(String name) {
        this.name = name;
    }


}