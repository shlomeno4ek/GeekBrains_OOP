package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Goable, Swimable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
}
