#include <iostream>
#include <cstring>
#include <cmath>
using namespace std;
main()
{
	char x[255];
	char t;
	int dem = 0;
	cout << "Moi ban nhap chuoi: ";
	cin.getline (x,255);
	for(int i = 0; i < strlen(x); i++)
	{
		if (x[i]==t)
		dem++;
	}
	cout << dem;
}
