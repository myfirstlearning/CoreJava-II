package com.designPatterns;

public class UserMain {

    public static void main(String[] args) {

        User user = new User("Jack", null, "Patterson");
        UserBuilder userBuilder = new UserBuilder();
        userBuilder = userBuilder.setfName("Jack").setlName("patterson");
        User user1 = userBuilder.build();
    }

}
