#include <iostream>
#include <cstring>
#include <cstring>
#include <fstream>
using namespace std;
main()
{
	float n;
	cout << "nhap vao tong diem mon lap trinh co so: ";
	cin >> n;
	if (n >= 8.5){
		cout << n << "Loai A.";
	}else if( n >=7){
		cout << n << "Loai B.";
	}else if ( n>= 5.5){
		cout << n<< "Loai C.";
	}else if ( n >= 4){
		cout << n << "Loai D.";
	}else{
		cout << n << "Loai F.";
	}
}
