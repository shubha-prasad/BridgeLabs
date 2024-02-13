import first.Contacts;


import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    ArrayList<Contacts> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            int choice = s.nextInt();

            switch (choice) {
                case 1: {
                    addContact();
                    break;
                }
                case 2:{
                    editContacts();
                    break;}
                case 3:
                {deleteContact();
                    break;}
                case 4:
                {System.out.println("Exiting program. Goodbye!");
                    System.exit(0);}
                default:
                {System.out.println("Invalid choice. Please try again.");}


                    Demo d = new Demo();
                    d.addDetails();
                    d.EditContacts("shubha","tr");
                    d.DeleteContacts("shubha","prasad");
            }
        }
    }

    private static int getIntInput() {
        return 0;
    }

    private static void deleteContact() {
    }

    private static void editContacts() {
    }

    private static void addContact() {
        System.out.println("Add contacts");
    }



    public void addDetails() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstname = s.next();
        System.out.println("Enter Last Name");
        String lastname = s.next();
        System.out.println("Enter Address");
        String address = s.next();
        System.out.println("Enter City");
        String city = s.next();
        System.out.println("Enter State");
        String state = s.next();
        System.out.println("Enter Zip");
        int zip = s.nextInt();
        System.out.println("Enter PhoneNumber");
        long phonenumber = s.nextLong();
        System.out.println("EmailId");
        String emailid = s.next();

        contacts.setFirstName(firstname);
        contacts.setLastName(lastname);
        contacts.setCity(city);
        contacts.setAddress(address);
        contacts.setState(state);

        list.add(contacts);
        System.out.println("FirstName :" + firstname + "LastName :" + lastname + "Address :" + address + "City :" + city + "State :" + state + "Zip : " + zip + "PhoneNumber :" + phonenumber + "EmailId :" + emailid);

    }

    Contacts contacts = new Contacts();


    public void EditContacts(String FirstName, String name1) {
        for (Contacts c : list) {
            if (FirstName.equals(c.getFirstName())) {
                c.setFirstName(name1);
                c.display();
            }
        }
    }

    public void DeleteContacts(String FirstName, String prasad) {
        for (int i = 0; i < list.size(); i++) {
            Contacts c = list.get(i);

            if (FirstName.equals(c.getFirstName())) {
                list.remove(i);
                System.out.println(list);
            }
        }
    }
}


