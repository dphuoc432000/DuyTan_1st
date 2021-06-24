#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, i=0 , s=0;
	cout << "Nhap so n: ";
	cin >> n;
	while (n != 0){
		i= n % 10;
		n=n/10;
		s= s+i;
		if(n % s != 0)
			return"yes";
		else
			return"no";
	}
	cout << "Tong cua so nguyen N: " << s;
}
