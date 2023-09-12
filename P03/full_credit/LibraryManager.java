import java.util.Scanner;
public class LibraryManager {
    public static void main (String[] args) {
        //adds 3 Publications to the Library
        //asks user to check out a book
        //prints Library to console twice

        Library library = new Library("UTA Library");
        library.addPublication(new Publication("The Bell Jar", "Sylvia Plath", 1963));
        library.addPublication(new Publication("Lord of the Flies", "William Golding", 1954));
        library.addPublication(new Publication("1984", "George Orwell", 1949));
        //library.checkOut(0, "Bobby");
        
        System.out.println(library);
    }
}