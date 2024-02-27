
package clients.impl;
import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;

import java.time.*;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println(getType() + " not fly");
    }
}
