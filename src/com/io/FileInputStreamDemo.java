package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//fis.read() -> int -> instead of byte we have an int
public class FileInputStreamDemo {


    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream(new File("a.txt"));
            int i;
            while ((i = fileInputStream.read()) != -1){// we continue the while loop until fis.read() returns -1 which represents end of the stream
                System.out.println((char) i);
            }
            fileInputStream.close();//resources leaks
        } catch (IOException e){
                e.printStackTrace();
        }
    }
}
