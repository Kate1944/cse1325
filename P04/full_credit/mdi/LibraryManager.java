//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/

package mdi;

import java.util.Scanner;

import library.Publication;
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