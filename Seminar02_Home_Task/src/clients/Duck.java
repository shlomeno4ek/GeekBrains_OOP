package clients;

import clients.impl.Flyable;
import clients.impl.Goable;
import clients.impl.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Goable, Swimable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 0;
    }

    @Override
    public double run() {
        return 0;
    }

    @Override
    public double swim() {
        return 0;
    }
}
