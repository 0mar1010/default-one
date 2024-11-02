package Q6;

public class Main {
    public static void main(String[] args) {
        // Creating movie objects
        Movie movie1 = new Movie("Inception", "Warner Bros", "PG13");
        Movie movie2 = new Movie("Interstellar", "Paramount Pictures", "PG13");
        Movie movie3 = new Movie("Dunkirk", "Warner Bros");

        // Testing the isALikeStudio method
        //Movie tester = new Movie("", "");
        System.out.println("Are movie1 and movie2 from the same studio? " + Movie.isALikeStudio(movie1, movie2));
        System.out.println("Are movie1 and movie3 from the same studio? " + Movie.isALikeStudio(movie1, movie3));
    }
}
