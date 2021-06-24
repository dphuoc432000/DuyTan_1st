#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
main()
{
	int n, i=0, s=0;
	cout << "Nhap vao so n: ";
	cin >> n;
	while(i<=n){
		s= s+ i;
		i= i +1;
	}cout << "Tong la: " << s;
}
