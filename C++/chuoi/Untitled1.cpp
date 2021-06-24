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
int findLastSpace(char A[])
{
	for (int i = strlen(A) - 1; i >= 0; i --)
	{
		if (A[i] == ' ')
			return i;
	}
}
void createFistName(char A[], char B[])
{
	int lastSpace = findLastSpace(A);
	for (int i = 0; i < lastSpace; i ++ )
	{
		B[i] = A[i];
	}
	cout << "Ho lot: ";
	B[lastSpace] = '\0';
}
void createLastName(char A[], char C[])
{
	int lastSpace = findLastSpace(A);
	int lenA = strlen (A);
	for (int i = 0; i < lenA - lastSpace; i++)
	{
		C[i] = A[lastSpace + 1 + i];
	}
	cout << "Ten: ";
}
void run()
{
	char hoVaTen[255], hoLot[255], Ten[255];
	cin.getline(hoVaTen,255);
	createFistName (hoVaTen, hoLot);
	createLastName (hoVaTen, Ten);
	cout << xuatChuoi(hoLot);
	cout << endl;
	cout << xuatChuoi(Ten);
}
main()
{
	run();
}
