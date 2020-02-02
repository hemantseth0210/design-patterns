package com.sethjava.designpatterns;

public class Main {

    public static void main(String[] args) {
	    User user = new User.UserBuilder("John", "Doe").age(30).phone("3546307832")
                .address("135 John Parkway street, Winter Park, Florida").build();
        System.out.println(user);
    }
}
