#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, i = 2;
	cin >> n;
	if(n < 2)
	{
		cout << "no";
	}
	for (int i = 2; i <= sqrt(n); i++)
	{
		if(n % i == 0)
		{
			cout << "no";
			
		}
		else
		{
			cout << "yes";
		}
	}
	
}
