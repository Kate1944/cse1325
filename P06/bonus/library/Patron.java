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

public class Patron {
    public Patron(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + '\n');
        bw.write(email + '\n');
    }

    public Patron(BufferedReader br) throws IOException{
        this.name = br.readLine();
        this.email = br.readLine();
    }


    @Override
    public String toString() {
        return name + " (" + email + ")";
    }

    private String name;
    private String email;
}