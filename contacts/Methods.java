package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Methods {

    public static void showAll() {
        try {
            System.out.println("Name | Phone number");
            System.out.println("-------------------");
            List<String> contacts = Files.readAllLines(Paths.get("contacts/contacts.txt"));

            for (String line : contacts) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }
    }

    public static void addContact() {
        Scanner scan = new Scanner(System.in);
        Path p = Paths.get("contacts/contacts.txt");

        String nameAdd;
        String numberAdd;

        System.out.println("Enter the name: ");
        nameAdd = scan.nextLine();
        System.out.println("Enter the number: ");
        numberAdd = scan.nextLine();

        List<String> contacts = new ArrayList<>();
        contacts.add(nameAdd + " | " + numberAdd);

        try {
            Files.write(p, contacts, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchContacts() {
        Scanner scan1 = new Scanner(System.in);
        String input2;
        System.out.println("Enter the contact you are looking for: ");
        input2 = scan1.nextLine();
        try {
            List<String> lines = Files.readAllLines(Paths.get("contacts/contacts.txt"));
            for (String line : lines) {
                if (line.contains(input2)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }

    public static void deleteContact() {
        Path p = Paths.get("contacts", "contacts.txt");

        Scanner scan = new Scanner(System.in);
        System.out.println("Which contact would you like to delete?");
        String contactToDelete = scan.nextLine();
        try {
            List<String> now = new ArrayList<>();
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {
                if (!line.contains(contactToDelete)) {
                    now.add(line);
                }
            }
            Files.write(p, now, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
