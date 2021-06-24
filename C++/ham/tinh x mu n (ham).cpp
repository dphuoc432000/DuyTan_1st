#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
float XMU(float x, int n, int s)
{
	s =pow(x,n);
	return s;
}
main()
{
	int x, y , z;
	cout  << "nhap hai so x va y: ";
	cin >> x >> y;
	cout << XMU(x,y,z);
}
