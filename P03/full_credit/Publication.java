import java.util.LocalDate;
public class Publication {
    public Publication (String title, String author, int copyright) {
        this.title = title;
        this.author = author;
        this.copyright = copyright;
    }
    //TODO: throw IllegalArgumentException

    public checkOut(String patron) {
        String patron = loanedTo;
        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(14);
        LocalDate dueDate = future;

    }

    public checkIn() {
       
    }

    public String toString() {
        if(loanedTo.equals(NULL)) {
            return "'" + title + "' by " + author + ", copyright " + copyright;
        }
        else {
            return "'" + title + "' by " + author + ", copyright " 
            + copyright + "...This book is loaned to " + loanedTo + "until: " + dueDate;
        }
        

    }

    private String title;
    private String author;
    private int copyright;
    private String loanedTo;
    private LocalDate dueDate;
}