/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caculator;

/**
 *
 * @author ADMIN
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager(scanner);

        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.normalCalculator();
                    break;
                case 2:
                    manager.BMICalculator();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
