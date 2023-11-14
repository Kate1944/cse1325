#include "Time.h"
#include <iostream>
#include <iomanip>

Time::Time(int hour, int minute, int second) : 
    _hour{hour}, _minute(minute), _second{second} {}

int compare(Time time) {
    if(_hour < time._hour) return -1;
    if(_hour > time._hour) return 1;
    if(_minute < time._minute) return -1;
    if(_minute > time._minute) return 1;
    if(_second < time._second) return -1;
    if(_second > time._second) return 1;
}

inline bool operator==(const Time& time) {
    return (compare(time) == 0);
}

inline bool operator!=(const Time& time) {
    return (compare(time) !=0);
}
inline bool operator<(const Time& time) {
    return (compare(time) < 0);
}
inline bool operator>(const Time& time) {
    return (compare(time) > 0);
}
inline bool operator<=(const Time& time) {
    return (compare(time) <= 0);
}
inline bool operator>=(const Time& time) {
    return (compare(time) >= 0);
}

Time operator+(Time time) {
    return time + time;
}

/*Time& operator++(Time& time) {
    Time time {*this};
    ++*this;
    return time;

} */

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