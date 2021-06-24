#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
main()
{
	int a, b, c, d;
	cout << "Nhap hai so a va b: ";
	cin >> a >> b;
	d= a*b;
	while (a!=b){
		if ( a > b ){
			a = a - b;
		}else {
			b = b - a ;
		}
	
		c= d/a;
	}
	cout << a << " la UCLN."<< endl;
	cout << c << " la BCNN" ;
}	
