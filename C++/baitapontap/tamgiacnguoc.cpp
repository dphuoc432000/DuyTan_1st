#include<iostream>
using namespace std;
main(){
	int h;
	cout << "Nhap n: ";
	cin >> h;
	for(int i = 1; i <= h; i++){
		for(int j = 1; j <= i - 1; j++)
			cout << "   ";
		for(int k = 1; k <= i + 1; k++)
			cout << " * ";
		for(int m = 1; m <= h - i; m++)
			cout << " * ";
		cout << endl;
	}
}
