#include <iostream>
#include <cstring>
#include <cmath>
using namespace std;
void nhapMang(int A[], int &n)
{
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> A[i];
	}
}
void xuatMang(int A[], int n)
{
	for (int i = 0; i < n ; i++)
	{
		cout << A[i];
	}
}
void tongChan(int A[], int n)
{
	int tong = 0;
	for (int i = 0; i < n ; i++)
	{

		if(A[i] % 2==0 && A[i] > 0)
		{
			tong = tong + A[i];
		}
	}
	cout << tong;	
}
int doiXung(int A[],int n)
{
	for (int i = 0; i < n ; i++)
	{
		if(A[i]==A[n-i-1])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
main()
{
	int A[255], i= 0, n;
	cout << "Moi ban nhap so phan tu n: " ;
	nhapMang(A,n);
	cout << endl;
	cout << "Tong so chan va nguyen duong: ";
	tongChan(A,n);
	cout << endl;
	if(doiXung(A,n) == true)
	{
		cout << "la mang doi xung.";
	}
	else
	{
		cout << "khong phai mang doi xung.";
	}
}
