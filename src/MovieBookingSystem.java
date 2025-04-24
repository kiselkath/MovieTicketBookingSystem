import java.io.File;
import java.io.FileNotFoundException;

public class MovieBookingSystem {
    public String movieName;

    public void bookTicket(String movieName) throws MovieNotAvailableException {
        System.out.println("Welcome to booking page. What movie would you like to watch?");
        ///Throws an IllegalArgumentException if movieName is null or empty.
        if (movieName == null || movieName.isEmpty()){
            throw new IllegalArgumentException("Movie name must be provided!");
        }
        ///Throws a MovieNotAvailableException (custom) if the movie is not on the available list.
        if (!movieName.equalsIgnoreCase("The Penguin Lessons")  &&
            !movieName.equalsIgnoreCase("Conclave" ) &&
            !movieName.equalsIgnoreCase("A Complete Unknown")){

            throw new MovieNotAvailableException("Sorry! We don't have this movie - try another!");

        } else {
            System.out.println(movieName + " starts in 3... 2... 1...");
        }

    }

    public void loadMovieSchedule(String filePath) throws FileNotFoundException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        ///Throws a FileNotFoundException if the schedule file is missing (simulate this)
        System.out.println("Reading file Movie Schedule...");
    }
}
