package org.jrm;

/**
 * Class model for a dog
 * @author mgreen14
 * @version 1.0
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Constructor for dog
     * @param friendly boolean value denoting if dog is friendly or not
     * @param name string value denoting a the dog's proper name
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return boolean value denoting if this dog is friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     *
     * @return string value of overridden 'talk' method. In this case, "bark"
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     *
     * @return string value of a 'stringified' dog object.
     */
    @Override
    public String toString() {
        return "org.jrm.Dog: " + "name=" + name + " friendly=" + friendly;
    }


}