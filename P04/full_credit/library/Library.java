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

    public void addPublication(Publication publication) {
        publications.add(publication);
    }   

    public void checkOut(int publicationIndex, String patron) {
        publications.get(publicationIndex).checkOut(patron);
    } 
    

    @Override
    public String toString () {
        return name + "\n\n" + publications;
    }

    private String name;
    private ArrayList<Publication> publications = new ArrayList<>();
}