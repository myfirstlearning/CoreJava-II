package com.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Serialization - saving objects to storage in the form of bits and bytes
//Deserialization - bringing in the objects back to life in heap from the storage
//Deserialization doesn't make use of new keyword to create the object
//static and transient variables are not serialized
public class TestSerialization {


    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("JerseyCity");
        address.setState("NJ");

        Employee e = new Employee();
        e.setId("1");
        e.setName("emp1");
        e.setAddressObj(address);

        Employee e1 = new Employee();
        e1.setId("2");
        e1.setName("emp2");
        e1.setAddressObj(address);

        try{

            FileOutputStream fileOutputStream = new FileOutputStream("emp.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(e);
            objectOutputStream.writeObject(e1);
            objectOutputStream.close();

        }catch(IOException IO){
            IO.printStackTrace();
        }


    }

}
