package com.blp.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Address Book System
 */
public class AddressBook {

    private static ArrayList<Contacts> list = new ArrayList<Contacts>();

    /**
     * Call method to delete contact by searching firstname in contact list
     */
    private void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname to Delete Contact: ");
        String name = sc.nextLine();
        for (Contacts search : list) {
            if (name.equalsIgnoreCase(search.getFirstName())) {
                System.out.println("Entered name found in the Address Book, deleting contact");
                list.remove(search);
            } else {
                System.out.println("Entered name not found in the Address Book");
            }
        }
    }

    /**
     * Call method to edit the contact by searching firstname
     */
    private void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname to edit contact: ");
        String name = sc.nextLine();
        for (Contacts search : list) {
            if (name.equalsIgnoreCase(search.getFirstName())) {
                System.out.println("Entered name found in the Contacts");
                System.out.println("Enter the updated first name");
                String firstName = sc.next();
                search.setFirstName(firstName);
                System.out.println("Enter the updated last name");
                String lastName = sc.next();
                search.setLastName(lastName);
                System.out.println("Enter the updated address");
                String address = sc.next();
                search.setAddress(address);
                System.out.println("Enter the updated city");
                String city = sc.next();
                search.setCity(city);
                System.out.println("Enter the updated state");
                String state = sc.next();
                search.setState(state);
                System.out.println("Enter the updated zipcode");
                int zip = sc.nextInt();
                search.setZip(zip);
                System.out.println("Enter the updated phoneNumber");
                long phoneNumber = sc.nextInt();
                search.setPhoneNumber(phoneNumber);
                System.out.println("Enter the updated emailID");
                String email = sc.next();
                search.setEmail(email);
                search.display();
            } else {
                System.out.println("Entered name not found in the AddressBook");
            }
        }
    }
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
    }

    public static void main(String[] args) {
        AddressBook Contacts1 = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Exit");
        System.out.println("1. Add Contacts");
        System.out.println("2. Show Contacts");
        System.out.println("3. Edit Contacts");
        System.out.println("4. Delete Contacts");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();
        while (choice >= 1) {
            switch (choice) {
                case 1:
                    Contacts1.AddContactsDetails();
                    break;
                case 2:
                    for (Contacts show : list) {
                        System.out.println(" ");
                        System.out.println("First Name = " + show.getFirstName());
                        System.out.println("Last Name = " + show.getLastName());
                        System.out.println("Address = " + show.getAddress());
                        System.out.println("City Name = " + show.getCity());
                        System.out.println("State = " + show.getState());
                        System.out.println("Zip Code = " + show.getZip());
                        System.out.println("Phone Number = " + show.getPhoneNumber());
                        System.out.println("Email = " + show.getEmail());
                    }
                    break;
                case 3:
                    Contacts1.editContact();
                    break;
                case 4:
                    Contacts1.deleteContact();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println(" ");
            System.out.println("0. Exit");
            System.out.println("1. Add Contacts");
            System.out.println("2. Show Contacts");
            System.out.println("3. Edit Contacts");
            System.out.println("4. Delete Contacts");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
        }
        System.out.println("The Program End");
    }

}
