#ifndef __INDEX_H
#define __INDEX_H

#include <iostream>
#include <map>
#include <set>

typedef std::string Word;
typedef std::set<Location> Locations;

class Index {
    public:
        void add_word(Word word, std::string filename, int line);
        friend std::ostream& operator<<(ostream& ost, const Index& index);

    private:
        std::map<Word, Locations> _index;
};

#endif