package cinemark;

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Comedy extends Genre {

    public String movieName_Comedy;
    public int type_Comedy;

    public Comedy(String tne, String sub, String set, int num, int dur, String Comedy, int type) {
        super(tne, sub, set, num, dur);
        this.movieName_Comedy = Comedy;
        this.type_Comedy = type;
    }

}
