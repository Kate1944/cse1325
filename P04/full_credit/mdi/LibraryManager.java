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
        //adds 3 Publications to the Library
        //asks user to check out a book
        //prints Library to console twice
        try {
            Library library = new Library("UTA Library");
            library.addPublication(new Publication("The Bell Jar", "Sylvia Plath", 1963));
            library.addPublication(new Publication("Lord of the Flies", "William Golding", 1954));
            library.addPublication(new Publication("1984", "George Orwell", 1949));

            library.addPublication(new Video("Spirited Away", "Hayao Miyazaki", 2001, 125));
            library.addPublication(new Video("The Silence of the Lambs", "Thomas Harris",1991, 118));
            library.addPublication(new Video("Bill and Ted's Excellent Adventure", "Chris Matheson and Ed Solomon", 1989, 90));
        
            System.out.println(library);
            int selection = Integer.parseInt(System.console().readLine("\nWhich publication would you like to check out? 0,1,2,3,4, or 5? "));
            String patron = System.console().readLine("\nWhat's your name? ");
            library.checkOut(selection, patron);
            System.out.println(library);
        } catch(Exception e){
            System.err.println("Unable to check out publication\n" + e);
        }
        
    }
}