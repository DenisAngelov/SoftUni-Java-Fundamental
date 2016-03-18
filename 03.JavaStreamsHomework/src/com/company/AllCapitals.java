package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AllCapitals {

    public static void main(String[] args) throws IOException {

        // Write a program that reads a text file and changes the casing of all letters to upper.
        // The file should be overwritten. Use BufferedReader, FileReader, FileWriter, and PrintWriter.

        BufferedReader bfr = new BufferedReader(
                new FileReader(
                        "resources02/lines.txt"
                )
        );

        String line;
        List<String> lines = new ArrayList<>();

        while ((line = bfr.readLine()) != null){
            lines.add(line.toUpperCase());
        }

        FileWriter pwriter = new FileWriter(new File("resources02/lines.txt"));

        for (int i = 0; i < lines.size(); i++) {
            pwriter.write(lines.get(i));
            pwriter.write(System.lineSeparator());
        }

        pwriter.close();

    }
}
