#ifndef __SHAPE
#define __SHAPE
#include <iostream>

class Shape {
    public:
        std::string name();
        double area();
        std::string to_string();

};

#endif