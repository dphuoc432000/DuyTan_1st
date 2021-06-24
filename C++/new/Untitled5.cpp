#include <iostream>
#include <cstring>
#include <cmath>
#include <fstream>
using namespace std;
ofstream xuat("xuat.txt");
ifstream doc("xuat.txt");
void nhap(int A[], int &n)
{
	for(int i = 0 ; i < n ; i ++ )
	{
		cin >> A[i];
	}
}
int checkNT(int A[],int n)
{
	for (int i = 0; i < n; i ++ )
	{
		if(A[i] < 2)
		{
			return false;
		}
		for(int j = 2; j <= A[i]/2; j++)
		{
			if(A[i] % i == 0 )
			{
				return false;
			}
		}
		return true;
	}
}

void luachon(int A[], int n)
{
	for(int i = 0; i < n; i++)
	{
		if(A[i] > 2 && A[i] < 11)
		{
			xuat << A[i] << " " << endl;
		}
	}
}

main()
{
	int A[255], n;
	cin >> n;
	nhap(A,n);
	luachon(A,n);
	cout << endl;
}
