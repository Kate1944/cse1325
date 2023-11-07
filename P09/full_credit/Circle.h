#ifndef __CIRCLE
#define __CIRCLE

class Circle {
    public:
        Circle(double radius);
        std::string name();
        double area();
        std::string to_string();
    private:
        double _radius;
};

#endif