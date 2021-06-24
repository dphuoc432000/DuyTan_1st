#include <cmath>
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n;
	cout << "Nhap so nguyen n: ";
	cin >> n;
	if (n % 2 == 0){
		cout << n << " la so chan.";
	} else{
		cout << n << " la so le.";
	}
}

