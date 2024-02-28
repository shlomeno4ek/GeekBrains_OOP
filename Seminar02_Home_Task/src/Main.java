import clients.Dog;
import clients.Duck;
import clients.Owner;
import clients.Snake;
import clinic.VeterinaryClinic;
import workers.Doctor;
import workers.Nurse;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        VeterinaryClinic clinic = new VeterinaryClinic("Здоровый питомец");

        Doctor doctor = new Doctor("Докторов",
                LocalDate.of(1975, 11, 12),
                LocalDate.of(2024, 2, 28),
                15000);

        Nurse nurse = new Nurse("Медсестрова",
                LocalDate.of(1988, 9, 5),
                LocalDate.of(2024, 2, 28),
                10000);

        clinic.addWorkers(doctor);
        clinic.addWorkers(nurse);

        clinic.makeAnAppointment("Болит лапка",
                doctor,
                nurse,
                new Dog("Шарик",
                        9,
                        LocalDate.of(2019, 10, 12),
                        new Owner("Сидоров")));

        clinic.makeAnAppointment("Болит крыло",
                doctor,
                nurse,
                new Duck("Кря",
                        9,
                        LocalDate.of(2020, 12, 12),
                        new Owner("Петров")));

        clinic.makeAnAppointment("Болит хвост",
                doctor,
                nurse,
                new Snake("Шипучка",
                        9,
                        LocalDate.of(2021, 11, 12),
                        new Owner("Иванов")));

        System.out.println("Ходячие животные: " + clinic.getAllGoable());
        System.out.println("Плавующие животные: " + clinic.getAllSwimmable());
        System.out.println("Летающие животные: " + clinic.getAllFlyable());
    }
}