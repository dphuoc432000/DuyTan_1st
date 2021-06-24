#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
float maxbaso(float a , float b, float c)
{
	if (a > b && a > c ){
		return a;
	}
	if (b > a && b > c){
		return b;
	}
	if (c > a && c > b){
		return c;
	}
}
float minbaso(float a , float b, float c)
{
	if (a < b && a < c ){
		return a;
	}
	if (b < a && b < c){
		return b;
	}
	if (c < a && c < b){
		return c;
	}
}
main()
{
	float x, y , z;
	cout << "nhap vao 3 so: ";
	cin >> x >> y >> z;
	cout << maxbaso(x,y,z) << endl;
	cout << minbaso(x,y,z);
}
