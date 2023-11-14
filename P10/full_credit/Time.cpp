#include "Time.h"
#include <iostream>
#include <iomanip>

Time::Time(int hour, int minute, int second) : 
    _hour(hour), _minute(minute), _second(second) {}

std::ostream& operator<<(std::ostream& ost, Time& time) {
    ost << std::setfill('0') << time._hour << ":" << 
    std::setfill('0') << time._minute << ":" <<
    std::setfill('0') << time._second;
    return ost;
}

std::istream& operator>>(std::istream& ist, Time& time) {
    ist >> time._hour;
    ist >> time._minute;
    ist >> time._second;
    return ist;
}