package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIO {

    public static String readFileAsString(Path path) throws IOException {
        return new String(Files.readAllBytes(path));
    }

    public static void contactMain() {
        Input in = new Input(new Scanner(System.in));

        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");

    }

}
