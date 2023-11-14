#ifndef __TIME_H
#define __TIME_H

class Time : public Time {
    public:
        Time(int hour, int minute, int second);
        Time operator+(Time time);
        Time& operator++();
        Time operator++(int);

        bool operator==(Time& time);
        bool operator!=(Time& time);
        bool operator<(Time& time);
        bool operator>(Time& time);
        bool operator<=(Time& time);
        bool operator>=(Time& time);

        friend std::ostream& operator<<(ostream& ost, Time& time);
        friend std::istream& operator>>(istream& ist, Time& time);


    private:
        int _hour;
        int _minute;
        int _second;
};

#endif