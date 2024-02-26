package Clients;

import java.time.LocalDate;

public class Hummingbird extends Animal{
    public Hummingbird(String name, double weight, LocalDate age, Owner owner) {
        super(name, (float) weight, age, owner);
    }
    public void toGo(){
        System.out.println(getType() + " not toGo");
    }
    public void swim(){
        System.out.println(getType() + " not swim");
    }
}
