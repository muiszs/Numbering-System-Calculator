
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
// 1. NAME : AHMAD MUIZZUDDIN BIN AHMAD RIDZUAN,        MATRIC NO : 221****
public class ICOPROJECT {
    public static void main(String[] args) throws IOException {
        
        
        int opt = 0;

        do {

            Scanner input = new Scanner(System.in);
            try {
                do {
                    System.out.println("\n\t\t\t\t\t\t\t   Numbering System Calculator");
                    System.out.println("\t\t\t\t\t\t\t   --------------------------------");
                    System.out.println("\t\t\t\t\t\t\t=====================================");
                    System.out.println("\t\t\t\t\t\t\t|1.Convert Decimal    |\n\t\t\t\t\t\t\t|2.Convert Binary     |\n\t\t\t\t\t\t\t|3.Convert Octal      |\n\t\t\t\t\t\t\t|4.Convert Hexadecimal|\n\t\t\t\t\t\t\t|5.Quit               |");
                    System.out.println("\t\t\t\t\t\t\t=====================================");
                    System.out.print("Pick an option: ");
                    opt = input.nextInt();
                    System.out.println();
                } while (opt != 1 && opt != 2 && opt != 3 && opt != 4 && opt != 5);

                switch (opt) {

                    case 1:
                        decimal();
                        break;
                    case 2:
                        binary();
                        break;
                    case 3:
                        octal();
                        break;
                    case 4:
                        hexadecimal();
                        break;

                }

            } catch (InputMismatchException ex) {
                System.out.println("Invalid input");
                input.nextLine();
                opt = 0;
            }
        } while (opt == 0 || opt == 1 || opt == 2 || opt == 3 || opt == 4);
        System.out.println("------------------------------------");
        System.out.println("Thank You, please come again!");
        System.out.println("------------------------------------");

    }

    public static void decimal() {
        int opt = 0;
        int decimalNumber;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\t\t\t\t\t\t\t   What do you want to convert into?");
            System.out.println("\t\t\t\t\t\t\t   --------------------------------");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.println("\t\t\t\t\t\t\t|1.Binary|\n\t\t\t\t\t\t\t|2.Octal|\n\t\t\t\t\t\t\t|3.Hexadecimal|");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.print("Pick an option: ");
            opt = input.nextInt();
            System.out.println();
        } while (opt != 1 && opt != 2 && opt != 3);

        switch (opt) {

            case 1:
                // Accept decimal input
                System.out.print("Enter a decimal number: ");
                decimalNumber = input.nextInt();

                // Convert decimal to binary
                String binaryRepresentation = decimalconvertToBinary(decimalNumber);

                // Display the result
                System.out.println("Binary representation: " + binaryRepresentation);
                break;
            case 2:
                // Accept decimal input
                System.out.print("Enter a decimal number: ");
                decimalNumber = input.nextInt();

                // Convert decimal to octal
                String octalRepresentation = decimalconvertToOctal(decimalNumber);

                // Display the result
                System.out.println("Octal representation: " + octalRepresentation);
                break;
            case 3:
                // Accept decimal input
                System.out.print("Enter a decimal number: ");
                decimalNumber = input.nextInt();

                // Convert decimal to hexadecimal
                String hexadecimalRepresentation = decimalconvertToHexadecimal(decimalNumber);

                // Display the result
                System.out.println("Hexadecimal representation: " + hexadecimalRepresentation);
                break;

        }

    }

    public static void binary() {
        int opt = 0;
        String binaryNumber;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\t\t\t\t\t\t\t   What do you want to convert into?");
            System.out.println("\t\t\t\t\t\t\t   --------------------------------");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.println("\t\t\t\t\t\t\t|1.Decimal|\n\t\t\t\t\t\t\t|2.Octal|\n\t\t\t\t\t\t\t|3.Hexadecimal|");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.print("Pick an option: ");
            opt = input.nextInt();
            System.out.println();
        } while (opt != 1 && opt != 2 && opt != 3);

        switch (opt) {

            case 1:
                // Accept binary input
                System.out.print("Enter a binary number: ");
                binaryNumber = input.next();

                // Convert binary to decimal
                int decimalRepresentation = binaryconvertToDecimal(binaryNumber);

                // Display the result
                System.out.println("Decimal representation: " + decimalRepresentation);

                break;
            case 2:
                // Accept binary input
                System.out.print("Enter a binary number: ");
                binaryNumber = input.next();

                // Convert binary to octal
                String octalRepresentation = binaryconvertToOctal(binaryNumber);

                // Display the result
                System.out.println("Octal representation: " + octalRepresentation);

                break;
            case 3:
                // Accept binary input
                System.out.print("Enter a binary number: ");
                binaryNumber = input.next();

                // Convert binary to hexadecimal
                String hexadecimalRepresentation = binaryconvertToHexadecimal(binaryNumber);

                // Display the result
                System.out.println("Hexadecimal representation: " + hexadecimalRepresentation);
                break;

        }

    }

    public static void octal() {
        int opt = 0;
        String octalNumber;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\t\t\t\t\t\t\t   What do you want to convert into?");
            System.out.println("\t\t\t\t\t\t\t   --------------------------------");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.println("\t\t\t\t\t\t\t|1.Decimal|\n\t\t\t\t\t\t\t|2.Binary|\n\t\t\t\t\t\t\t|3.Hexadecimal|");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.print("Pick an option: ");
            opt = input.nextInt();
            System.out.println();
        } while (opt != 1 && opt != 2 && opt != 3);

        switch (opt) {

            case 1:
                // Accept octal input
                System.out.print("Enter an octal number: ");
                octalNumber = input.next();

                // Convert octal to decimal
                int decimalRepresentation = octalconvertToDecimal(octalNumber);

                // Display the result
                System.out.println("Decimal representation: " + decimalRepresentation);

                break;
            case 2:
                // Accept octal input
                System.out.print("Enter an octal number: ");
                octalNumber = input.next();

                // Convert octal to binary
                String binaryRepresentation = octalconvertToBinary(octalNumber);

                // Display the result
                System.out.println("Binary representation: " + binaryRepresentation);

                break;
            case 3:
                // Accept octal input
                System.out.print("Enter an octal number: ");
                octalNumber = input.next();

                // Convert octal to hexadecimal
                String hexadecimalRepresentation = octalconvertToHexadecimal(octalNumber);

                // Display the result
                System.out.println("Hexadecimal representation: " + hexadecimalRepresentation);
                break;

        }

    }

    public static void hexadecimal() {
        int opt = 0;
        String hexadecimalNumber;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\t\t\t\t\t\t\t   What do you want to convert into?");
            System.out.println("\t\t\t\t\t\t\t   --------------------------------");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.println("\t\t\t\t\t\t\t|1.Decimal|\n\t\t\t\t\t\t\t|2.Binary|\n\t\t\t\t\t\t\t|3.Octal|");
            System.out.println("\t\t\t\t\t\t\t=====================================");
            System.out.print("Pick an option: ");
            opt = input.nextInt();
            System.out.println();
        } while (opt != 1 && opt != 2 && opt != 3);

        switch (opt) {

            case 1:
                // Accept hexadecimal input
                System.out.print("Enter a hexadecimal number: ");
                hexadecimalNumber = input.next();

                // Convert hexadecimal to decimal
                int decimalRepresentation = hexaconvertToDecimal(hexadecimalNumber);

                // Display the result
                System.out.println("Decimal representation: " + decimalRepresentation);

                break;
            case 2:
                // Accept hexadecimal input
                System.out.print("Enter a hexadecimal number: ");
                hexadecimalNumber = input.next();

                // Convert hexadecimal to binary
                String binaryRepresentation = hexaconvertToBinary(hexadecimalNumber);

                // Display the result
                System.out.println("Binary representation: " + binaryRepresentation);

                break;
            case 3:
                // Accept hexadecimal input
                System.out.print("Enter a hexadecimal number: ");
                hexadecimalNumber = input.next();

                // Convert hexadecimal to octal
                String octalRepresentation = hexaconvertToOctal(hexadecimalNumber);

                // Display the result
                System.out.println("Octal representation: " + octalRepresentation);

                break;

        }

    }
    // Function to convert hexadecimal to octal

    private static String hexaconvertToOctal(String hexadecimalNumber) {
        // Convert the hexadecimal number to decimal using parseInt
        int decimalValue = Integer.parseInt(hexadecimalNumber, 16);

        // Convert the decimal value to octal using toOctalString
        return Integer.toOctalString(decimalValue);
    }

    private static String hexaconvertToBinary(String hexadecimalNumber) {
        // Convert the hexadecimal number to decimal using parseInt
        int decimalValue = Integer.parseInt(hexadecimalNumber, 16);

        // Convert the decimal value to binary using toBinaryString
        return Integer.toBinaryString(decimalValue);
    }

    // Function to convert hexadecimal to decimal
    private static int hexaconvertToDecimal(String hexadecimalNumber) {
        // Convert the hexadecimal number to decimal using parseInt
        return Integer.parseInt(hexadecimalNumber, 16);
    }
    // Function to convert octal to hexadecimal

    private static String octalconvertToHexadecimal(String octalNumber) {
        // Ensure the octal number length is a multiple of 3 by adding leading zeros
        while (octalNumber.length() % 3 != 0) {
            octalNumber = "0" + octalNumber;
        }

        StringBuilder hexadecimal = new StringBuilder();

        // Iterate through every 3 octal digits and convert them to hexadecimal
        for (int i = 0; i < octalNumber.length(); i += 3) {
            String octalGroup = octalNumber.substring(i, i + 3);
            int decimalValue = convertOctalGroupToDecimal(octalGroup);

            // Convert the decimal value to hexadecimal
            hexadecimal.append(Integer.toHexString(decimalValue).toUpperCase());
        }

        return hexadecimal.toString();
    }

    // Function to convert a 3-digit octal group to decimal
    private static int convertOctalGroupToDecimal(String octalGroup) {
        int decimal = 0;

        // Iterate through each digit of the octal group
        for (int i = 0; i < octalGroup.length(); i++) {
            char octalDigit = octalGroup.charAt(i);
            int octalValue = Character.getNumericValue(octalDigit);

            // Calculate the decimal value using the position of the digit
            int positionValue = (int) Math.pow(8, octalGroup.length() - 1 - i);
            decimal += octalValue * positionValue;
        }

        return decimal;
    }
    // Function to convert octal to binary

    private static String octalconvertToBinary(String octalNumber) {
        StringBuilder binary = new StringBuilder();

        // Iterate through each digit of the octal number
        for (int i = 0; i < octalNumber.length(); i++) {
            // Get the current octal digit
            char octalDigit = octalNumber.charAt(i);

            // Convert the octal digit to a 3-digit binary representation
            String binaryDigit = convertOctalDigitToBinary(octalDigit);

            // Append the binary representation to the result
            binary.append(binaryDigit);
        }

        return binary.toString();
    }

    // Function to convert a single octal digit to 3-digit binary
    private static String convertOctalDigitToBinary(char octalDigit) {
        // Convert the octal digit to its binary representation
        int octalValue = Character.getNumericValue(octalDigit);
        String binaryRepresentation = Integer.toBinaryString(octalValue);

        // Ensure the binary representation is 3 digits by adding leading zeros
        while (binaryRepresentation.length() < 3) {
            binaryRepresentation = "0" + binaryRepresentation;
        }

        return binaryRepresentation;
    }

    private static int octalconvertToDecimal(String octalNumber) {
        int decimal = 0;
        int octalLength = octalNumber.length();

        // Iterate through each digit of the octal number
        for (int i = 0; i < octalLength; i++) {
            // Get the current octal digit
            char octalDigit = octalNumber.charAt(i);

            // Convert the octal digit to an integer
            int octalValue = Character.getNumericValue(octalDigit);

            // Calculate the decimal value using the position of the digit
            int positionValue = (int) Math.pow(8, octalLength - 1 - i);
            decimal += octalValue * positionValue;
        }

        return decimal;
    }

    // Function to convert binary to hexadecimal
    private static String binaryconvertToHexadecimal(String binaryNumber) {
        // Ensure the binary number length is a multiple of 4 by adding leading zeros
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        StringBuilder hexadecimal = new StringBuilder();

        // Iterate through every 4 binary digits and convert them to hexadecimal
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String binaryGroup = binaryNumber.substring(i, i + 4);
            int decimalValue = convertBinaryGroupToDecimal2(binaryGroup);

            // Convert the decimal value to hexadecimal
            hexadecimal.append(Integer.toHexString(decimalValue).toUpperCase());
        }

        return hexadecimal.toString();
    }

    // Function to convert a 4-digit binary group to decimal
    private static int convertBinaryGroupToDecimal2(String binaryGroup) {
        int decimal = 0;

        // Iterate through each digit of the binary group
        for (int i = 0; i < binaryGroup.length(); i++) {
            char binaryDigit = binaryGroup.charAt(i);
            int binaryValue = Character.getNumericValue(binaryDigit);

            // Calculate the decimal value using the position of the digit
            int positionValue = (int) Math.pow(2, binaryGroup.length() - 1 - i);
            decimal += binaryValue * positionValue;
        }

        return decimal;
    }

    private static String binaryconvertToOctal(String binaryNumber) {
        // Ensure the binary number length is a multiple of 3 by adding leading zeros
        while (binaryNumber.length() % 3 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        StringBuilder octal = new StringBuilder();

        // Iterate through every 3 binary digits and convert them to octal
        for (int i = 0; i < binaryNumber.length(); i += 3) {
            String binaryGroup = binaryNumber.substring(i, i + 3);
            int decimalValue = convertBinaryGroupToDecimal(binaryGroup);

            // Convert the decimal value to octal
            octal.append(Integer.toOctalString(decimalValue));
        }

        return octal.toString();
    }

    // Function to convert a 3-digit binary group to decimal
    private static int convertBinaryGroupToDecimal(String binaryGroup) {
        int decimal = 0;

        // Iterate through each digit of the binary group
        for (int i = 0; i < binaryGroup.length(); i++) {
            char binaryDigit = binaryGroup.charAt(i);
            int binaryValue = Character.getNumericValue(binaryDigit);

            // Calculate the decimal value using the position of the digit
            int positionValue = (int) Math.pow(2, binaryGroup.length() - 1 - i);
            decimal += binaryValue * positionValue;
        }

        return decimal;
    }

    // Function to convert binary to decimal
    private static int binaryconvertToDecimal(String binaryNumber) {
        int decimal = 0;
        int binaryLength = binaryNumber.length();

        // Iterate through each digit of the binary number
        for (int i = 0; i < binaryLength; i++) {
            // Get the current binary digit
            char binaryDigit = binaryNumber.charAt(i);

            // Convert the binary digit to an integer
            int binaryValue = Character.getNumericValue(binaryDigit);

            // Calculate the decimal value using the position of the digit
            int positionValue = (int) Math.pow(2, binaryLength - 1 - i);
            decimal += binaryValue * positionValue;
        }

        return decimal;
    }

    // Function to convert decimal to binary
    private static String decimalconvertToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            // Append the remainder to the binary string
            binary.insert(0, decimalNumber % 2);
            // Divide the decimal number by 2
            decimalNumber /= 2;
        }

        // If the input decimal is 0, the loop won't run, so append "0" manually
        if (binary.length() == 0) {
            binary.append(0);
        }

        return binary.toString();
    }

    // Function to convert decimal to octal
    private static String decimalconvertToOctal(int decimalNumber) {
        StringBuilder octal = new StringBuilder();

        while (decimalNumber > 0) {
            // Append the remainder to the octal string
            octal.insert(0, decimalNumber % 8);
            // Divide the decimal number by 8
            decimalNumber /= 8;
        }

        // If the input decimal is 0, the loop won't run, so append "0" manually
        if (octal.length() == 0) {
            octal.append(0);
        }

        return octal.toString();
    }
    // Function to convert decimal to hexadecimal

    private static String decimalconvertToHexadecimal(int decimalNumber) {
        StringBuilder hexadecimal = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;

            // Convert remainder to hexadecimal digit
            char hexDigit = (char) ((remainder < 10) ? (remainder + '0') : (remainder - 10 + 'A'));

            // Append the hexadecimal digit to the string
            hexadecimal.insert(0, hexDigit);

            // Divide the decimal number by 16
            decimalNumber /= 16;
        }

        // If the input decimal is 0, the loop won't run, so append "0" manually
        if (hexadecimal.length() == 0) {
            hexadecimal.append(0);
        }

        return hexadecimal.toString();
    }

}

