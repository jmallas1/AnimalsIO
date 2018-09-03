package org.jrm;

/**
 * Class model for a Student class
 * @author mgreen14
 * @version 1.0
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Constructor for Student
     * @param age integer representation of age
     * @param name String representation of name
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * Return the age of this student
     * @return integer reprsentation of the 'age' of this student
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of this student
     * @param age integer representation of the age of this student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Override of interface org.jrm.Talkable
     * @return String representation of what this student would say.
     */
    @Override
    public String talk() {
        return "Can we talk about my grade?";
    }
}
