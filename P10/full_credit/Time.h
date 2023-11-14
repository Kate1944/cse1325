#ifndef __TIME_H
#define __TIME_H

class Time{
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

        friend std::ostream& operator<<(std::ostream& ost, Time& time); //const?
        friend std::istream& operator>>(std::istream& ist, Time& time);


    private:
        void rationalize();
        int compare(Time time);

        int _hour;
        int _minute;
        int _second;
};

#endif