package com.sethjava.designpatterns;

public class Main {

    public static void main(String[] args) {
	    PersonBuilder builder = new PersonBuilder();
	    Person person = builder
                .lives()
                    .at("123 JFK Blvd")
                    .in("Orlando")
                    .withPostcode("32746")
                .works()
                    .at("Bank of America")
                    .asA("Software Architect")
                    .earning(150000)
                .build();
        System.out.println(person);
    }
}
