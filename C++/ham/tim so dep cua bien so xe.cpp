
#include <iostream>
#include <cmath>
using namespace std;
int checkSoNT(int n)
{
	if(n < 2)
		return false;
	for(int i = 2; i <= sqrt(n); i++)
	{
		if(n % i == 0)
		{
			return false;
		}
	}
	return true;
}
int checkDx(int n)
{
	int i = 1, kq = 0;
	while(i <= n)
	{
		int a = (n / i) % 10;
		kq = kq * 10 + a;
		i = i * 10;
	}
	if(kq == n)
		return true;
	else
		return false;
}
int checkDiem(int n)
{
	int tong = 0, i = 1;
	while(i <= n)
	{
		int a = (n / i) % 10;
		tong = tong + a;
		i = i * 10;
	}
	if(tong % 10 == 9)
		return true;
	else
		return false;
}
void run()
{
	for(int i = 10000; i <= 99999; i++)
	{
		if(checkSoNT(i) == true && checkDx(i) == true && checkDiem(i) == true) 
		{
			cout << i << endl;
		}
	}
}
main()
{
	run();
}
