#include "Index.h"
#include <iostream>

void add_word(Word word, std::string filename, int line) {

}

std::ostream& operator<<(std::ostream& ost, const Index& index) {
    ost << std::setfill('0') 
        << std::setw(2) << time._hour << ':'
        << std::setw(2) << time._minute << ':'
        << std::setw(2) << time._second;
    return ost;
}