package TemperatureConverterTool;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        double temperature, result;
        do {
            System.out.println("Temperature Conversion Tool");
            System.out.println("===========================");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Temperature in Fahrenheit: ");
                    temperature = input.nextDouble();
                    result = (temperature - 32) * 5 / 9;
                    System.out.printf("%.1f Fahrenheit = %.1f Celsius\n", temperature, result);
                    System.out.println("------------------------------------------------------");
                    break;
                case 2:
                    System.out.print("Enter Temperature in Celsius: ");
                    temperature = input.nextDouble();
                    result = (temperature * 9 / 5) + 32;
                    System.out.printf("%.1f Celsius = %.1f Fahrenheit\n", temperature, result);
                    System.out.println("------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 3);

        input.close();
    }
}
