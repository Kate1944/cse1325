#include <iostream>
#include "Circle.h"
#include "math.h"


Circle::Circle(double radius)
         : _radius{radius} {}

//override this
std::string Circle::name() {
    return ("Circle of radius " + _radius + " and area " + area());
}

//override this
double Circle::area() {
    return (M_PI*_radius*_radius);
}