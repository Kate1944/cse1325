#include <iostream>
#include "Shape.h"

class Shape {
    public:
        virtual std::string name() {
            return "Shape";
        }

        virtual double area() {
            return 0.0;
        }

        virtual std::string to_string() {
            //returns the name() concatenated with area()
            return (name() + " with area " + area());
        }
};
