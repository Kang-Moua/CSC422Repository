package com.assignment1;

import java.util.ArrayList;

public class PetTable {

    //array list for pet id, name, age
    private ArrayList<Integer> id = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<Integer> age = new ArrayList<>();

    //to print previous name and age
    String previousName = new String();
    int previousAge = 0;

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
        String petNameCap = new String();
        System.out.printf("\n+----------------------+\n");
        System.out.printf("%-3s %-10s %4s", "ID", "NAME", "AGE\n");
        System.out.println("+----------------------+");
        
        petNameCap = petName.substring(0, 1).toUpperCase();
        petNameCap = petNameCap+petName.substring(1);

        if (name.contains(petName)) {
            for (int i = 0; i < id.size(); i++) {
                if (name.get(i).equals(petName)) {
                    System.out.printf("%-3s %-10s %4s", id.get(i), name.get(i), age.get(i) + "\n");
                    counter++;
                }
            }
            if (name.contains(petNameCap)) {
            for (int i = 0; i < id.size(); i++) {
                if (name.get(i).equals(petNameCap)) {
                    System.out.printf("%-3s %-10s %4s", id.get(i), name.get(i), age.get(i) + "\n");
                    counter++;
                }
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

    public void updatePet(int petId, String petName, int petAge) {
        previousName = name.get(petId);
        previousAge = age.get(petId);
        name.set(petId, petName);
        age.set(petId, petAge);
        System.out.println(previousName + " " + previousAge + " changed to " + name.get(petId) + " " + age.get(petId) + ".\n");
    }

    public void deletePet(int petId) {
        id.remove(petId);
        name.remove(petId);
        age.remove(petId);
    }
}
