//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/
package library;
import java.time.Duration;

public class Video extends Publication {
	public Video(String title, String author, int copyright, int runtime){
		
		super(title, author, copyright);
		this.runtime = Duration.ofMinutes(runtime);
	}
	

@Override
public String toString() {
	if(loanedTo != null) {
            return "\"" + title + "\" by " + author + ", copyright " + copyright + ", runtime " + runtime + "\n ...This video is loaned to " + loanedTo + " until: " + dueDate + "\n";
        }
        else {
            return "\"" + title + "\" by " + author + ", copyright " + copyright + ", runtime " + runtime + "\n";
        }
}
private Duration runtime;
}

