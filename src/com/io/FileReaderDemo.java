package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(new File("a.txt"));
            int i;
            while((i = fileReader.read()) != -1){
                System.out.println((char) i);
            }
            fileReader.close(); 
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}
