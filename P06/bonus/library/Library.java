//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/

package library;

import java.util.ArrayList;
public class Library {

    public Library (String name) {
        this.name = name;
    }

    //note: attempting to allow Library.java to access checkIn() methods
    /*public Video video;
    public Publication publication = null; */

    public void addPublication(Publication publication) {
        publications.add(publication);
    }   

    public void checkOut(int publicationIndex, String patron) {
        publications.get(publicationIndex).checkOut(patron);
    } 
    
    //error: this.publication can't be null
    public void checkIn(int publicationIndex) {
        publications.get(publicationIndex).checkIn();
        //publication.checkIn();
        //video.checkIn();
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder(name + "\n\n");
        for(int i = 0; i < publications.size(); i++) {
            sb.append("" + i + ") " + publications.get(i).toString() + "\n");
        }
        return sb.toString();
    }

    private String name;
    private ArrayList<Publication> publications = new ArrayList<>();
}