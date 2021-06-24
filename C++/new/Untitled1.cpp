#include <iostream>
using namespace std;
int nhapMang(int A[], int &n)
{
	for(int i = 0; i < n; i ++ )
	{
		cin >> A[i];
	}
}
void Max(int A[], int n)
{
	int max = A[0];
	for(int i = 0; i < n; i++)
	{
		if(max < A[i])
		{
			max = A[i];
		}
	}
	cout << max;
}
main()
{
	int A[255], n;
	cout << "moi ban nhap so phan tu: ";
	cin >> n;
	cout << "Cac phan tu: ";
	nhapMang(A,n);
	Max(A,n);
	
}
