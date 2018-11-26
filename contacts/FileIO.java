package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {

    public static String readFileAsString(Path path) throws IOException {
        return new String(Files.readAllBytes(path));
    }

    public static void contactMain() {

        String diectory = "/Users/markstachowski/Projects/Codeup/IntelliJProjects" +
                "/codeup-java-exercises/src/contacts";
        String filename = "contacts.txt";
        Path contactsPath = Paths.get(diectory, filename);

        Input in = new Input(new Scanner(System.in));

    do {
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");

        int choice = in.getInt(1, 5);
        System.out.println(choice);

        switch (choice) {
            case 0:
                break;
            case 1:
                try {
                    System.out.println(readFileAsString(contactsPath));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("entered 2");
                break;
            case 3:
                System.out.println("entered 3");
                break;
            case 4:
                System.out.println("entered 4");
                break;
            case 5:
                System.out.println("entered 5 to exit");
                return;
        }

    } while (true);

    }

}
