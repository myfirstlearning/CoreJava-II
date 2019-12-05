package com.io;

import java.io.*;

public class SkipMain {

    public static void main(String[] args) {

        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("a.txt")));
            if(bufferedInputStream.markSupported()){
                char c = (char) bufferedInputStream.read();
                System.out.println(c);
                bufferedInputStream.skip(1);
                char c1 = (char) bufferedInputStream.read();
                System.out.println(c1);
                bufferedInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
