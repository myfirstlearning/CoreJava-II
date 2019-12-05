package com.designPatterns;

//Builder Design Pattern
public class User {

    private String fName;
    private String lName;
    private String mName;


    public User(){}

    public User(String fName) {
        this.fName = fName;
    }

    public User(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public User(String fName, String lName, String mName) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
