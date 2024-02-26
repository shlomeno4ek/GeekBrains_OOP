package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {

    }

    public void FishLifeCycle(){
        swim();
        swim("ocean");
    }

    protected void swim(String destination){
        System.out.println(getType() + " is swimming to " + destination);
    }
    protected void fly(){
        System.out.println("Fish cannot fly");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю");
    }
}
