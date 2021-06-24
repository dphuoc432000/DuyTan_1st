#include <iostream>
#include <cstring>
#include <cmath>
#include <fstream>
using namespace std;
void max10so(int x, int y, int z , int t, int h)
{
	if (x > y && x > z && x> t && x > h){
		return x;
	}
	if (y > x && y > z && y > t && y > h){
		return y;
	}
	if (z > x && z > y && z > t && z > h){
		return z;
	}
	if (t > x && t > z && t > y && t > h){
		return t;
	}
	if (h > x && h > z && h > y && h > t){
		return h;
	}
}
main()
{
	int a, b, c, d, e, f, g, h, i, j;
	cout << "nhap 10 so: ";
	cin >> a >> b >> c >> d >> e >> f >> g >> h >> i >> j;
	cout << max10so(max10so(a, b), max10so(c, d), max10so(e,f), max10so(g, h), max10so(i, j));
}
