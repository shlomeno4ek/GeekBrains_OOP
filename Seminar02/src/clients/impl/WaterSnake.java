package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class WaterSnake extends Animal implements Swimable {
    public WaterSnake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {

    }
    protected void fly(){
        System.out.println("Snake cannot fly.");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю");
    }
}
