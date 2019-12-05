package com.designPatterns;

//multiThreading
//double check locking
public class Singleton {

    private static Singleton singleton;

    /*
    static {
        singleton = new Singleton();
    }*/

    private Singleton(){

    }

    //synchronized -> to avoid creating of duplicate instance during MultiThreading
    //Thread safe singleton
    //double check locking
    /*public static synchronized Singleton getInstance(){
        //Lazy instantiation
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }*/

    public static synchronized Singleton getInstance() {
        //Lazy instantiation
        if (singleton == null) {
            synchronized (Singleton.class) { //acquire lock
                if (singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }

}
