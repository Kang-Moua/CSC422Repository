package com.assignment1;

import java.util.ArrayList;

public class PetTable {

    //arraylist for pet id, name, age
    private ArrayList<Integer> id = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<Integer> age = new ArrayList<>();

    //no-args default constructor
    public PetTable() {
    }

    //creates table and get info from arraylists
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
        System.out.println(id.size() + " rows in set.\n");
    }

    //add pet id to id arraylist
    public void addPetId() {
        if (id.size() == 0) {
            id.add(0);
        } else {
            id.add(id.size());
        }
    }

    //add pet name to name arraylist
    public void addPetName(String petName) {
        name.add(petName);
    }

    //add pet age to age arraylist
    public void addPetAge(int petAge) {
        age.add(petAge);
    }

}
