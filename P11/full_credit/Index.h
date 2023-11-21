#ifndef __INDEX_H
#define __INDEX_H

class Index {
    public:
        void add_word(Word word, std::string filename, int line);
        friend std::ostream& operator<<(ostream& ost, const Index& index);

    private:
        map<Word, Locations> _index;
};

#endif