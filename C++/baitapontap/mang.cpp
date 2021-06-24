#include <iostream>
using namespace std;
void input(int a[], int n){
	for(int i = 0; i < n; i++){
		cout << "Phan tu thu " << i << ": "; 
		cin >>a[i];
	}
}
void output(int a[], int n){
	for(int i = 0; i < n; i++)
		cout << a[i] << " ";
}
void checkRemove(int a[], int n){
	int k;
	cout << "Nhap vi tri can xoa: ";
	cin >> k;
	for(int i = k; i <= n; i++ )
		a[i] = a[i + 1];
	n--;
	output(a,n);
}
void increase(int a[], int n){
	for(int j = 0; j < n - 1; j++)
		for(int i = 0; i < n - 1; i++){
			if(a[i] > a[i + 1]){
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
	output(a,n);
}void add(int a[], int n){
	int k;
	cout << "Nhap vi tri can them: ";
	cin >> k;
	int number;
	cout << "Nhap vao gia tri: ";
	cin >> number;
	for(int i = k; i < n; i ++){
		
		if(i == k){
			
		}
	}
}
main(){
	int n;
	cout <<  "Nhap so phan tu: ";
	cin >> n; 
	int a[n];
	input(a,n);	
	output(a,n);
	cout << endl;
	//checkRemove(a,n);
	//increase(a,n);
}
