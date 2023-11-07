#include <iostream>
#include "Rectangle.h"


Rectangle::Rectangle(double height, double width)
         : _height{height}, _width{width} {}

//override this
std::string Rectangle::name() {
    return (_height + " by " + _width + " Rectangle with area " + area());
}

//override this
double Rectangle::area() {
    return (_height*_width);
}
