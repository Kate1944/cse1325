#include "Index.h"
#include "Location.h"
#include <iostream>
#include <set>

typedef std::string Word;
typedef std::set Locations;


void add_word(Word word, std::string filename, int line) {

}

typedef std::map<Word, Locations> Index;
std::ostream& operator<<(std::ostream& ost, const Index& index) {
    for(const auto& [word, locations] : index) {
        std::cout << word << "" << locations;
    }
        
    return ost;
}