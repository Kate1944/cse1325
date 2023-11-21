#include "Location.h"
#include <iostream>

Location::Location(std::string filename, int line)
    : _filename{filename}, _line{line} {
      //rationalize(); 
}

int Location::compare(Location& location) {
    if(_filename < location._filename) return -1;
    if(_filename > location._filename) return  1;
    if(_line < location._line) return -1;
    if(_line > location._line) return  1;
    return 0;
}
