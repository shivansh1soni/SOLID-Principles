package com.shivansh.liskov_substitution_principle;

public class LspMain {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        BirdWatcher watcher = new BirdWatcher();
        watcher.watchFlyable(sparrow); // Works fine
        watcher.watchFlyable(penguin); // This would be a compile-time error, as Penguin is not Flyable
    }
}
