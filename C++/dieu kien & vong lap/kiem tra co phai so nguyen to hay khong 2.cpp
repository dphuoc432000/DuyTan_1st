#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, i= 2;
	cout << "Nhap so n: ";
	cin >> n;
	if (i <= n/2){
		while (n % i ==0){
			i = i + 1;
		}
	}else{
		cout << n << " la so nguyen to.";
	}
}
