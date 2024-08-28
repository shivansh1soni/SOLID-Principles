package com.shivansh.liskov_substitution_principle;

public class BirdWatcher {
    public void watchFlyable(Flyable flyable) {
        flyable.fly(); // Safe to call fly() here
    }
}