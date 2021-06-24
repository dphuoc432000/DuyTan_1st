#include <iostream>
#include <cstring>
using namespace std;
void xuatChuoi(char A[])
{
	for (int i = 0; i < strlen(A);i++)
	{
		cout << A[i];
	}
}
int space(char A[])
{
	for (int i = 0; i < strlen(A); i++)
	{
		if (A[i] = ' ')
			return i;
	}
}
void hoaThanhThuong(char c )
{
	int x = (int) c;
	if(x >= 65 && x <= 90) 
	{
		x = x + 32;
		cout << x;
	}
	cout << (char)x;
}
void run()
{
	char A[255],c;
	cin.getline(A,255);
	
	xuatChuoi(A);
	hoaThanhThuong(c);
}
main()
{
	run();
}

