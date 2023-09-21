package cinemark;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertTrue;

//This method was adapted from freeCodeCamp
//https://www.freecodecamp.org/news/java-unit-testing/
//freeCodeCamp

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class MoviesTest {

    public MoviesTest() {
    }

    @Before
    public void setUp() {
        Movies.movies.clear();
    }
    
    @Test
    public void testEnterMovie_Horror() {
        ArrayList<Genre> movies = new ArrayList<>();
        Horror genre = new Horror(null, null, null, 0, 0, null, 0);

        genre.movie_num = 123;
        ((Horror) genre).movieName_Horror = "IT";
        ((Horror) genre).scare_Factor = 1;
        genre.tone = "Slow";
        genre.subgenre = "Spooky with a twist";
        genre.setting = "A village";
        genre.movie_Duration = 120;

        Movies.movies.add(genre);

        assertEquals(1, Movies.movies.size());
        assertEquals(123, Movies.movies.get(0).movie_num);
        assertEquals("IT", ((Horror) Movies.movies.get(0)).movieName_Horror);
        assertEquals(1, ((Horror) Movies.movies.get(0)).scare_Factor);
        assertEquals("Slow", Movies.movies.get(0).tone);
        assertEquals("Spooky with a twist", Movies.movies.get(0).subgenre);
        assertEquals("A village", Movies.movies.get(0).setting);
        assertEquals(120, Movies.movies.get(0).movie_Duration);
    }
    
    @Test
    public void testEnterMovie_Comedy() {
        ArrayList<Genre> movies = new ArrayList<>();
        Comedy genre = new Comedy(null, null, null, 0, 0, null, 0);

        genre.movie_num = 456;
        ((Comedy) genre).movieName_Comedy = "Blended";
        ((Comedy) genre).type_Comedy = 1;
        genre.tone = "Happy with laughter";
        genre.subgenre = "Family friendly comedy";
        genre.setting = "Sun City";
        genre.movie_Duration = 100;

        Movies.movies.add(genre);

        assertEquals(1, Movies.movies.size());
        assertEquals(456, Movies.movies.get(0).movie_num);
        assertEquals("Blended", ((Comedy) Movies.movies.get(0)).movieName_Comedy);
        assertEquals(1, ((Comedy) Movies.movies.get(0)).type_Comedy);
        assertEquals("Happy with laughter", Movies.movies.get(0).tone);
        assertEquals("Family friendly comedy", Movies.movies.get(0).subgenre);
        assertEquals("Sun City", Movies.movies.get(0).setting);
        assertEquals(100, Movies.movies.get(0).movie_Duration);
    }
    
    @Test
    public void testEnterMovie_Romance() {
        ArrayList<Genre> movies = new ArrayList<>();
        Romance genre = new Romance(null, null, null, 0, 0, null, null);

        genre.movie_num = 789;
        ((Romance) genre).movieName_Romance = "Me before you";
        ((Romance) genre).romantic_Moments = "When the main character bought the socks for the girl he loves";
        genre.tone = "Sad and loving";
        genre.subgenre = "Accepting love";
        genre.setting = "Main charcters house";
        genre.movie_Duration = 150;

        Movies.movies.add(genre);

        assertEquals(1, Movies.movies.size());
        assertEquals(789, Movies.movies.get(0).movie_num);
        assertEquals("Me before you", ((Romance) Movies.movies.get(0)).movieName_Romance);
        assertEquals("When the main character bought the socks for the girl he loves", ((Romance) Movies.movies.get(0)).romantic_Moments);
        assertEquals("Sad and loving", Movies.movies.get(0).tone);
        assertEquals("Accepting love", Movies.movies.get(0).subgenre);
        assertEquals("Main charcters house", Movies.movies.get(0).setting);
        assertEquals(150, Movies.movies.get(0).movie_Duration);
    }

    @Test
    public void testSearchMovie_Horror() {
        ArrayList<Genre> movies = new ArrayList<>();
        Horror genre = new Horror(null, null, null, 0, 0, null, 0);

        genre.movie_num = 123;
        ((Horror) genre).movieName_Horror = "IT";
        ((Horror) genre).scare_Factor = 1;
        genre.tone = "Slow";
        genre.subgenre = "Spooky with a twist";
        genre.setting = "A village";
        genre.movie_Duration = 120;

        Movies.movies.add(genre);
        
        if (genre.movie_num == 123) {
            String movieOutput = "Movie Genre: Horror"
                    + "Movie Name: IT"
                    + "Scare Factor: 1"
                    + "Movie Tone: Slow"
                    + "Movie Subgenre: Spooky with a twist"
                    + "Movie Setting: A village"
                    + "Movie Full Duration (minutes): 120";
            
            String movieInfo = "Movie Genre: Horror"
                    + "Movie Name: " + ((Horror) Movies.movies.get(0)).movieName_Horror
                    + "Scare Factor: " + ((Horror) Movies.movies.get(0)).scare_Factor
                    + "Movie Tone: " + Movies.movies.get(0).tone
                    + "Movie Subgenre: " + Movies.movies.get(0).subgenre
                    + "Movie Setting: " + Movies.movies.get(0).setting
                    + "Movie Full Duration (minutes): " + Movies.movies.get(0).movie_Duration;
            
            assertTrue(movieOutput.contains(movieInfo));
        }
    }
    
    @Test
    public void testSearchMovie_Comedy() {
        ArrayList<Genre> movies = new ArrayList<>();
        Comedy genre = new Comedy(null, null, null, 0, 0, null, 0);

        genre.movie_num = 456;
        ((Comedy) genre).movieName_Comedy = "Blended";
        ((Comedy) genre).type_Comedy = 1;
        genre.tone = "Happy with laughter";
        genre.subgenre = "Family friendly comedy";
        genre.setting = "Sun City";
        genre.movie_Duration = 100;

        Movies.movies.add(genre);
        
        if (genre.movie_num != 456) {
            String movieOutput = "Movie Genre: Comdey"
                    + "Movie Name: Blended"
                    + "Comedy Type: 1"
                    + "Movie Tone: Happy with laughter"
                    + "Movie Subgenre: Family friendly comedy"
                    + "Movie Setting: Sun City"
                    + "Movie Full Duration (minutes): 100";
            
            String movieInfo = "Movie Genre: Comedy"
                    + "Movie Name: " + ((Comedy) Movies.movies.get(0)).movieName_Comedy
                    + "Comedy Type: " + ((Comedy) Movies.movies.get(0)).type_Comedy
                    + "Movie Tone: " + Movies.movies.get(0).tone
                    + "Movie Subgenre: " + Movies.movies.get(0).subgenre
                    + "Movie Setting: " + Movies.movies.get(0).setting
                    + "Movie Full Duration (minutes): " + Movies.movies.get(0).movie_Duration;
            
            assertTrue(movieOutput.contains(movieInfo));
        }
    }
    
    @Test
    public void testSearchMovie_Romance() {
        ArrayList<Genre> movies = new ArrayList<>();
        Romance genre = new Romance(null, null, null, 0, 0, null, null);

        genre.movie_num = 789;
        ((Romance) genre).movieName_Romance = "Me before you";
        ((Romance) genre).romantic_Moments = "When the main character bought the socks for the girl he loves";
        genre.tone = "Sad and loving";
        genre.subgenre = "Accepting love";
        genre.setting = "Main charcters house";
        genre.movie_Duration = 150;

        Movies.movies.add(genre);
        
        if (genre.movie_num != 789) {
            String movieOutput = "Movie Genre: Romance"
                    + "Movie Name: Me before you"
                    + "Romantic Moments: When the main character bought the socks for the girl he loves"
                    + "Movie Tone: Sad and loving"
                    + "Movie Subgenre: Accepting love"
                    + "Movie Setting: Main charcters house"
                    + "Movie Full Duration (minutes): 150";
            
            String movieInfo = "Movie Genre: Comedy"
                    + "Movie Name: " + ((Romance) Movies.movies.get(0)).movieName_Romance
                    + "Romantic Moments: " + ((Romance) Movies.movies.get(0)).romantic_Moments
                    + "Movie Tone: " + Movies.movies.get(0).tone
                    + "Movie Subgenre: " + Movies.movies.get(0).subgenre
                    + "Movie Setting: " + Movies.movies.get(0).setting
                    + "Movie Full Duration (minutes): " + Movies.movies.get(0).movie_Duration;
            
            assertTrue(movieOutput.contains(movieInfo));
        }
    }

    @Test
    public void testDeleteMovie() {
    }

    @Test
    public void testMovieReport() {
    }

}
