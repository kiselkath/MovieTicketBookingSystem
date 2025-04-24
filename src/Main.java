import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        /// Created cinema YorkCinema
        MovieBookingSystem yorkCinema = new MovieBookingSystem();
        //INPUT (scanner inctance and instruction
        //inside try and catch
        ///Choose movie
        try {
            yorkCinema.bookTicket("A complete Unknown");
        } catch  (MovieNotAvailableException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Runtime Exception Caught: " + e.getMessage());
        }finally{

            System.out.println("Thank you for visiting our Cinema!");
        }

        /// Choose file
        try{
            yorkCinema.loadMovieSchedule("MovieSchedule.txt");
        }catch(FileNotFoundException e){
            System.out.println("Checked Exception Caught: Movie Schedule missing!");
        }finally{
            // scanner.close() in case we are using Scanner object
            // IO stream could be closed if it was used
            System.out.println("Thank you for visiting our Cinema!");
        }

    }
}