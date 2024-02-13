package array;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addContact() {
        System.out.println("Enter contact details:");

        String firstName = getStringInput("First Name: ");
        String lastName = getStringInput("Last Name: ");
        String address = getStringInput("Address: ");
        String city = getStringInput("City: ");
        String state = getStringInput("State: ");
        String zip = getStringInput("ZIP Code: ");
        String phoneNumber = getStringInput("Phone Number: ");
        String email = getStringInput("Email: ");

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(contact);

        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");

            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static void searchContact() {
        String searchName = getStringInput("Enter the name to search: ");
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.getFullName().equalsIgnoreCase(searchName)) {
                System.out.println("Contact found:\n" + contact);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
            System.out.print(prompt);
        }

        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}

class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nAddress: %s, %s, %s, %s\nPhone: %s\nEmail: %s\n",
                firstName, lastName, address, city, state, zip, phoneNumber, email);
    }
}
