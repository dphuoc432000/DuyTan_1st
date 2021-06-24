#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, GT= 1;
	cout << "Moi ban nhap n: ";
	cin >> n;
	if(n <= 0 )
	{
		cout << "Moi ban nhap lai: ";
		cin >> n;
	}
	for(int i = 1; i <= n ; i++)
	{
		GT= GT * i;
	}
	cout << GT;
}
