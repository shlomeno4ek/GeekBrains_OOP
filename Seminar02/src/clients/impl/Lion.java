package clients.impl;

import clients.Animal;
import clients.Owner;

import java.time.LocalDate;

public class Lion extends Animal {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {

    }
}
