#include <iostream>
#include <vector>
#include <string>
#include <cctype>

//creates two vectors:
//caps on the stack
//no_caps on the heap
int main (int args, char* argv) {
    //std::string current{argv[1]};
    //getline(cin, s1);
    std::vector<char> caps;
    std::vector<char> no_caps;

    for(int i=2; i<args; i++) {
        if (isupper(argv[i])) {
            caps.push_back(argv[i]);
        }
        else {
            no_caps.push_back(argv[i]);
        }
    }

    std::cout << "Capitalized:\n";
    for(auto i : caps) {
        std::cout << i << std::endl;
    }

    std::cout << "Lower Case:\n";
    for(auto i : no_caps) {
        std::cout << i << std::endl;
    }

}