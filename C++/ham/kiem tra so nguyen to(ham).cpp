#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
int NGUYENTO(int n)
{
	if (n < 2){
		return false;
	}
	for (int i=2; i <= n/2; i++)
	{
		if (n%i==0)
		{
			return true;
		}
	}
	return true;
}
main()
{
	int a;
	cout << "Nhap so a:" ;
	cin >> a;
	if(NGUYENTO(a) == true){
		cout << a << " la so nguyen to.";
	}
	else{
		cout << a << " khong phai la so nguyen to.";
	}
	
}
