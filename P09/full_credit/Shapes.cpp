#include <iostream>
#include "Shape.h"
#include "Rectangle.h"
#include "Circle.h"
#include <vector>

int main() {
    std::vector<Shape*> shapes = {Rectangle{5, 4}, Circle{2}};

}