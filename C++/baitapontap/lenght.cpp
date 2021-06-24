#include <iostream>
#include <cstring>
using namespace std;
void output(char A[]){
	for(int i; i < strlen(A); i++)
		cout << A[i];
}
void lenghtA(char A[], int n){
	n = strlen(A);
	cout << "Do dai chuoi la: " << n << endl;
}
void remove(char A[],int n, int k){
	n = strlen(A);
	for(int i = k; i < n; i++){
			A[i] = A[i+1];
	}
}
void checkRemove(char A[], int n, int k){
	cout << "Nhap vi tri xoa: ";
	n = strlen(A);
	cin >> k;
	for(int i = 0; i < n; i++){
		if(i == k)
			remove(A,n,k);
	}
	n--;
}
main(){
	int n;	
	char xau[200];
	cout << "Nhap xau: "; 
	gets(xau);
	lenghtA(xau, 200);
	checkRemove(xau, 200, n);
	output(xau);
}
