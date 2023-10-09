//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/

package mdi;

import library.Publication;
import library.Library;
import library.Video;
import library.Patron;

import java.io.Console;

public class LibraryManager {
    public LibraryManager(Library library) {
        this.library = library;
    }

    public void listPublications() {
        //System.out.println("--------Library inventory--------\n");
        System.out.println();
        System.out.println(library);
    }

    public void addPublication() {
        String title = console.readLine("What's the title? ");
        if (title.isEmpty()) {
            return;
        }
        String author = console.readLine("Who is the author? ");
        if (author.isEmpty()) {
            return;
        }
        int copyright = Integer.parseInt(console.readLine("When is the copyright? (year) "));
        Publication p = null;
        p = new Publication(title, author, copyright);
        library.addPublication(p);
    }

    public void addVideo() {
        String title = console.readLine("What's the video title? ");
        if (title.isEmpty()) {
            return;
        }
        String author = console.readLine("Who is the author? ");
        if (author.isEmpty()) {
            return;
        }
        int copyright = Integer.parseInt(console.readLine("When is the copyright? (year) "));
        String runtime = console.readLine("How long is the runtime? (minutes) ");
        if (runtime.isEmpty()) {
            return;
        }
        Video v = null;
        v = new Video(title, author, copyright, Integer.parseInt(runtime));
        library.addPublication(v);
    }

    public void checkOutPublication() {
        System.out.println(library);
        int index = Integer.parseInt(console.readLine("\nWhich publication would you like to check out?" ));
        int patron = Integer.parseInt(console.readLine(library.patronMenu() + "What's your name? "));
        library.checkOut(index, patron);
    }

    public void checkInPublication() {
        System.out.println(library);
        int index = Integer.parseInt(console.readLine("Selection: "));
        library.checkIn(index);
    }

    public void listPatrons() {
        System.out.println("--------Patrons--------\n");
        System.out.println(library.patronMenu());
    }

    public void addPatron() {
        String name = console.readLine("What is your name? ");
        if(name.isEmpty()) {
            return;
        }
        String email = console.readLine("What is your email? ");
        if(email.isEmpty()) {
            return;
        }
        library.addPatron(new Patron(name, email));

    }

    public void saveLibrary() {
        String filename = "test.lms";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            library.save(bw);
        }
        catch (Exception e) {
            System.err.println("Failed to write: " + e);
            System.exit(-1);
        }
    }

    public void openLibrary() {

    }


    public static void main (String[] args) {
   
        LibraryManager lm = new LibraryManager(new Library(name));
        
        while(true) {
            try {

                /*Library library = new Library("UTA Library");
                library.addPublication(new Publication("The Bell Jar", "Sylvia Plath", 1963));
                library.addPublication(new Publication("Lord of the Flies", "William Golding", 1954));
                library.addPublication(new Publication("1984", "George Orwell", 1949));

                library.addPublication(new Video("Spirited Away", "Hayao Miyazaki", 2001, 125));
                library.addPublication(new Video("The Silence of the Lambs", "Thomas Harris",1991, 118));
                library.addPublication(new Video("Bill and Ted's Excellent Adventure", "Chris Matheson and Ed Solomon", 1989, 90));
        */
                System.out.println("\nWelcome to the UTA LIbrary! What would you like to do?\n\n");
                System.out.println("0 - list all publications and videos");
                System.out.println("1 - list all patrons");
                System.out.println("2 - add a new publication");
                System.out.println("3 - add a new video");
                System.out.println("4 - add a new patron");
                System.out.println("5 - check out a publication or video");
                System.out.println("6 - check in a publication or video");
                System.out.println("7 - save library");
                System.out.println("8 - open library");
                
                int select = Integer.parseInt(console.readLine("\n(press 9 to exit)\nSelection: "));
                if(select == 9) {
                    break;
                }

                if(select == 0) {
                    lm.listPublications();  
                }

                if(select == 1) {
                    lm.listPatrons();  
                }

                if(select == 2) {
                    lm.addPublication();
                }

                if(select == 3) {
                    lm.addVideo();
                }

                if(select == 4) {
                    lm.addPatron();
                }

                if(select == 5) {
                    lm.checkOutPublication();  
                }

                if(select == 6) {
                    lm.checkInPublication();
                }

                if(select == 7) {
                    lm.saveLibrary();
                }

                if(select == 8) {
                    lm.openLibrary();
                }

                }
                catch (Exception e) {
                    System.err.println("Invalid selection " + e);
                }

            }
    
    }
    private static Console console = System.console();
    private static final String name = "The UTA library";
    //private static final String menu = "\n --------Main menu--------\n" + name + "\n\n";
    private Library library;
}