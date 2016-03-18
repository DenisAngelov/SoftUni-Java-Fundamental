package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {

    public static void main(String[] args) throws IOException{

        // Write a program that reads three txt files words.txt, count-chars.txt and lines.txt and create a
        // zip archive named text-files.zip. Use FileOutputStream, ZipOutputStream, and FileInputStream.

        byte[] buffer = new byte[1024];

        FileOutputStream fos = new FileOutputStream("resources07/myfile.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);

        List<String> filesToZip = new ArrayList<>();
        filesToZip.add("resources07/words.txt");
        filesToZip.add("resources07/count-chars.txt");
        filesToZip.add("resources07/lines.txt");

        for (int i = 0; i < filesToZip.size(); i++) {

            FileInputStream fis = new FileInputStream(filesToZip.get(i));
            ZipEntry ze = new ZipEntry(filesToZip.get(i));
            zos.putNextEntry(ze);
            int byteReader;
            while ((byteReader = fis.read(buffer, 0 , buffer.length))>=0) {
                zos.write(byteReader);
            }
            fis.close();
        }

        zos.closeEntry();
        zos.close();

    }
}
