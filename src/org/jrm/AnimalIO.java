package org.jrm;

import java.io.*;
import java.util.Scanner;

public class AnimalIO
{
    private String thingName;
    private InputStreamReader isr;
    private BufferedReader br;

    public AnimalIO() { }

    Cat addCat()
    {
        System.out.println("You're building a cat... What is the cat's name?");
        String name = this.getStringInputFromSysIn();

        System.out.println("How many mice has this cat killed?");
        Integer victims = this.getNumericInput();

        Cat returnCat = new Cat(victims, name);

        // System.out.println("Congrats! You generated this cat: ");
        // System.out.println(returnCat);

        return new Cat(victims, name);
    }

    public Cat addCat(String pName, String pVictims)
    {
        String inData;
        String rName;
        Integer rVictims;
        InputStream stdinHolder = System.in;

        inData = pName;
        try
        {
            System.setIn(new ByteArrayInputStream(inData.getBytes()));
            rName = this.getStringInputFromSysIn();
        }
        finally
        {
            System.setIn(stdinHolder);
        }

        inData = pVictims;
        try
        {
            System.setIn(new ByteArrayInputStream(inData.getBytes()));
            rVictims = this.getNumericInput();
        }
        finally { System.setIn(stdinHolder); }

        return new Cat(rVictims, rName);
    }

    Dog addDog()
    {
        System.out.println("You're building a dog... What is the dog's name?");
        String name = this.getStringInputFromSysIn();

        System.out.println("True or false, this dog is friendly:");
        Boolean kind = this.getBoolInputFromSysIn();

        return new Dog(kind, name);
    }

    public Dog addDog(String pName, String pKind)
    {
        String inData;
        String rName;
        Boolean rKind;
        InputStream stdinHolder = System.in;

        inData = pName;
        try
        {
            System.setIn(new ByteArrayInputStream(inData.getBytes()));
            rName = this.getStringInputFromSysIn();
        }
        finally { System.setIn(stdinHolder); }

        inData = pKind;
        try
        {
            System.setIn(new ByteArrayInputStream(inData.getBytes()));
            rKind = this.getBoolInputFromSysIn();
        }
        finally { System.setIn(stdinHolder); }

        return new Dog(rKind, rName);
    }

    Student addStudent()
    {
        System.out.println("You're building a student... What is the student's name?");
        String name = this.getStringInputFromSysIn();

        System.out.println("How old is this student?");
        Integer age = this.getNumericInput();

        return new Student(age, name);
    }

    public Student addStudent(String pName, String pAge)
    {
        String inData;
        String rName;
        int rAge;
        InputStream stdinHolder = System.in;

        inData = pName;
        try
        {
            System.setIn(new ByteArrayInputStream(inData.getBytes()));
            rName = this.getStringInputFromSysIn();
        }
        finally { System.setIn(stdinHolder); }

        inData = pAge;
        try
        {
            System.setIn(new ByteArrayInputStream(inData.getBytes()));
            rAge = this.getNumericInput();
        }
        finally { System.setIn(stdinHolder); }

        return new Student(rAge, rName);
    }

    private String getStringInputFromSysIn()
    {
        String returnString = "";
        try
        {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            returnString = br.readLine();

            // Why did closing isr force my other IO function to
            // go freaky AF?
            // isr.close();
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
        Scanner console = new Scanner(System.in);
        Scanner lineTokenizer;
        int lineNum = 0;

        while (console.hasNextLine()) {
            lineTokenizer = new Scanner(console.nextLine());
            lineNum++;

            if(!(lineTokenizer.hasNextInt()))
            {
                System.out.println("You need to enter an integer...");
            }

            if(lineTokenizer.hasNextInt())
            {
                return lineTokenizer.nextInt();
            }
        }

        return lineNum;
    }

    private Boolean getBoolInputFromSysIn()
    {
        Scanner console = new Scanner(System.in);
        Scanner lineTokenizer;
        int lineNum = 0;

        while (console.hasNextLine()) {
            lineTokenizer = new Scanner(console.nextLine());
            lineNum++;

            if(!(lineTokenizer.hasNextBoolean()))
            {
                System.out.println("You need to enter 'true' or 'false'");
            }

            if(lineTokenizer.hasNextBoolean())
            {
                return lineTokenizer.nextBoolean();
            }
        }

        return false;
    }
}
