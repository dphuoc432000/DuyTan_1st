#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, i = 1, s =1;
	cout << "Moi ban nhap so n: ";
	cin >> n;
	if ( n <= 0)
	{
		cout << "Moi ban nhap lai: ";
		cin >> n;
	}
	while (i <= n)
	{
		s= s * i;
		i ++ ;
	}
	cout << s << endl;
}
