package clients;

import clients.impl.Goable;
import clients.impl.Swimable;

import java.time.LocalDate;

public class Snake extends Animal implements Goable, Swimable {
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
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
