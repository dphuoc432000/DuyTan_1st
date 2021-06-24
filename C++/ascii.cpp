#include <iostream>
#include <cstring>
using namespace std;
main()
{
	int x = 0;
	while (x < 255)
	{
		for (int i = 0; i < 255;i++)
		{
			x++;
			cout  << i << "\t"<< (char)x << endl;
		}
	
	}
	
}
