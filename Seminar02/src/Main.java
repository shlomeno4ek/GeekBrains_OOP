import clients.Animal;
import clients.Flyable;
import clients.Owner;
import clients.impl.Cat;
import clients.impl.Duck;
import clients.impl.Eagle;
import clients.impl.Fish;

import java.awt.datatransfer.FlavorEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Vasya", 7, LocalDate.now(), new Owner());
        Fish fish = new Fish("Vasya", 1, LocalDate.now(), new Owner());
        fish.sound();
        List<Animal> flyables = new ArrayList<>();
        flyables.add(new Duck("duck1",0.20f, LocalDate.now(), null));
        flyables.add(new Eagle("Eagle1", 12f, null, null));
        flyables.add(cat);

        for (Animal animal : flyables) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
        }
    }
}