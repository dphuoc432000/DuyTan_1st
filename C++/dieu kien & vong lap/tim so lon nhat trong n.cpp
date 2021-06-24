#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, a, max = n%10, dem = 0;
	cin >> n;
	if(n < 0)
	{
		n = n * (-1);
	}
	while (n != 0)
	{
		a= n % 10;
		if(a % 2== 0)
		{
			if(max < a)
			{
				max = a;
			}
			dem ++;
		}
		n = n/10;
	}
	if(dem == 0)
	{
		cout << "khong tim thay";
	}
	cout << max;
}
