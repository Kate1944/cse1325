import java.util.Scanner;
public class LibraryManager {
    public static void main (String[] args) {
        Library a = new Library("The Bell Jar");
        Library b = new Library("Lord of the Flies");
        Library c = new Library("The Lorax");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}