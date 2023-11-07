#ifndef __RECTANGLE
#define __RECTANGLE

class Rectangle {
    public:
        Rectangle(double height, double width);
        std::string name();
        double area();
        std::string to_string();
    private:
        double _height;
        double _width;
};

#endif