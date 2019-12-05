package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//wrap low level to high level
//define the buffer(array) -> set buffer size
//bufferedInputStream.read(buffer) -> returns int(represents number of bytes read)
//int = -1, its done reading
//close, low level and high level
public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("a.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] contents = new byte[1024];
            int byteread = 0;
            while ((byteread = bufferedInputStream.read(contents)) != 1){
                String string = new String(contents, 0, byteread);
                System.out.println(string);
            }
            bufferedInputStream.close();
            fileInputStream.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
