package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveAnArrayListOfDoubles {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream,
        // ObjectOutputStream. Set the name of the new file as doubles.list

        List<Double> numbers = new ArrayList<>();

        for (double i = 0; i < 10; i+=3) {
            numbers.add(i + Math.random());
        }

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(
                        "resources05/doubles.list"
                )
        );

        oos.writeObject(numbers);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(
                        "resources05/doubles.list"
                )
        );

        System.out.println("Numbers: " + ois.readObject());

    }
}
