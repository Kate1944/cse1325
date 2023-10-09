//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/

package library;
import java.time.LocalDate;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

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

    public void save(BufferedWriter bw) throws IOException{
        bw.write(title + '\n');
        bw.write(author + '\n');
        bw.write("" + copyright + '\n');
        //bw.write("" + loanedTo + '\n');
        //bw.write("" + dueDate + '\n');
        if(loanedTo == null) {
            bw.write("Checked in" + '\n');
        }
        else {
            bw.write("Checked out" + '\n');
            loanedTo.save(bw);
            int year = dueDate.getYear();
            int month = dueDate.getMonthValue();
            int day = dueDate.getDayOfMonth();
            bw.write("" + year + 'n');
            bw.write("" + month + '\n');
            bw.write("" + day + '\n');

        }
    }
    public Publication(BufferedReader br) throws IOException {
        this.title = br.readLine();
        this.author = br.readLine();
        this.copyright = Integer.parseInt(br.readLine());
        loanedTo = new Patron(br);
        this.year = Integer.parseInt(br.readLine());
        this.month = Integer.parseInt(br.readLine());
        this.day = Integer.parseInt(br.readLine());
    } 

    public void checkOut(Patron patron) {
        loanedTo = patron;
        dueDate = LocalDate.now().plusDays(LOAN);
    }

    public void checkIn() {
       loanedTo = null;
       dueDate = null;
       System.out.println("Return successful!");
       //System.out.println("Thank you for returning: \"" + title + "\" by " + author + ", copyright " + copyright);
    } 

    protected String toStringBuilder(String pre, String mid) {
        return pre + " \"" + title + "\" by " + author + ", copyright " + copyright 
        + mid + ((loanedTo != null) ? "\n     : loaned to " + loanedTo + " until " + dueDate 
                                    : "");
    }

    @Override
    public String toString() {
            return toStringBuilder("Book", "");
        }

    private String title;
    private String author;
    private int copyright;
    private Patron loanedTo;
    private LocalDate dueDate;
}