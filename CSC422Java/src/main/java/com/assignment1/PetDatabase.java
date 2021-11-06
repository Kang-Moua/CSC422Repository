//Kang Moua
//CSC 422 Section 100
//Assignment 1

package com.assignment1;

import java.util.Scanner;

public class PetDatabase {

    public static void main(String[] args) throws Exception {
        //scanner for user input
        Scanner input = new java.util.Scanner(System.in);
        //int for user choice
        int userChoice = 0;
        //string of user input for pet name and age
        String petInput = "";
        //string array for temporilary storing pet name and age
        String[] inputArray = new String[1];
        //counter to display number of pets added
        int counter = 0;
        //boolean to end while loop for switch case 2
        boolean end = false;

        //initate pet table class
        PetTable pt = new PetTable();

        //greets user and display choices
        System.out.println("Pet Database Program.\n");
        while (userChoice != 7) {
            System.out.println("What would you like to do?\n"
                    + "1) View all pets\n"
                    + "2) Add more pets\n"
                    + "3) Update an existing pet\n"
                    + "4) Remove an existing pet\n"
                    + "5) Search pets by name\n"
                    + "6) Search pets by age\n"
                    + "7) Exit program\n"
                    + "Your choice:");

            //prompt user to enter choice
            userChoice = input.nextInt();
            input.nextLine();
            System.out.println("");

            //switch statement for user choice
            switch (userChoice) {
                case 1: //display pet table
                    pt.table();
                    break;
                case 2: //prompt user to add pet name and age
                    while (end == false) {
                        System.out.println("add pet (name, age): ");
                        petInput = input.nextLine();
                        if (petInput == "done") {
                            end = true;
                            break;
                        } else {
                            for (int i = 0; i < 1; i++) {
                                inputArray = petInput.split(" ");
                            }
                            try {
                                pt.addPetAge(Integer.parseInt(inputArray[1]));
                                pt.addPetName(inputArray[0]);
                                pt.addPetId();
                            } catch (ArrayIndexOutOfBoundsException e) {
                                break;
                            }
                            counter++;
                        }
                    }
                    System.out.println(counter + " pets added.\n");
                    counter = 0;
                    break;
                case 7: //ends program
                    System.out.println("Goodbye!");
                    break;
                default: //prompts user to re-enter choice
                    System.out.println("Please re-enter your choice.\n");
                    break;
            }
        }
    }
}
