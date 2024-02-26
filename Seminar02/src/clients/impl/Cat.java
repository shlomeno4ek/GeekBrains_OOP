package clients.impl;

import clients.Animal;
import clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    public void CatLifeCycle(){
        meow();
        swim();
    }
    private void meow(){
        System.out.println(getType() + " Meow");
    }
    protected void toGo(String destination){
        System.out.println(getType() + " is going " + destination);
    }
    protected void swim(){
        System.out.println("Cat cannot swim.");
    }
    protected void fly(){
        System.out.println("Cat cannot fly.");
    }
}