import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinium;
import pharmacy.impl.Vetbicid;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<MedicineComponent> medList = new ArrayList<>();
        ArrayList<Medicine2> medicinelist = new ArrayList<>();

        Asitromin asitr = new Asitromin("Asitro", 50, 25);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);

        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);

        Medicine2 medicine2 = new Medicine2();
        medicine2.addComponent(vetbic).addComponent(penicilinium);

        medicinelist.add(medicine2);
        medicinelist.add(medicine1);
//        for (MedicineComponent companent : medicine1) {
//
//        }
//        Iterator<MedicineComponent> med = medicine1;
//        while (medicine1.hasNext()) {
//            System.out.println(med.next());
//        }
//        for (MedicineComponent component : medicine1) {
//            System.out.println(component);
//        }
//        medList.add(asitr);
//        medList.add(penicilinium);
//        medList.add(vetbic);
//        System.out.println(medList);
//        Collections.sort(medList, (o1, o2) -> 0);
//        System.out.println(medList);
        System.out.println(medicinelist);
        Collections.sort(medicinelist);
        System.out.println(medicinelist);
    }
}