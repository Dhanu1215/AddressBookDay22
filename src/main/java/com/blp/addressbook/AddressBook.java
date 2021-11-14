package com.blp.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Address Book System
 */
public class AddressBook {

    public static ArrayList contacts = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact details");
        AddressBook contact = new AddressBook();

        System.out.println("Enter Firstname");
        String firstName = sc.next();

        System.out.println("Enter Lastname");
        String lastName = sc.next();

        System.out.println("Enter Address");
        String address = sc.next();

        System.out.println("Enter City");
        String city = sc.next();

        System.out.println("Enter State");
        String state = sc.next();

        System.out.println("Enter Zip");
        int zip = sc.nextInt();

        System.out.println("Enter Phone-Number");
        long phoneNumber = sc.nextLong();

        System.out.println("Enter Emails");
        String email = sc.next();
        contact.addContact(firstName, lastName, address, city, state, zip, phoneNumber, email);
    }

    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        contacts.add(firstName);
        contacts.add(lastName);
        contacts.add(address);
        contacts.add(city);
        contacts.add(state);
        contacts.add(zip);
        contacts.add(phoneNumber);
        contacts.add(email);
        System.out.println("Contact details are " + contacts);
    }

}
