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

public class LibraryManager {
    public static void main (String[] args) {
        /*TODO: We want to give these options:
        1) List all publications and videos in the library
        2) Add a new publication
        3) Add a new video
        4) Check out a publication or video
        5) Check in a publication or video

        After 1: System.out.println(library);
        go back to Menu
        After 2:Ask for title, author, and copyright
        return to Menu
        Afer 3: Ask for title, author, copyright, and runtime
        return to Menu
        After 4:int selection = Integer.parseInt(System.console().readLine("\nWhich publication would you like to check out? 0,1,2,3,4, or 5? "));
        String patron = System.console().readLine("\nWhat's your name? ");
        library.checkOut(selection, patron);
        return to Menu
        After 5: 
        return to Menu 
        */
        while(true) {
            try {

                Library library = new Library("\nUTA Library");

                System.out.println("Welcome to the UTA LIbrary! What would you like to do?\n\n\n");
                System.out.println("0 - list all publications and videos");
                System.out.println("1 - add a new publication");
                System.out.println("2 - add a new video");
                System.out.println("3 - check out a publication or video");
                System.out.println("4 - check in a publication or video");
                
                int select = Integer.parseInt(System.console().readLine("\n(press 9 to exit)\nSelection: "));
                if(select == 9) {
                    break;
                }
                if(select == 0) {

                    //Video video = new Video(needs parameters)
                    //attempting to use library instead (line 59)
                    

                    library.addPublication(new Publication("The Bell Jar", "Sylvia Plath", 1963));
                    library.addPublication(new Publication("Lord of the Flies", "William Golding", 1954));
                    library.addPublication(new Publication("1984", "George Orwell", 1949));

                    library.addPublication(new Video("Spirited Away", "Hayao Miyazaki", 2001, 125));
                    library.addPublication(new Video("The Silence of the Lambs", "Thomas Harris",1991, 118));
                    library.addPublication(new Video("Bill and Ted's Excellent Adventure", "Chris Matheson and Ed Solomon", 1989, 90));
                    System.out.println(library);
                }
                if(select == 3) {

                    System.out.println(library);
                    int selection = Integer.parseInt(System.console().readLine("\nWhich publication would you like to check out? 0,1,2,3,4, or 5? "));
                    String patron = System.console().readLine("\nWhat's your name? ");
                    library.checkOut(selection, patron);

                    System.out.println(library);
                    
                }
                if(select == 4) {
                    System.out.println(library);
                    int selection = Integer.parseInt(System.console().readLine("\nWhat would you like to return?"));
                    library.checkIn(selection);
                }

                }
                catch (Exception e) {
                    System.err.println("Invalid selection " + e);
                }

            }
    
    }
}
