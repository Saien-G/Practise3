package main;

import java.util.Scanner;

//This method was adapted from Java Guides
//https://www.javaguides.net/2020/03/java-scanner-tutorial-reading-login-and-registration-user-input.html
//Java Guides

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Menu {

    public static void mainMenu1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("****************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");

        String input_continue = scan.nextLine();

        if (input_continue.equalsIgnoreCase("1")) {
            Menu.mainMenu2();
        } else {
            System.exit(0);
        }
    }

    public static void mainMenu2() {
        Scanner scan = new Scanner(System.in);

        String menu = "\nPlease select one of the following menu items:";
        menu += "\n(1) Capture a new student.";
        menu += "\n(2) Search for a student.";
        menu += "\n(3) Delete a student.";
        menu += "\n(4) Print student report.";
        menu += "\n(5) Exit application.";

        System.out.println(menu);

        System.out.println("\nWhich menu do you select:");
        String input_select = scan.nextLine();
        System.out.println();

        if (input_select.equalsIgnoreCase("1")) {
            Student.SaveStudent();
            Menu.mainMenu2();

        } else if (input_select.equalsIgnoreCase("2")) {
            Student.SearchStudent(Main.students);
            
        } else if (input_select.equalsIgnoreCase("3")) {
            Student.DeleteStudent(Main.students);
            
        } else if (input_select.equalsIgnoreCase("4")) {
            Student.StudentReport();
            Menu.mainMenu2();

        } else if (input_select.equalsIgnoreCase("5")) {
            Student.ExitStudentApplication();
            
        } else {
            System.out.println("Invalid menu option selected.\n");
            Menu.mainMenu2();
        }

    }
}

