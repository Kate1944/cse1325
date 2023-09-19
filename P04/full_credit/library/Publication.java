//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/

package library;

import java.time.LocalDate;
public class Publication {
    public Publication (String title, String author, int copyright) {
        this.title = title;
        this.author = author;
        this.copyright = copyright;
    }
    //TODO: throw IllegalArgumentException

    public void checkOut(String patron) {
        //String patron = loanedTo;
        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(14);
        LocalDate dueDate = future;
    }

    /*public checkIn() {
       
    } */

    public String toString() {
        /*if(loanedTo.equals(NULL)) {
            return "'" + title + "' by " + author + ", copyright " + copyright;
        }
        else {
            return "'" + title + "' by " + author + ", copyright " 
            + copyright + "...This book is loaned to " + loanedTo + "until: " + dueDate;
        }
        
        */
        return "\n" + "'" + title + "' by " + author + ", copyright " + copyright + "\n";
        
        }

    private String title;
    private String author;
    private int copyright;
    private String loanedTo;
    private LocalDate dueDate;
}