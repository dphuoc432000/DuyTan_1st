#include <iostream>
#include <cmath>
using namespace std;
void nhap(int A[],  int &n)
{
	for(int i = 0; i < n; i++)
	{
		cin >> A[i];
	}
}
void xuat(int A[], int n)
{
	for(int i = 0; i < n; i++)
	{
		cout << A[i] << " ";
	}
}
void tong(int A[], int n)
{
	int tong = 0;
	for (int i =0; i < n; i++)
	{
		if(A[i] % 2 !=0)
		{
			tong= tong + A[i];
		}
	}
	cout << tong;
}
int nt(int n)//checknt
{
	if(n < 2)
	{
		return false;
	}
	for(int i = 2 ; i < n; i++ )
	{
		if(n % i == 0)
		{
			return false;
		}
	}
	return true;
}
void innt(int A[], int n)// in ra so nt
{
	for (int i =0; i < n; i++)
	{
		if (nt(A[i]) == true)
		cout << A[i] << " ";
	}
}
void inknt (int A[], int n) // in ra khong phai so nguyen to
{
	for (int i =0; i < n; i++)
	{
		if (nt(A[i]) == false)
		cout << A[i] << " ";
	}
}
void sapXep(int A[], int n)
{
		inknt(A,n);
		innt(A,n);
}
main()
{
	int A[255], n;
	cin >> n;
	nhap(A,n);
	cout << endl;
	xuat(A,n); 
	cout << endl;
	tong(A,n);
	cout << endl;
	innt(A,n);
	cout << endl;
	sapXep(A,n);
	
}
