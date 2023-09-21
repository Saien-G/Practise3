package cinemark;

//This method was adapted from DigitalOcean
//https://www.digitalocean.com/community/tutorials/inheritance-java-example
//DigitalOcean

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Genre {

    String tone, subgenre, setting;
    int movie_num, movie_Duration;

    public Genre(String tne, String sub, String set, int num, int dur) {
        this.tone = tne;
        this.subgenre = sub;
        this.setting = set;
        this.movie_num = num;
        this.movie_Duration = dur;
    }
}
