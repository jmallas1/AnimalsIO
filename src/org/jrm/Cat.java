package org.jrm;

/**
 * Class model for a cat
 * @author mgreen14
 * @version 1.0
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Class constructor for cat
     * @param mousesKilled number of mice eviscerated by said cat
     * @param name name of our cute, fluffy murderer
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * @return returns the number of mice that have been decimated by this cat
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * increments killed mice
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     *
     * @return returns what the cat says
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *
     * @return returns string representation of this object
     */
    @Override
    public String toString() {
        return "org.jrm.Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

