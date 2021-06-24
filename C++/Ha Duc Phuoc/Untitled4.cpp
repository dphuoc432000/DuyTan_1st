#include <iostream>
#include <cmath>
#include <cstring>
using namespace std;
void nhapMang(int A[],int &n)
{
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> A[i];
	}
}
void xuatMang(int A[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << "\t"<< A[i];
	}
}
void sapXep(int A[], int n)
{
	for (int i = 0; i < n - 1; i++)
	{
		for(int j = i + 1; j< n; j++)
		{
			if( A[i] < A[j])
			{
				int q = A[i];
				A[i] = A[j];
				A[j] = q;	
			}
		}
	}
	xuatMang(A, n);
}
main()
{
	int A[255], n, B[255], s;
	cout << "Moi ban nhap n: ";
	nhapMang(A,n);
	cout << endl;
	nhapMang(B,s);
	cout << endl;
	cout << "Mang giam dan: " << endl;
	sapXep(A,n);
	cout << endl;
	sapXep(B,s);
	
	
	
}
