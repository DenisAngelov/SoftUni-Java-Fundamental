package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJPGFile {

    public static void main(String[] args) throws IOException{

        // Write a program that copies the contents of a .jpg file to another using FileInputStream,
        // FileOutputStream, and byte[] buffer. Set the name of the new file as my-copied-picture.jpg.

        FileInputStream fis = new FileInputStream("resources04/wizard.jpg");
        FileOutputStream fos = new FileOutputStream("resources04/copy-wizard.jpg");
        byte[] buffer = new byte[4096];

        int readBytes;

        while (!((readBytes = fis.read(buffer, 0, buffer.length))<= 0)){
            fos.write(buffer, 0, readBytes);
        }

        fis.close();
        fos.close();

    }
}
