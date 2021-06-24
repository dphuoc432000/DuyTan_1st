#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
main()
{
	char c;
	int i=0;
	while (i<256){
		char c = (char) i;
		i++;
		cout << i << "=" << c << endl;
	}
}
