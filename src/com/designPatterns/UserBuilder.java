package com.designPatterns;

public class UserBuilder {

    private String fName;
    private String lName;
    private String mName;



    public UserBuilder setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public UserBuilder setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public UserBuilder setmName(String mName) {
        this.mName = mName;
        return this;
    }


    public User build(){
        return new User(this.fName, this.lName, this.mName);
    }

}
