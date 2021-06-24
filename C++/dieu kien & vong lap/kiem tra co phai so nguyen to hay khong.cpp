#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, i=2;
	cout << "Nhap so n: ";
	cin >> n;
	if (n < 2){
		cout << "la so nguyen to.";
	}	
	while ( i <= n / 2){
		if (n%i==0){
			cout << n << " khong phai so nguyen to.";
			break;
		}else {
			i= i+ 1;
			i= 2;
		}	
	}cout << n << " la so nguyen to.";

}
