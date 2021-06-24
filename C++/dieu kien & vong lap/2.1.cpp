#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, i = 1, p = 1;
	cout << "Nhap so n: ";
	cin >> n;
	for (i = 1; i <= n; i = i + 1){
		p = p * i;
		cout << n << "!: " << p;
	}	
}
