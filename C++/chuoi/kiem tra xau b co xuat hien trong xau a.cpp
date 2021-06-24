#include <iostream>
#include <cstring>
using namespace std;
void xuatMang(char A[])
{
	for (int i = 0; i < strlen(A); i++)
	{
		cout << A[i];
	}
}
void ktXau(char A[], char B[])
{
	for(int i = 0 ; i < strlen(A); i++)
	{
		if (B[i]= A[i])
		{
			cout << "co";
		}
		cout << "khong";
	}
}
void run()
{
	char A[255], B[255];
	cin.getline (A,255);
	ktXau(A,B);
	xuatMang(A);
}
main()
{
	run();
}
