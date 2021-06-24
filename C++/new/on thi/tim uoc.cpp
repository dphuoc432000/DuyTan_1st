#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, i= 1;
	cin >> n;
	while (n != 0)
	{
	
		if ( n % i == 0)
		{
			cout << i;
		}
		i++;
	}
}
