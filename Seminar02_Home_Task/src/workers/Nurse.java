package workers;

import java.time.LocalDate;

public class Nurse extends Worker{

    private String name;

    public Nurse(String name, LocalDate age, LocalDate EmplDate, double salary) {
        super(name, age, EmplDate, salary);
    }

    @Override
    public void toWork() {
        System.out.println(super.getName() +  " делает укол!");

    }

    public String getName() {
        return "Медсестра: " + super.getName();
    }
}
