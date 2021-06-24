#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, a, max = 0 ;
	cout << "Moi ban nhap so n:";
	cin >> n;
	while (n >= 1)
	{
		a = n % 10;
		n = n / 10;
		cout << a << " ";
		if (max < a)
		{
			max = a;
			
		}
	}
	cout  << "So lon nhat trong n la:" << max;
}
