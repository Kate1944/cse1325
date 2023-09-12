import java.util.Scanner;
public class LibraryManager {
    public static void main (String[] args) {
        //adds 3 Publications to the Library
        //asks user to check out a book
        //prints Library to console twice

        Library library = new Library("UTA Library");
        library.addPublication(new Publication("The Bell Jar", "Sylvia Plath", 1963));
        System.out.println(library);
    }
}