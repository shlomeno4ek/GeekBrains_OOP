package Clients;

import java.time.LocalDate;

public class Snake extends Animal{
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
