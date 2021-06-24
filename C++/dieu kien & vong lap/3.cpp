#include <iostream>
#include <string>
#include <cmath>
#include <fstream>
using namespace std;
main()
{
	int n, i = 1, s = 1;
	cout << "Nhap so n: ";
	cin >> n;
	if (i <= n / 2){
		while (n % i == 0){
			s = s + i;
			i = i + 1;
			cout << "Tong cac uoc so tu 1 den" << n << s; } 
	}
	 
}
