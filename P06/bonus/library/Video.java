//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/
package library;
import java.time.Duration;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

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

    public void save(BufferedWriter bw) throws IOException {
        super.save(bw);
        long minutes = runtime.toMinutes();
        bw.write("" + minutes + '\n');
    }

    public Video(BufferedReader br) throws IOException {
        super(title, author, copyright);
        long minutes = Integer.parseInt(br.readLine());
        runtime = Duration.ofMinutes(minutes);
    }

@Override
public String toString() {
    return toStringBuilder("Video", ", runtime " + runtime.toMinutes() + " minutes");
}
private Duration runtime;
}




