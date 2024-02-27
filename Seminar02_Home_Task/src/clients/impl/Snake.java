package clients.impl;

import clients.Goable;
import clients.Swimable;

import java.time.LocalDate;

public class Snake extends Clients.Animal implements Goable, Swimable {
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void toGo(){
        System.out.println(getType() + " not toGo");
    }
    public void fly(){
        System.out.println(getType() + " not fly");
    }
}
