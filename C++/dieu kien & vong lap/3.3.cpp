#include <cmath>
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n;
	cout << "Nhap so tuoi cua mot nguoi: ";
	cin >> n;
	if(n <= 18){
		cout << "Nguoi do la tuoi thieu nien.";
	}else if (n<=39){
		cout << "Nguoi do la thanh nien.";
	}else if (n<=60){
		cout << "Nguoi do la trung nien.";
	}else{
		cout << "Nguoi do la lao nien.";
	}
}
