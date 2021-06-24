#include <iostream>
#include <cstring>
#include <fstream>
#include <cmath>
using namespace std;
main()
{
	int x, dem=0,i=1;
	while (i<= 1)
		{
		cout << "Nhap so nguyen: ";
		cin >> x;
		if (x % 2==0 && x != 0)	
		{
			dem= dem + 1;
		}
			if(x==0)
			{
				break;
			}
	}
	cout << "co" << dem << " so chan";
}
