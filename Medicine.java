package org.example.pharmacy;

import java.util.*;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }


//    public class Main {
//        public static void main(String[] args) {
//            ArrayList<Medicine> medicines = new ArrayList<>();
//
//
//            Collections.sort(medicines);
//
//            // Вывод отсортированного списка
//            for (Medicine med : medicines) {
//                System.out.println(med);
//            }
//        }
//    }

    public int calculatePower() {
        int totalpower = 0;
        for (MedicineComponent component : components) totalpower += component.getPower();
        return totalpower;
    }

    // Статический метод для сортировки передаваемого ArrayList<Medicine>
    // Используем стандартную сортировку в Collections.sort(…)
    public static void sortAndPrintMedicineArrayList(ArrayList<Medicine> inputMedList) {
        Collections.sort(inputMedList, Comparator.comparingInt(Medicine::calculatePower));
        System.out.println(inputMedList);
    }


    @Override
    public boolean hasNext() {
//        return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
//        return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "\nMedicine: total power: " + this.calculatePower() +", components: " + components.toString();
    }

    @Override
    public int compareTo(Medicine other) {
        // Сравнение объектов Medicine на основе cуммы силы компонентов

        int result;
        if (this.calculatePower() < other.calculatePower()) result = -1;
        else if (this.calculatePower() > other.calculatePower()) result = 1;
        else result = 0;
        return result;
    }
}

