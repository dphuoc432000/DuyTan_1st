#include <iostream>
#include <cmath>
using namespace std;
void toigian(int a, int b, int &tu, int &mau, int n)
{ 
	for (int i; i <= n; i++)
	{
		tu = a;
		mau = b;
		if (a % i==0){
			cout << "tu: " << tu;
		}
		if (b % i == 0){
			cout << "mau:" << mau;
		}
	}
}
void nhapso(int a, int b)
{
	cin >> a >> b;  
}
void xuatso(int a, int b)
{
	cout << a << b;
}
main()
{
	int a, b, n, tu, mau ;
	cout << " moi ban nhap hai so a va b:";
	nhapso(a,b);
	xuatso(a,b);
	toigian (a,b,tu,mau,n);
	cout << "phan so toi gian: " << tu << " / " << mau; 
	
}
