#include "Index.h"
#include "Location.h"
#include <fstream>
#include <iostream>

int main(int argc, char* argv[]) {
    std::ifstream ist{std::string{argv[1]}};
    if (!ist) throw std::runtime_error{"Unable to open file"};
    std::string s;
    while(std::getline(ist, s)) {
        std::cout << s << std::endl;
    }
}