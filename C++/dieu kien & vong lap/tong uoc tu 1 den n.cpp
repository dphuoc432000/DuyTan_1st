#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, s = 0, i = 1;
	cout << "nhap vao so n: ";
	cin >> n;
	while (i <= n / 2){
		if (n % i==0){
			s= s+i;
			i=i+1;
		}
	}
	cout << "Tong cac uoc tu 1 den " << n << " la: " << s;
}
