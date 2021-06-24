#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
main()
{
	int n, a, i=1 , s=0;
	cout << "nhap n:" ;
	cin >> n;
	for (i; i<=n; i++){
		cin >> a;
		if (a % 2 == 0){
			s=s+ a;
		}
	}cout << "tong so chan la: "<< s;
}
