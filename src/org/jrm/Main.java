package org.jrm;

import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {

        AnimalIO aio = new AnimalIO();

        Boolean notDone = true;

        ArrayList<Talkable> zoo = new ArrayList<>();

        while (notDone)
        {
            try
            { zoo.add(aio.addCat()); notDone = false; }
            catch (IllegalArgumentException e)
            {
                System.out.println("Exception caught!");
                System.out.println(e);
            }

        }
        notDone = true;

        while (notDone)
        {
            try { zoo.add(aio.addDog()); notDone = false; }
            catch (IllegalArgumentException e)
            {
                System.out.println("Exception caught!");
                System.out.println(e);
            }
        }
        notDone = true;

        while (notDone)
        {
            try { zoo.add(aio.addStudent()); notDone = false; }
            catch (IllegalArgumentException e)
            {
                System.out.println("Exception caught!");
                System.out.println(e);
            }
        }

        /* for (Talkable thing: zoo)
        {
            printOut(thing);
        } */


        for (Talkable thing : zoo)
        {
            outFile.fileWrite(thing.getName() + "|" + thing.talk());
        }
        outFile.fileClose();

        System.out.println(inFile.fileReadLine());

        /* inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;

        while ((line = indata.fileReadLine()) != null)
        {
            System.out.println(line);
        } */
    }

    public static void printOut(Talkable p)
    {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }

}
