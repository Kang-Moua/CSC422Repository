package com.assignment1;

import java.util.ArrayList;

public class PetTable {

    //array list for pet id, name, age
    private ArrayList<Integer> id = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<Integer> age = new ArrayList<>();

    //no-args default constructor
    public PetTable() {
    }

    //creates table and get info from array lists
    public void table() {
        System.out.printf("+----------------------+\n");
        System.out.printf("%-3s %-10s %4s", "ID", "NAME", "AGE\n");
        System.out.println("+----------------------+");
        if (id.size() == 0) {
            System.out.print("\n");
        } else {
            for (int i = 0; i < id.size(); i++) {
                System.out.printf("%-3s %-10s %4s", id.get(i), name.get(i), age.get(i) + "\n");
            }
        }
        System.out.println("+----------------------+");
        System.out.println(id.size() + " row(s) in set.\n");
    }

    //add pet id to id array list
    public void addPetId() {
        if (id.size() == 0) {
            id.add(0);
        } else {
            id.add(id.size());
        }
    }

    //add pet name to name array list
    public void addPetName(String petName) {
        name.add(petName);
    }

    //add pet age to age array list
    public void addPetAge(int petAge) {
        age.add(petAge);
    }

    //search for name of pet in array list
    public void nameSearch(String petName) {
        int counter = 0;
        System.out.printf("\n+----------------------+\n");
        System.out.printf("%-3s %-10s %4s", "ID", "NAME", "AGE\n");
        System.out.println("+----------------------+");

        if (name.contains(petName)) {
            for (int i = 0; i < id.size(); i++) {
                if (name.get(i).equals(petName)) {
                    System.out.printf("%-3s %-10s %4s", id.get(i), name.get(i), age.get(i) + "\n");
                    counter++;
                }
            }
        } else {
            System.out.print("\n");
        }

        System.out.println("+----------------------+");
        System.out.println(counter + " row(s) in set.\n");
    }

    //search age of pet in array list
    public void ageSearch(int petAge) {
        int counter = 0;
        System.out.printf("\n+----------------------+\n");
        System.out.printf("%-3s %-10s %4s", "ID", "NAME", "AGE\n");
        System.out.println("+----------------------+");

        if (age.contains(petAge)) {
            for (int i = 0; i < id.size(); i++) {
                if (age.get(i).equals(petAge)) {
                    System.out.printf("%-3s %-10s %4s", id.get(i), name.get(i), age.get(i) + "\n");
                    counter++;
                }
            }
        } else {
            System.out.print("\n");
        }

        System.out.println("+----------------------+");
        System.out.println(counter + " row(s) in set.\n");
    }

}
