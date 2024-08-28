package com.shivansh.liskov_substitution_principle;

public class Sparrow implements Flyable{

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}
