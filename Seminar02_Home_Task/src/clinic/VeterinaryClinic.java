package clinic;

import clients.Animal;
import clients.impl.Flyable;
import clients.impl.Goable;
import clients.impl.Swimable;
import workers.Doctor;
import workers.Nurse;
import workers.Worker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private String nameClinic;
    private List<Worker> workers;
    private List<Animal> clients;
    private List<Appointment> appointments;

    public VeterinaryClinic(String nameClinic) {
        this.nameClinic = nameClinic;
        this.workers = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addWorkers(Worker worker){
        workers.add(worker);
    }

    public void makeAnAppointment(String symptom, Doctor doctor, Nurse nurse, Animal animal) {
        appointments.add(new Appointment(symptom, doctor, nurse, animal));
        clients.add(animal);
    }

    public List<Animal> getAllFlyable(){
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : clients){
            if (animal instanceof Flyable){
                flyable.add(animal);
            }
        }
        return flyable;
    }
    public List<Animal> getAllSwimmable(){
        List<Animal> swimmable = new ArrayList<>();
        for (Animal animal : clients){
            if (animal instanceof Swimable){
                swimmable.add(animal);
            }
        }
        return swimmable;
    }
    public List<Animal> getAllGoable(){
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : clients){
            if (animal instanceof Goable){
                goable.add(animal);
            }
        }
        return goable;
    }



}
