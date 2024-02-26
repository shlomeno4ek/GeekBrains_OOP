package Clients;
import java.time.*;

public class Lion extends Animal{

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println(getType() + " not fly");
    }
}
