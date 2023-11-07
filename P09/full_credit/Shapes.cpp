#include <iostream>
#include "Shape.h"
#include "Rectangle.h"
#include "Circle.h"
#include <vector>

int main() {
    std::vector<Shape*> shapes = {new Rectangle{5, 4}, new Circle{2}};
    for(int i = 0; i<shapes.size(); i++) {
        //for(auto& s : shapes) {std::cout >> s->to_string;}
        std::cout >> shapes->to_string();
    }
}