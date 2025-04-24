import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieBookingSystem yorkCinema = new MovieBookingSystem();
        boolean running = true;

        while (running) {

            displayMenu();
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the movie name: ");
                    String movieName = scanner.nextLine();

                    try {
                        yorkCinema.bookTicket(movieName);
                    } catch (MovieNotAvailableException e) {
                        System.out.println("Custom Exception Caught: " + e.getMessage());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Runtime Exception Caught: " + e.getMessage());
                    } finally { System.out.println("Thank you for visiting our Cinema!");
                    }
                }
                case 2 -> {

                    try {
                        yorkCinema.loadMovieSchedule("MovieSchedule.txt");
                    } catch (FileNotFoundException e) {
                        System.out.println("Checked Exception Caught: Movie Schedule missing!");
                    } finally {
                        // scanner.close() in case we are using Scanner object
                        // IO stream could be closed if it was used
                        System.out.println("Thank you for visiting our Cinema!");
                    }
                }
                case 3 -> {
                    System.out.println("Exiting... Goodbye!");
                    running = false;}
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
    public static void displayMenu() {
        System.out.println("\n=== YORK CINEMA ===");
        System.out.println("1. Book a ticket");
        System.out.println("2. See the schedule");
        System.out.println("3. Exit");
        System.out.println();
    }
}