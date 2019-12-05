package com.io;


//The File class is used to read information
//about existing files and directories, list the contents of a directory, and create/delete files

import java.io.File;
import java.util.Date;

public class FileDemo {


    public static void main(String[] args) {

        System.out.println(File.separator);
        System.out.println(System.getProperty("file.separator"));
        File file = new File("C:\\Users\\dheeraj\\Desktop\\Devops\\devops.txt");
        // TODO
        //File file1 = new File("C: "+ File.separator + "Users\\dheeraj\\Desktop\\Devops\\devops.txt");
        System.out.println("File exists : " + file.exists());
        if(file.exists()){
            System.out.println("Absolute Path:" + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if(file.isFile()){
                System.out.println("File size: " + file.length());
                System.out.println("File Last Modified :" + file.lastModified());
                System.out.println(new Date(file.lastModified()));
            } else {
                for(File subFile : file.listFiles()){
                    System.out.println("\t" + subFile.getName());
                }
            }
        }
    }
}
