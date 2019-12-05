package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Default buffer size is "8MB"
public class BufferWriterDemo {

    public static void main(String[] args) {

        String[] strs = {"hello programmer", "hello developer"};

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("s.txt")));

            for (String str : strs) {
                bufferedWriter.write(str);
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
