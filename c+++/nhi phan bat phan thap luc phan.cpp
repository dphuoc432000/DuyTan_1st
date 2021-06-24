#include<iostream>
using namespace std;
void xuat(int a[], int n){
	for(int i = i - 1 ; i >= 0; i--)
		cout << a[i];
}
void nhiphan(int a[],int s){
	int i = 0;
	while(s != 0){
		a[i]= s % 2;
		s = s/2;
		i++;
	}
}
void batphan(int a[], int s){
	int i = 0;
	while(s != 0){
		a[i] = s % 8;
		s = s/8;
		i++;
	}
}
void thaplucphan(int a[], int s){
	int i = 0, j = 0;
	while(s != 0){
		a[j] = s % 16;
		s = s / 16;
		j++;
	}
	for(int i = j - 1; i >= 0; i--){
		if(a[i] < 10)
			cout << a[i];
		else
			switch(a[i]){
				case 10: cout << "A";
				break;
				case 11: cout << "B";
				break;
				case 12: cout << "C";
				break;
				case 13: cout << "D";
				break;
				case 14: cout << "E";
				break;
				case 15: cout << "F";
				break;
			}
	}
}
main(){
	int a[20];
	for(int i = 1; i <= 256; i++){
		cout << "Enter n: ";
		cout << i << endl;
		cout << "nhi phan: ";
		nhiphan(a,i);
		xuat(a,20);
		cout << endl;
		cout << "bat phan: ";
		batphan(a,i);
		xuat(a,20);
		cout << endl;
		cout << "thap luc phan: ";
		thaplucphan(a, i);
		cout << endl;
	}
	
}
