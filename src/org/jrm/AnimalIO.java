package org.jrm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AnimalIO
{
    private String thingName;
    private InputStreamReader isr;
    private BufferedReader br;

    public AnimalIO() { }

    public Cat genCat()
    {
        System.out.println("You're building a cat... What is the cat's name?");
        String name = this.getStringInputFromSysIn();

        System.out.println("How many mice has this cat killed?");
        Integer victims = this.getNumericInput();

        return new Cat(victims, name);
    }

    public Dog genDog()
    {
        System.out.println("You're building a dog... What is the dog's name?");
        String name = this.getStringInputFromSysIn();
        return new Dog(true, name);
    }

    public Student genStudent()
    {
        System.out.println("You're building a student... What is the student's name?");
        String name = this.getStringInputFromSysIn();
        return new Student(42, name);
    }

    private String getStringInputFromSysIn()
    {
        String returnString = "";
        try
        {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            returnString = br.readLine();

            isr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Puke");
        }

        return returnString;
    }

    private Integer getNumericInput()
    {
        Integer intToReturn;

        Scanner sc = new Scanner(System.in);

        String lineOfInput = sc.next();

        while (sc.hasNextLine())
        {
            System.out.println("got sumthin");
        }

        String someString = "Sup yall?";

        int i = sc.nextInt();

        intToReturn = i;

        return intToReturn;
    }
}
