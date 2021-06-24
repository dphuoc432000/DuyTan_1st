#include <iostream>
#include <cstring>
using namespace std;
void xuatChuoi(char A[])
{
	for(int i = 0; i < strlen(A); i ++){
		cout << A[i];
	}
}
void xoaPhanTu(int A[], int &n, int vitrixoa)
{
	for(int i = vitrixoa + 1; i < n; i++){
		A[i-1]=A[i];
	}
	n--;
}
main ()
{
	char A[256];
	int n, k;
	cout << "Moi ban nhap ";
	cin.getline(A,256);
	xuatChuoi(A);
	xoaPhanTu(A, n, k);
}
