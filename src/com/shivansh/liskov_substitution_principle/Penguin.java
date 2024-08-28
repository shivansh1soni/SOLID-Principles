package com.shivansh.liskov_substitution_principle;

public class Penguin implements Flyable{

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin can't fly");
    }
}
