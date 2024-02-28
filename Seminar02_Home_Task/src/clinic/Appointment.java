package clinic;

import clients.Animal;
import workers.Doctor;
import workers.Nurse;

import java.time.LocalDate;

public class Appointment {
    private String symptom;
    private Doctor doctor;
    private Nurse nurse;
    private Animal animal;
    private LocalDate date;

    public String getSymptom() {
        return symptom;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDate getDate() {
        return date;
    }

    public Appointment(String symptom, Doctor doctor, Nurse nurse, Animal animal) {
        this.symptom = symptom;
        this.doctor = doctor;
        this.nurse = nurse;
        this.animal = animal;
        this.date = LocalDate.now();
    }

}
