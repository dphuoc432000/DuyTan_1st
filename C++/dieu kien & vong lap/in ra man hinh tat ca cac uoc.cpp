#include <iostream>
#include <cstring>
#include <cmath>
#include <fstream>
using namespace std;
main()
{
	int n,i=0,u;
	cout << "nhap so n: ";
	cin >> n;
	while (i<=n){
		i++;
		if (n % i == 0){
				cout << i << endl;
		}
	}
}
