#include "Index.h"
#include "Location.h"
#include <iostream>
#include <set>

typedef std::string Word;
typedef std::set Locations;

void add_word(Word word, std::string filename, int line) {

}

std::ostream& operator<<(std::ostream& ost, const Index& index) {
    ost <<  location._filename << ' line '
        <<  location._line;
        
    return ost;
}