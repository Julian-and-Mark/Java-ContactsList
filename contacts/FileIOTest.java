package contacts;

import java.util.Scanner;

public class FileIOTest {
    public static void main(String[] args) {

    while (true) {
             System.out.println(
                            "1. View contacts.\n" +
                            "2. Add a new contact.\n" +
                            "3. Search a contact by name.\n" +
                            "4. Delete an existing contact.\n" +
                            "5. Exit.\n" +
                            "Enter an option (1, 2, 3, 4 or 5)");

            Scanner input = new Scanner(System.in);

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Methods show = new Methods();
                    show.showAll();
                    break;
                case 2:
                    Methods add = new Methods();
                    add.addContact();
                    break;
                case 3:
                    Methods search = new Methods();
                    search.searchContacts();
                    break;
                case 4:
                    Methods delete = new Methods();
                    delete.deleteContact();
                    break;
                case 5:
                    return;
            }
        }
    }
}