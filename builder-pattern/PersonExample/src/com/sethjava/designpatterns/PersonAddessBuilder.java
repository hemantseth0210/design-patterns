package com.sethjava.designpatterns;

public class PersonAddessBuilder extends PersonBuilder{

    public PersonAddessBuilder(Person person) {
        this.person = person;
    }

    public PersonAddessBuilder at(String streetAddress){
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddessBuilder withPostcode(String postcode){
        person.postcode = postcode;
        return this;
    }

    public PersonAddessBuilder in(String city){
        person.city = city;
        return this;
    }

}
