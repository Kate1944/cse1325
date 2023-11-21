#ifndef __LOCATION_H
#define __LOCATION_H

class Location {
    public:
        Location(std::string filename, int line);
        
        inline bool operator==(const Location& location);
        inline bool operator<(const Location& location);
        inline bool operator!=(const Location& location);
        inline bool operator>(const Location& location);
        inline bool operator<=(const Location& location);
        inline bool operator>=(const Location& location);

    private:
        int compare(Location& location);
        std::string _filename;
        int _line;

};

#endif