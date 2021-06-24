#include <iostream>
#include <cstring>
using namespace std;
void xuatChuoi(char A[])
{
	for (int i = 0; i < strlen(A); i++)
	{
		cout << A[i];
	}
}
void xoaSpace(char A[], char B[])
{
	for (int i = 0; i < strlen(A); i++)
	{
		if (A[i] == ' ')
		{
			i-- ;
			B[i] = A[i - 1 ];
		}
	}
	cout << B[i];
}
main()
{
	char A[255], B[255];
	cout << "Moi ban nhap: ";
	cin.getline(A,255);
	xuatChuoi(A);
	xoaSpace(A, B);
}
