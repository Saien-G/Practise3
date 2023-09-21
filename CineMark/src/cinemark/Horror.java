package cinemark;

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Horror extends Genre {

    public String movieName_Horror;
    public int scare_Factor;

    public Horror(String tne, String sub, String set, int num, int dur, String horror, int factor) {
        super(tne, sub, set, num, dur);
        this.movieName_Horror = horror;
        this.scare_Factor = factor;
    }

}
