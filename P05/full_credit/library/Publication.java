//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/

package library;
import java.time.LocalDate;

public class Publication {
    public static final int LOAN = 14; //days until publication is due
    public Publication (String title, String author, int copyright) {
        this.title = title;
        this.author = author;
        this.copyright = copyright;
        if(copyright < 1900 || copyright > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Invalid copyright year: " + copyright);
        }
    }

    public void checkOut(String patron) {
        loanedTo = patron;
        dueDate = LocalDate.now().plusDays(LOAN);
    }

    public void checkIn() {
       loanedTo = null;
       System.out.println("Thank you for returning: \"" + title + "\" by " + author + ", copyright " + copyright);
    } 

    @Override
    public String toString() {
        if(loanedTo != null) {
            return "BOOK: \"" + title + "\" by " + author + ", copyright " + copyright + 
            "\n  ...This book is loaned to " + loanedTo + " until: " + dueDate;
        }
        else {
            return "BOOK: \"" + title + "\" by " + author + ", copyright " + copyright;
        }
        
        
        //return "\n" + "'" + title + "' by " + author + ", copyright " + copyright + "\n";
        
        }

    protected String title;
    protected String author;
    protected int copyright;
    protected String loanedTo;
    protected LocalDate dueDate;
}
