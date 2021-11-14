package com.blp.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Address Book System
 */
public class AddressBook {

    private static ArrayList<Contacts> list = new ArrayList<Contacts>();

    /*
     * Call method to add contacts in ArrayList
     * Create object and add details in it and put it in that list
     */

    public void AddContactsDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name = ");
        String firstName = sc.nextLine();
        System.out.println("Last Name = ");
        String lastName = sc.nextLine();
        System.out.println("Address = ");
        String address = sc.nextLine();
        System.out.println("City = ");
        String city = sc.nextLine();
        System.out.println("State = ");
        String state = sc.nextLine();
        System.out.println("Zip Code = ");
        int zip = sc.nextInt();
        System.out.println("Phone Number = ");
        long phoneNumber = sc.nextLong();
        System.out.println("Email = ");
        String email = sc.nextLine();
        Contacts person = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        list.add(person);
        person.display();
        System.out.println(list);
    }

    public static void main(String[] args) {
        AddressBook Contacts1 = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Exit");
        System.out.println("1. Add Contacts");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();
        while (choice >= 1) {
            switch (choice) {
                case 1:
                    Contacts1.AddContactsDetails();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println(" ");
            System.out.println("0. Exit");
            System.out.println("1. Add Contacts");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
        }
        System.out.println("The Program End");
    }
}
