#include <iostream>
using namespace std;
main()
{
	int h, p, g, s;
	cout << endl;
	cout << "Moi ban nhap thoi gian: ";
	cin >> h >> p >> g;
	cout << endl;
	cout << "Moi ban nhap giay cong them: ";
	cin >> s;
	g= g+ s;
	if(g >= 60 )
	{
		g = g % 60;
		p++;	
	}
	if (p >= 60)
	{
		p = p % 60;
		h++;
	}
	if (h >= 24)
	{
		h= h% 24;
	}
	cout << h << ":" << p << ":" << g;
}
