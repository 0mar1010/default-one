package Q6;

import java.util.Objects;

public class Movie {
    //attributes
    private String title;
    private String studio;
    private String rating;

    //constructors
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    //getters & setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    //methods
    static double clcPrice(double price) {
        //tax = 2%
        return price * 0.02;
    }

    static boolean isALikeStudio(Movie A, Movie B) {
        return Objects.equals(A.getStudio(), B.getStudio());
    }
}
