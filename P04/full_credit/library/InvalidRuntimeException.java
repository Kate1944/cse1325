//Copyright 2023 Kaitlin Martin <https://github.com/Kate1944/cse1325.git>
//Copyright 2023 George F. Rice <https://github.com/prof-rice>

/*This file is part of the Library Management System and is licensed
under the terms of the Gnu General Public License version 3 or
(at your option) any later version, see <https://www.gnu.org/licenses/>.
*/
package library;
import java.lang.ArithmeticException;

public class InvalidRuntimeException {
    public InvalidRuntimeException(String s) {
        //super(title, author, copyright, runtime);
        this.s = s;
    }
public String s;
}