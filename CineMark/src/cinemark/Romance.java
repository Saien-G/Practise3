package cinemark;

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Romance extends Genre {

    public String movieName_Romance, romantic_Moments;

    public Romance(String tne, String sub, String set, int num, int dur, String Romance, String Moments) {
        super(tne, sub, set, num, dur);
        this.movieName_Romance = Romance;
        this.romantic_Moments = Moments;
    }

}
