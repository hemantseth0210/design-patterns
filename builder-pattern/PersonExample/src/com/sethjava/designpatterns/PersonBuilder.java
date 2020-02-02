package com.sethjava.designpatterns;

public class PersonBuilder {
    Person person = new Person();

    public PersonAddessBuilder lives(){
        return new PersonAddessBuilder(person);
    }

    public PersonJobBuilder works(){
        return new PersonJobBuilder(person);
    }

    public Person build(){
        return person;
    }
}
