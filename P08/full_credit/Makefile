CXXFLAGS += --std=c++17

all: hello_me hello_all

hello: hello_me.cpp
	$(CXX) $(CXXFLAGS) hello_me.cpp 

hello_all: hello_all.cpp
	$(CXX) $(CXXFLAGS) hello_all.cpp 

clean:
	-rm -f *.o *.gch *~ a.out hello_me hello_all