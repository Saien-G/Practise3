package main;

import java.util.ArrayList;
import java.util.Scanner;

//This method was adapted from Software Testing Help
//https://www.softwaretestinghelp.com/add-elements-to-array-java/
//Software Testing Help

//This method was adapted from YouTube
//https://www.youtube.com/watch?v=ih0wQ1nBkTA
//Math and Science
//https://www.youtube.com/@MathAndScience/about

//This method was adapted from Geek for Geeks
//https://www.geeksforgeeks.org/how-to-check-whether-element-exists-in-java-arraylist/
//Geek for Geeks

//This method was adapted from Geek for Geeks
//https://www.geeksforgeeks.org/arraylist-get-method-java-examples/
//Geek for Geeks

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Student {

    String id, name, email, course;
    int age;
    
    public static void SaveStudent() {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("CAPTURE A NEW STUDENT\n");
        System.out.print("**************************\n");
        System.out.print("Enter the student ID: ");
        student.id = scan.nextLine();
        
        System.out.print("Enter the student name: ");
        student.name = scan.nextLine();
        
        System.out.print("Enter the student age: ");
        student.age = scan.nextInt();
        scan.nextLine();

        while (student.age < 16) {
            System.out.print("\nYou have entered an incorrect student age!!");
            System.out.print("\nPlease re-enter the student age: ");
            student.age = scan.nextInt();
            scan.nextLine();
        }

        System.out.print("Enter the student email: ");
        student.email = scan.nextLine();
        
        System.out.print("Enter the student course: ");
        student.course = scan.nextLine();

        Main.students.add(student);

        System.out.println("Student details saved successfully.");

    }

    public static void SearchStudent(ArrayList<Student> students) {
        Scanner scan = new Scanner(System.in);

        if (students != null) {
            System.out.print("Enter the student ID to search: ");
            String searchID = scan.nextLine();

            int index = -1;
            for (int i = 0; i < students.size(); i++) {
                if (searchID.equalsIgnoreCase(students.get(i).id)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                Student student = students.get(index);
                System.out.println("----------------------------------------------");
                System.out.println("Student ID: " + student.id);
                System.out.println("Student Name: " + student.name);
                System.out.println("Student Age: " + student.age);
                System.out.println("Student Email: " + student.email);
                System.out.println("Student Course: " + student.course);
                System.out.println("----------------------------------------------\n");

                System.out.println("Enter (1) to launch menu or any other key to exit");
                int input = scan.nextInt();
                if (input == 1) {
                    Menu.mainMenu2();
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("Student with student ID: " + searchID + " was not found!");
                System.out.println("----------------------------------------------\n");
                System.out.println("Enter (1) to launch menu or any other key to exit");
                int input = scan.nextInt();
                if (input == 1) {
                    Menu.mainMenu2();
                } else {
                    System.exit(0);
                }
            }
        } else {
            System.out.println("No students added\n");
            System.out.println("Enter (1) to launch menu or any other key to exit");
            int input = scan.nextInt();
            if (input == 1) {
                Menu.mainMenu2();
            } else {
                System.exit(0);
            }
        }
    }

    public static void DeleteStudent(ArrayList<Student> students) {
        Scanner scan = new Scanner(System.in);

        if (students != null) {
            System.out.print("Enter the student ID to delete: ");
            String deleteID = scan.nextLine();

            System.out.println("Are you sure you want student " + deleteID + " from the system? Yes (y) to delete");
            String yes = scan.nextLine();

            if (yes.equalsIgnoreCase("Y")) {
                int index = -1;
                for (int i = 0; i < students.size(); i++) {
                    if (deleteID.equalsIgnoreCase(students.get(i).id)) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    students.remove(index);
                    System.out.println("----------------------------------------------");
                    System.out.println("Student with student ID: " + deleteID + " was deleted");
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    int input = scan.nextInt();
                    if (input == 1) {
                        Menu.mainMenu2();
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.out.println("----------------------------------------------");
                    System.out.println("Student with student ID: " + deleteID + " was not found");
                    System.out.println("----------------------------------------------");
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    int input = scan.nextInt();
                    if (input == 1) {
                        Menu.mainMenu2();
                    } else {
                        System.exit(0);
                    }
                }
            } else {
                System.out.println("No students added");
                System.out.println("Enter (1) to launch menu or any other key to exit");
                int input = scan.nextInt();
                if (input == 1) {
                    Menu.mainMenu2();
                } else {
                    System.exit(0);
                }
            }
        } else {
            Menu.mainMenu2();
        }
    }

    public static void StudentReport() {
        int stCount = 1;
        for (Student student : Main.students) {
            System.out.println("STUDENT " + stCount++);
            System.out.println("----------------------------------------------");
            System.out.println("Student ID: " + student.id);
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Name: " + student.age);
            System.out.println("Student Name: " + student.email);
            System.out.println("Student Name: " + student.course);
            System.out.println("----------------------------------------------");
        }

    }

    public static void ExitStudentApplication() {
        System.out.println("Thank you for using my app!!");
        System.exit(0);

    }

}
