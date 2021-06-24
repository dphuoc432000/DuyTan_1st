#include <iostream>
#include <fstream>
#include <cmath>
#include <cstring>
using namespace std;
void nhapMang(int A[], int &n)
{
	cin >> n;
	{
		for(int i=0; i < n; i++){
			cin >> A[i];
		}
	}
}
void xuatMang(int A[], int n)
{
	for (int i=0; i < n; i++){
			cout  << A[i];
	}
}
main()
{
	int A[255], n;
	nhapMang(A,n);
	cout << "Xuat mang: " << endl;
	xuatMang(A,n);
	
}
