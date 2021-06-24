#include <iostream>
#include <cmath>
using namespace std;
struct toaDo
{
	float x,y;
};
void nhap(toaDo A[],int n)
{
	cin >> n;
	for(int i = 0; i< n; i++)
	{
		
		cout << "nhap diem thu " << i +1;
		cout <<"Nhap x= ";
		cin >> A[i].x;
		cout << "Nhap y= ";
		cin >> A[i].y;
	}
}
void xuat(toaDo A[],int n)
{
	int doDai;
	cout << "STT\tx\ty\tdoDai\n";
	for (int i=0; i < n; i++)
	{
		doDai = sqrt(pow(A[i].x,2) + pow(A[i].y,2));
		cout << i+ 1 <<"\t" << A[i].x <<"\t" << A[i].y << "\t" << doDai << endl;
	}
}
main()
{
	toaDo A[50];
	int n;
	float doDai;
	nhap(A,n);
	xuat(A,n);
	//in n diem
}
