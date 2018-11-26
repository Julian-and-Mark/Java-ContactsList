package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static contacts.FileIO.contactMain;
import static contacts.FileIO.readFileAsString;

public class FileIOTest {
    public static void main(String[] args) {
        Input in = new Input(new Scanner(System.in));

        String diectory = "/Users/markstachowski/Projects/Codeup/IntelliJProjects" +
                "/codeup-java-exercises/src/contacts";
        String filename = "contacts.txt";

        Path contactsPath = Paths.get(diectory, filename);

        try {
            System.out.println(readFileAsString(contactsPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        contactMain();


    }
}
