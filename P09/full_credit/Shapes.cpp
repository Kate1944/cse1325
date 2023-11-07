#include <iostream>
#include "Shape.h"
#include <vector>

int main() {
    std::vector<Shape*> shapes = {new Rectangle{5, 4}, new Circle{2}};
}