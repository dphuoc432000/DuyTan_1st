#include <iostream>
using namespace std;
void nhap(int A[], int &n)
{
	cin >> n;
	for (int i = 0; i < n; i++)
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
void xoa(int A[], int &n, int vitri)
{
	for(int i = vitri; vitri < n -1; i++)
	{
		A[i]= A[i+ 1];
	}
	n --; 
}
main()
{
	int A[255],n, x;
	nhap(A,n);
	cin >> x;
	for(int i = 0; i < n; i++)
	{
		if(A[i] == x)
		{
			xoa(A,n,i);
			i--	;
		}	
	}
	xuat(A,n);
}
