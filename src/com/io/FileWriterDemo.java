package com.io;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//convert string to char (x.toCharArray())
public class FileWriterDemo {

    public static void main(String[] args) {

        String x = "Hello programmer";
        try{

            FileWriter fileWriter = new FileWriter(new File("c.txt"));
            fileWriter.write(x);
            fileWriter.close();
        }catch (IOException io){
            io.printStackTrace();
        }

    }

}
