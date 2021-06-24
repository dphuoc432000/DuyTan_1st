#include <iostream>
using namespace std;
main()
{
	int n, max = 0;
	cin >> n;
	for(int i = 0 ; i <= n;i++)
	{
		if (max < i)
		{
			max = i;
		}
	}
	cout << max;
}
