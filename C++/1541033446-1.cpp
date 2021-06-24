#include <iostream>
using namespace std;
int timTrongMang(int A[], int n, int x)
{
	for(int i = 0; i < n; i++)
	{
		if(A[i] == x)
			return true;
	}
	return false;
}

void nhapMang(int A[], int &n)
{
	cin >> n;
	for(int i = 0; i < n; i++)
	{
		int x;
		cin >> x;
		if(timTrongMang(A, i, x) == true)
		{
			cout << "Da trung, nhap lai: ";
			i--;
		}
		else
		{
			A[i] = x;
		}
	}
}

void xuatMang(int A[], int n)
{
	for(int i = 0; i < n; i++)
	{
		cout << A[i] << " ";
	}
}
void giaoMang(int A[], int nA, int B[], int nB)
{
	for(int i = 0; i < nB; i++)
	{
		if(timTrongMang(A, nA, B[i]) == true)
		{
			cout << B[i] << " ";
		}
	}
}
void run()
{
	int A[255], B[255], nA, nB;
	cout << "Moi ban nhap Mang A" << endl;
	nhapMang(A, nA);
	cout << "Moi ban nhap Mang B" << endl;
	nhapMang(B, nB);
	cout << "\nXuat mang A" << endl;
	xuatMang(A, nA);
	cout << "\nXuat mang B" << endl;
	xuatMang(B, nB);
	cout << "\nGiao cua 2 mang la" << endl;
	giaoMang(A, nA, B, nB);
}



main()
{
	run();
}
