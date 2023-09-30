//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/
package library;

import java.time.Duration;

public class Video extends Publication {

    public class InvalidRuntimeException extends ArithmeticException {
        public InvalidRuntimeException(String title, int runtime) {
            super(title + " has invalid runtime " + runtime);
        }
    }
	public Video(String title, String author, int copyright, int runtime){
		
		super(title, author, copyright);
		this.runtime = Duration.ofMinutes(runtime);
        if(runtime <= 0) {
            throw new InvalidRuntimeException(title, runtime);
        }
	}

    public void checkIn() {
        loanedTo = null;
        System.out.println("Thank you for returning: \"" 
        + title + "\" by " + author + ", copyright " + copyright + "runtime " + runtime.toMinutes() + "minutes");
    }
	

@Override
public String toString() {
	if(loanedTo != null) {
            return "VIDEO: \"" + title + "\" by " + author + ", copyright " + copyright + ", runtime " + runtime.toMinutes() + " minutes" + "\n ...This video is loaned to " + loanedTo + " until: " + dueDate;
        }
        else {
            return "VIDEO: \"" + title + "\" by " + author + ", copyright " + copyright + ", runtime " + runtime.toMinutes() + " minutes";
        }
}
private Duration runtime;
}

/*public void ArithmeticException() {
    public void ArithmeticException(String s) {
        this.s = s;
    }

    public String s;
} */




