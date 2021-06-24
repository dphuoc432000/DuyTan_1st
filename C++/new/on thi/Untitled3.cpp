#include <iostream>
#include <cstring>
#include <fstream>
using namespace std;
ifstream doc("bai1.txt");
ofstream xuat("kq1.txt");
int demso(char A[])
{
	int dem = 0;
	for(int i = 0; i < strlen (A); i++)
	{
		if(A[i] == '0' ||A[i] == '1' ||A[i] == '2' ||A[i] == '3' ||A[i] == '4' ||A[i] == '5' ||A[i] == '6' ||A[i] == '7' ||A[i] == '8' || A[i] <= 9)
		{
			dem++;
		
		}
	}
	return dem;
}
main()
{
	char A[255];
	doc.getline(A,255);
	xuat << "ketquala: " << demso(A);
	
}
