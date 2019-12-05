package com.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//create low level stream object
//create bufferedoutputstream and pass low level stream
//flush -> flush the contents from OS memory to the file
public class BufferOutputSreamDemo {

    public static void main(String[] args) {

        String s = "Hello Dude Whats up ?";
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(new File("h.txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bytes = s.getBytes();
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
