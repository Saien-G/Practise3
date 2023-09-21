package cinemark;

import java.util.Scanner;

//This method was adapted from Java Guides
//https://www.javaguides.net/2020/03/java-scanner-tutorial-reading-login-and-registration-user-input.html
//Java Guides

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Menu {

    public static void mainMenu1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO CINEMARK");
        System.out.println("****************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");

        String input_continue = scan.nextLine();

        if (input_continue.equalsIgnoreCase("1")) {
            System.out.println("\nITS A BOOKMARK FOR YOUR MOVIES");
            mainMenu2();
        } else {
            System.exit(0);
        }
    }

    public static void mainMenu2() {
        Scanner scan = new Scanner(System.in);

        String menu = "\nPlease select one of the following menu items:";
        menu += "\n(1) Enter a movie.";
        menu += "\n(2) Search for a movie genre.";
        menu += "\n(3) Delete a movie.";
        menu += "\n(4) Print movie report.";
        menu += "\n(5) Exit application.";

        System.out.println(menu);

        System.out.println("\nWhich menu do you select:");
        String input_select = scan.nextLine();
        System.out.println();

        if (input_select.equalsIgnoreCase("1")) {
            mainMenu3();

        } else if (input_select.equalsIgnoreCase("2")) {
            Movies.SearchMovie();

        } else if (input_select.equalsIgnoreCase("3")) {
            Movies.DeleteMovie();

        } else if (input_select.equalsIgnoreCase("4")) {
            Movies.MovieReport();

        } else if (input_select.equalsIgnoreCase("5")) {
            System.out.println("Thank you for using my App!!");
            System.exit(0);

        } else {
            System.out.println("Invalid menu option selected.\n");
            mainMenu2();
        }
    }

    public static void mainMenu3() {
        Scanner scan = new Scanner(System.in);

        String genre = "Please select one of the following genres:";
        genre += "\n(1) Horror.";
        genre += "\n(2) Comedy.";
        genre += "\n(3) Romance.";

        System.out.println(genre);

        System.out.println("\nWhich menu do you select:");
        int input_select = scan.nextInt();
        System.out.println();

        switch (input_select) {
            case 1:
                Horror horrorGenre = new Horror(null, null, null, 0, 0, null, 0);
                Movies.EnterMovie(horrorGenre);
                break;
            case 2:
                Comedy comedyGenre = new Comedy(null, null, null, 0, 0, null,  0);
                Movies.EnterMovie(comedyGenre);
                break;
            case 3:
                Romance romanceGenre = new Romance(null, null, null, 0, 0, null, null);
                Movies.EnterMovie(romanceGenre);
                break;
            default:
                System.out.println("Invalid menu option selected.\n");
                mainMenu3();
        }
        
        mainMenu2();

    }

}
