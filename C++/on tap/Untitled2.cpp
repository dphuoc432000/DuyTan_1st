#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, i=0;
	cout << "nhap so n: ";
	cin >> n;
	while (i <= n)
	{
		i++;
		if(n % i==0)
		{
			cout << i;
			cout << "";
		}
	}
}
