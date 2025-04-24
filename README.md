### Movie Ticket Booking System – Exception Handling Exercise
Create a console-based Java program that simulates booking movie tickets.
Implement exception handling using:
- Checked Exception: Simulate a missing movie database file.
- Unchecked Exception: Handle cases like booking with null/empty movie names.
- Custom Exception: Throw an exception when a user tries to book a ticket for a movie that is not currently showing.

##### Requirements:
1. Create a method bookTicket(String movieName) that:
- Throws an IllegalArgumentException if movieName is null or empty.
- Throws a MovieNotAvailableException (custom) if the movie is not on the available list.
2. Create a method loadMovieSchedule(String filePath) that:
- Throws a FileNotFoundException if the schedule file is missing (simulate this). 

3. Use a try-catch-finally block in main() to:
- Handle all exceptions gracefully.
- Print a thank-you message in the finally block.

> ### Starter Custom Exception Template:
> class MovieNotAvailableException extends Exception {
        public MovieNotAvailableException(String message) {
            super(message); }
}

### Learning Goals:
1. Practice the core exception types: checked, unchecked, custom.
2. Understand how to use try, catch, and finally.
3. Learn how to write expressive, user-friendly exception messages.