#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, gt=1 , i=1;
	cout << "Moi ban nhap n: ";
	cin >> n;
	if(n <= 0)
	{
		cout << "Moi ban nhap lai: ";
		cin >> n;
	}
	while (i <= n)
	{
	
		gt = gt * i;
		i++;
	}
	cout << gt;
}
