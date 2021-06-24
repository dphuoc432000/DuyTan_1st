#include <cmath>
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
main()
{
	float a, b, c, d;
	cout << "Nhap 4 so a b c d:";
	cin >> a >> b >> c >> d;
	if (a>b && a>c && a>d){
		cout <<  a << " la so lon nhat."  << endl;
	}
	if (b>a && b>c && b>d){
		cout <<  b << " la so lon nhat."  << endl;
	}
	if (c>a && c>b && c>d){
		cout <<  c <<" la so lon nhat." << endl;
	}
	if (d>a && d>c && d>b){
		cout <<  d <<" la so lon nhat." << endl;
	}
	if (a<b && a<c && a<d){
		cout << a << " la so nho nhat." ;
	}
	if (b<a && b<c && b<d){
		cout << b<< " la so nho nhat.";
	}
	if (c<a && c<b && c<d){
		cout << c << " la so nho nhat.";
	}
	if (d<a && d<c && d<b){
		cout << d << " la so nho nhat." ;
	}
}
