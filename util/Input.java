package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt() {
        int output;
        try {
            output = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Please try again.");
            return getInt();
        }
        return output;
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Number out of range!");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        double output;
        try {
            output = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Please try again.");
            return getDouble();
        }
        return output;
    }

    public double getDouble(int min, int max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Number out of range!");
            return getDouble(min, max);
        }
    }

    public int getBinary() {
        int output;
        try {
            output = Integer.valueOf(getString(), 2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Please try again.");
            return getBinary();
        }
        return output;
    }

    public int getHex() {
        int output;
        try {
            output = Integer.valueOf(getString(), 16);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal number. Please try again.");
            return getHex();
        }
        return output;
    }

}