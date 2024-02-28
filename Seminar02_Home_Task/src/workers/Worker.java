package workers;

import java.time.LocalDate;

public abstract class Worker {

    private String name;
    private LocalDate age;
    private LocalDate employ;
    private double salary;

    public Worker(String name, LocalDate age, LocalDate employ, double salary) {
        this.name = name;
        this.age = age;
        this.employ = employ;
        this.salary = salary;
    }

    abstract void toWork();

    public String getName() {
        return name;
    }

    public LocalDate getAge() {
        return age;
    }

    public LocalDate getEmploy() {
        return employ;
    }

    public double getSalary() {
        return salary;
    }
}
