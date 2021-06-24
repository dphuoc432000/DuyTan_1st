#include <iostream>
using namespace std;
void nhapMang(int A[], int &n)
{
	
	cin >> n;
	for (int i=1; i <=n; i++){
		cout << "nhap gia tri" << i++ << ": ";
		cin >> A[i];
	}
}
void xuatMang(int A[], int n)
{
	for (int i=0; i <=n; i++){
		cout << A[i];
	}
}
int xoaMang(int A[], int n , int k)
{
	for(int i=0; i <=n; i++){
		if (A[i] != k){
			return false; 
		}else{
			return true;
		}
	}
	return false;
}
main()
{
	int A[255], n,k;
	nhapMang(A,n);
	cin >> k;
	xuatMang(A,n);
	if (xoaMang(A,n,k)== false)
	cout << A[255];
}
