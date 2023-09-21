package cinemark;

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

public class Movies {

    static ArrayList<Genre> movies = new ArrayList<>();

    public static void EnterMovie(Genre genre) {
        Scanner scan = new Scanner(System.in);

        if (genre instanceof Horror) {
            System.out.print("Please enter movie number: ");
            genre.movie_num = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter the Horror movie name: ");
            ((Horror) genre).movieName_Horror = scan.nextLine();

            String scare = "What was the scare factor: ";
            scare += "\n1 - low";
            scare += "\n2 - medium";
            scare += "\n3 - high";

            System.out.print(scare);
            System.out.print("\nEnter here: ");
            ((Horror) genre).scare_Factor = scan.nextInt();
            scan.nextLine();

            while (((Horror) genre).scare_Factor > 3) {
                System.out.println("\nInvalid input");
                scare = "What was the scare factor: ";
                scare += "\n1 - low";
                scare += "\n2 - medium";
                scare += "\n3 - high";

                System.out.print(scare);
                System.out.print("\nEnter here: ");
                ((Horror) genre).scare_Factor = scan.nextInt();
                scan.nextLine();
            }

        } else if (genre instanceof Comedy) {
            System.out.print("Please enter movie number: ");
            genre.movie_num = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter the Comedy movie name: ");
            ((Comedy) genre).movieName_Comedy = scan.nextLine();

            String comedy = "What was the comedy type: ";
            comedy += "\n1 - slapstick";
            comedy += "\n2 - satire";
            comedy += "\n3 - romantic comedy";

            System.out.print(comedy);
            System.out.print("\nEnter here: ");
            ((Comedy) genre).type_Comedy = scan.nextInt();
            scan.nextLine();

            while (((Comedy) genre).type_Comedy > 3) {
                System.out.println("\nInvalid input");
                comedy = "What was the comedy type: ";
                comedy += "\n1 - slapstick";
                comedy += "\n2 - satire";
                comedy += "\n3 - romantic comedy";

                System.out.print(comedy);
                System.out.print("\nEnter here: ");
                ((Comedy) genre).type_Comedy = scan.nextInt();
                scan.nextLine();
            }

        } else if (genre instanceof Romance) {
            System.out.print("Please enter movie number: ");
            genre.movie_num = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter the Romance movie name: ");
            ((Romance) genre).movieName_Romance = scan.nextLine();

            System.out.print("What were the romantic moments for you: ");
            ((Romance) genre).romantic_Moments = scan.nextLine();
        }

        System.out.print("Enter the Tone of the movie: ");
        genre.tone = scan.nextLine();

        System.out.print("Enter the Subgenre of the movie: ");
        genre.subgenre = scan.nextLine();

        System.out.print("Enter the Setting of the movie: ");
        genre.setting = scan.nextLine();

        System.out.print("Enter the Full Duration (minutes) of the movie: ");
        genre.movie_Duration = scan.nextInt();
        scan.nextLine();

        Movies.movies.add(genre);

        System.out.println("Movie Marked!!");

    }

    public static void SearchMovie() {
        Scanner scan = new Scanner(System.in);

        if (movies != null) {
            System.out.print("Enter the movie number to search: ");
            int searchMovie = scan.nextInt();

            int index = -1;
            for (int i = 0; i < movies.size(); i++) {
                if (searchMovie == (movies.get(i).movie_num)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                Genre genre = movies.get(index);
                System.out.println("----------------------------------------------");
                System.out.println("Movie Genre: " + genre.getClass().getSimpleName());
                System.out.println("Movie Name: " + getMovieName(genre));
                if (genre instanceof Horror) {
                    System.out.println("Scare Factor: " + ((Horror) genre).scare_Factor);
                } else if (genre instanceof Comedy) {
                    System.out.println("Comedy Type: " + ((Comedy) genre).type_Comedy);
                } else if (genre instanceof Romance) {
                    System.out.println("Romantic Moments: " + ((Romance) genre).romantic_Moments);
                }

                System.out.println("Movie Tone: " + genre.tone);
                System.out.println("Movie Subgenre: " + genre.subgenre);
                System.out.println("Movie Setting: " + genre.setting);
                System.out.println("Movie Full Duration (minutes): " + genre.movie_Duration);
                System.out.println("----------------------------------------------");
                Menu.mainMenu2();
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("Movie Number: " + searchMovie + " was not found!");
                System.out.println("----------------------------------------------");
                Menu.mainMenu2();
            }

        } else {
            System.out.println("No movies added\n");
            Menu.mainMenu2();
        }
    }

    private static String getMovieName(Genre genre) {
        if (genre instanceof Horror) {
            return ((Horror) genre).movieName_Horror;
        } else if (genre instanceof Comedy) {
            return ((Comedy) genre).movieName_Comedy;
        } else if (genre instanceof Romance) {
            return ((Romance) genre).movieName_Romance;
        } else {
            return "";
        }
    }

    public static void DeleteMovie() {
        Scanner scan = new Scanner(System.in);

        if (movies != null) {
            System.out.print("Enter the movie number to delete: ");
            int deleteMovie = scan.nextInt();

            int index = -1;
            for (int i = 0; i < movies.size(); i++) {
                if (deleteMovie == (movies.get(i).movie_num)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                movies.remove(index);
                System.out.println("----------------------------------------------");
                System.out.println("Movie Number: " + deleteMovie + " was deleted");
                System.out.println("----------------------------------------------");
                Menu.mainMenu2();
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("Movie Number: " + deleteMovie + " was not found");
                System.out.println("----------------------------------------------");
                Menu.mainMenu2();
            }
        } else {
            System.out.println("No movies added");
            Menu.mainMenu2();
        }
    }

    public static void MovieReport() {
        int mvCount = 1;
        for (Genre genre : Movies.movies) {
            if (genre instanceof Horror) {
                System.out.println("MOVIE " + mvCount++);
                System.out.println("----------------------------------------------");
                System.out.println("Movie Genre: Horror");
                System.out.println("Movie Name: " + ((Horror) genre).movieName_Horror);
                System.out.println("Scare Factor: " + ((Horror) genre).scare_Factor);
            } else if (genre instanceof Comedy) {
                System.out.println("MOVIE " + mvCount++);
                System.out.println("----------------------------------------------");
                System.out.println("Movie Genre: Comedy");
                System.out.println("Movie Name: " + ((Comedy) genre).movieName_Comedy);
                System.out.println("Comedy Type: " + ((Comedy) genre).type_Comedy);
            } else if (genre instanceof Romance) {
                System.out.println("MOVIE " + mvCount++);
                System.out.println("----------------------------------------------");
                System.out.println("Movie Genre: Romance");
                System.out.println("Movie Name: " + ((Romance) genre).movieName_Romance);
                System.out.println("Romantic Moments: " + ((Romance) genre).romantic_Moments);
            }

            System.out.println("Movie Tone: " + genre.tone);
            System.out.println("Movie Subgenre: " + genre.subgenre);
            System.out.println("Movie Setting: " + genre.setting);
            System.out.println("Movie Full Duration (minutes): " + genre.movie_Duration);
            System.out.println("----------------------------------------------");

        }

        Menu.mainMenu2();

    }
}
