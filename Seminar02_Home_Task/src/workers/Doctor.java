package workers;

import java.time.LocalDate;

public class Doctor extends Worker{

    public Doctor(String name, LocalDate age, LocalDate EmplDate, double salary) {
        super(name, age, EmplDate, salary);
    }

    @Override
    public void toWork() {
        System.out.println(super.getName() +  " делает осмотр!");
    }

    public String getName() {
        return "Доктор: " + super.getName();
    }
}
