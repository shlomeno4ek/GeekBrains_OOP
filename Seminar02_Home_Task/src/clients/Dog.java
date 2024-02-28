
package clients;

import clients.impl.Goable;
import clients.impl.Swimable;

import java.time.*;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double run() {
        return 20;
    }

    @Override
    public double swim() {
        return 2;
    }
}
