package org.example.pharmacy;

import org.example.pharmacy.impl.Asitromin;
import org.example.pharmacy.impl.Penicilinium;
import org.example.pharmacy.impl.Vetbicid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        ArrayList<MedicineComponent> medList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 50, 25);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbid", 40, 30);
       // Medicine2 medicine1 = new Medicine2();
        // medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);
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

        Medicine med1 = new Medicine();
        med1.addComponent(asitr);
        med1.addComponent(penicilinium);
        med1.addComponent(vetbic);

        Medicine med2 = new Medicine();
        med2.addComponent(penicilinium);
        med2.addComponent(vetbic);

        Medicine med3 = new Medicine();
        med3.addComponent(vetbic);
        med3.addComponent(asitr);

        Medicine med4 = new Medicine();
        med4.addComponent(vetbic);

        ArrayList<Medicine> medList = new ArrayList<Medicine>();
        medList.add(med1);
        medList.add(med2);
        medList.add(med3);
        medList.add(med4);


        // Collections.sort(medList, Comparator.comparingInt(Medicine::calculatePower));
        Medicine.sortAndPrintMedicineArrayList(medList);





//        System.out.println(medList);
//        Collections.sort(medList, (o1, o2) -> 0);
//        System.out.println(medList);

    }
}

