#include <cmath>
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
main()
{
	float a, b, x;
	cout << "Nhap hai so a va b:";
	cin >> a >> b;
	if (a==0){
		if (b!=0){
			cout << "Phuong trinh vo nghiem.";
		}else{
			cout << "Phuong trinh vo so nghiem.";
		}
	}else {
		x= -b/a;
		cout << "nghiem cua x la: " << x;
	}
}
