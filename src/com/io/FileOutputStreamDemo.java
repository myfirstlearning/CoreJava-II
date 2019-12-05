package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {
        String s = "Hello File IO";
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(new File("c.txt"));
            byte[] contents = s.getBytes();
            fileOutputStream.write(contents);
            //fileOutputStream.write(s.getBytes());
            fileOutputStream.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
