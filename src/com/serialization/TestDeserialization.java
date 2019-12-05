package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization  {

    public static void main(String[] args) {

        try{

            FileInputStream fileInputStream = new FileInputStream("a.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Employee emp1 = (Employee) objectInputStream.readObject();//no new object, object was created in JVM and emp1 is pointed to it.
            System.out.println(emp1.getId() + "" + emp1.getName() + "" + emp1.getPhoneNo());

            objectInputStream.close();
            fileInputStream.close();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
